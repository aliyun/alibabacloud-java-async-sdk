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
 * {@link DescribeAccountsZonalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountsZonalResponseBody</p>
 */
public class DescribeAccountsZonalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountsZonalResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountsZonalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public java.util.List<Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAccountsZonalResponseBody model) {
            this.accounts = model.accounts;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
        } 

        /**
         * Accounts.
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public DescribeAccountsZonalResponseBody build() {
            return new DescribeAccountsZonalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountsZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsZonalResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DatabasePrivileges model) {
                this.accountPrivilege = model.accountPrivilege;
                this.DBName = model.DBName;
            } 

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
    /**
     * 
     * {@link DescribeAccountsZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsZonalResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountDescription = model.accountDescription;
                this.accountLockState = model.accountLockState;
                this.accountName = model.accountName;
                this.accountPasswordValidTime = model.accountPasswordValidTime;
                this.accountStatus = model.accountStatus;
                this.accountType = model.accountType;
                this.databasePrivileges = model.databasePrivileges;
            } 

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
