// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountsResponseBody</p>
 */
public class DescribeAccountsResponseBody extends TeaModel {
    @NameInMap("Accounts")
    private java.util.List < Accounts> accounts;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
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
         * Accounts.
         */
        public Builder accounts(java.util.List < Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @NameInMap("DBName")
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
             * AccountPrivilege.
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * DBName.
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
        @NameInMap("AccountDescription")
        private String accountDescription;

        @NameInMap("AccountLockState")
        private String accountLockState;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountPassword")
        private String accountPassword;

        @NameInMap("AccountPasswordValidTime")
        private String accountPasswordValidTime;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("DatabasePrivileges")
        private java.util.List < DatabasePrivileges> databasePrivileges;

        private Accounts(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountLockState = builder.accountLockState;
            this.accountName = builder.accountName;
            this.accountPassword = builder.accountPassword;
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
         * @return accountPassword
         */
        public String getAccountPassword() {
            return this.accountPassword;
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
            private String accountPassword; 
            private String accountPasswordValidTime; 
            private String accountStatus; 
            private String accountType; 
            private java.util.List < DatabasePrivileges> databasePrivileges; 

            /**
             * AccountDescription.
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * AccountLockState.
             */
            public Builder accountLockState(String accountLockState) {
                this.accountLockState = accountLockState;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AccountPassword.
             */
            public Builder accountPassword(String accountPassword) {
                this.accountPassword = accountPassword;
                return this;
            }

            /**
             * AccountPasswordValidTime.
             */
            public Builder accountPasswordValidTime(String accountPasswordValidTime) {
                this.accountPasswordValidTime = accountPasswordValidTime;
                return this;
            }

            /**
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * DatabasePrivileges.
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
