// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountsResponseBody</p>
 */
public class DescribeAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

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
    public java.util.List<Accounts> getAccounts() {
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
        private java.util.List<Accounts> accounts; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        /**
         * <p>The details of the account.</p>
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The page number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>155462B9-205F-4FFC-BB43-4855FE******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountsResponseBody build() {
            return new DescribeAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
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
             * <p>The permissions that the account is granted on the database. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>ReadOnly</p>
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>DBtest</p>
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
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
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
        private java.util.List<DatabasePrivileges> databasePrivileges;

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
        public java.util.List<DatabasePrivileges> getDatabasePrivileges() {
            return this.databasePrivileges;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountLockState; 
            private String accountName; 
            private String accountPasswordValidTime; 
            private String accountStatus; 
            private String accountType; 
            private java.util.List<DatabasePrivileges> databasePrivileges; 

            /**
             * <p>The description of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * <p>The locking state of the account. Valid values:</p>
             * <ul>
             * <li><strong>UnLock</strong></li>
             * <li><strong>Lock</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UnLock</p>
             */
            public Builder accountLockState(String accountLockState) {
                this.accountLockState = accountLockState;
                return this;
            }

            /**
             * <p>The name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_acc</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The validity period of the password.</p>
             * 
             * <strong>example:</strong>
             * <p>undefined</p>
             */
            public Builder accountPasswordValidTime(String accountPasswordValidTime) {
                this.accountPasswordValidTime = accountPasswordValidTime;
                return this;
            }

            /**
             * <p>The state of the account. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The account is being created.</li>
             * <li><strong>Available</strong>: The account is available.</li>
             * <li><strong>Deleting</strong>: The account is being deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>The type of the account. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: a standard account</li>
             * <li><strong>Super</strong>: a privileged account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The list of database permissions that are granted to the account.</p>
             */
            public Builder databasePrivileges(java.util.List<DatabasePrivileges> databasePrivileges) {
                this.databasePrivileges = databasePrivileges;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
