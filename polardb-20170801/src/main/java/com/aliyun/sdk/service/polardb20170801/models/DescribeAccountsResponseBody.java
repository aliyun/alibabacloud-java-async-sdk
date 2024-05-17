// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountsResponseBody</p>
 */
public class DescribeAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List < Accounts> accounts;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountsResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accounts
     */
    public java.util.List < Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Accounts> accounts; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        /**
         * The details of the account.
         */
        public Builder accounts(java.util.List < Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * The page number of the page returned.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountsResponseBody build() {
            return new DescribeAccountsResponseBody(this);
        } 

    } 

    public static class DatabasePrivileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        private DatabasePrivileges(Builder builder) {
            this.accountPrivilege = builder.accountPrivilege;
            this.DBName = builder.DBName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasePrivileges create() {
            return builder().build();
        }

        /**
         * @return accountPrivilege
         */
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        public static final class Builder {
            private String accountPrivilege; 
            private String DBName; 

            /**
             * The permissions that the account is granted on the database. Valid values:
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            public DatabasePrivileges build() {
                return new DatabasePrivileges(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDescription")
        private String accountDescription;

        @com.aliyun.core.annotation.NameInMap("AccountLockState")
        private String accountLockState;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountPasswordValidTime")
        private String accountPasswordValidTime;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("DatabasePrivileges")
        private java.util.List < DatabasePrivileges> databasePrivileges;

        private Accounts(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountLockState = builder.accountLockState;
            this.accountName = builder.accountName;
            this.accountPasswordValidTime = builder.accountPasswordValidTime;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.databasePrivileges = builder.databasePrivileges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountDescription
         */
        public String getAccountDescription() {
            return this.accountDescription;
        }

        /**
         * @return accountLockState
         */
        public String getAccountLockState() {
            return this.accountLockState;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountPasswordValidTime
         */
        public String getAccountPasswordValidTime() {
            return this.accountPasswordValidTime;
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return databasePrivileges
         */
        public java.util.List < DatabasePrivileges> getDatabasePrivileges() {
            return this.databasePrivileges;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountLockState; 
            private String accountName; 
            private String accountPasswordValidTime; 
            private String accountStatus; 
            private String accountType; 
            private java.util.List < DatabasePrivileges> databasePrivileges; 

            /**
             * The description of the account.
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * The locking state of the account. Valid values:
             * <p>
             * 
             * *   **UnLock**
             * *   **Lock**
             */
            public Builder accountLockState(String accountLockState) {
                this.accountLockState = accountLockState;
                return this;
            }

            /**
             * The name of the account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The validity period of the password.
             */
            public Builder accountPasswordValidTime(String accountPasswordValidTime) {
                this.accountPasswordValidTime = accountPasswordValidTime;
                return this;
            }

            /**
             * The state of the account. Valid values:
             * <p>
             * 
             * *   **Creating**: The account is being created.
             * *   **Available**: The account is available.
             * *   **Deleting**: The account is being deleted
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * The type of the account. Valid values:
             * <p>
             * 
             * *   **Normal**: a standard account
             * *   **Super**: a privileged account
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The list of database permissions that are granted to the account.
             */
            public Builder databasePrivileges(java.util.List < DatabasePrivileges> databasePrivileges) {
                this.databasePrivileges = databasePrivileges;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
