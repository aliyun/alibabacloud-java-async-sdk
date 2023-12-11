// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
    @NameInMap("AccountList")
    private AccountList accountList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAccountsResponseBody(Builder builder) {
        this.accountList = builder.accountList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountList
     */
    public AccountList getAccountList() {
        return this.accountList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountList accountList; 
        private String requestId; 

        /**
         * The queried database accounts.
         */
        public Builder accountList(AccountList accountList) {
            this.accountList = accountList;
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

    public static class DBAccount extends TeaModel {
        @NameInMap("AccountDescription")
        private String accountDescription;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("AccountType")
        private String accountType;

        private DBAccount(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBAccount create() {
            return builder().build();
        }

        /**
         * @return accountDescription
         */
        public String getAccountDescription() {
            return this.accountDescription;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
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

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountStatus; 
            private String accountType; 

            /**
             * The description of the database account.
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * The name of the database account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The state of the database account. Valid values:
             * <p>
             * 
             * *   Creating
             * *   Available
             * *   Deleting
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * *   Normal: standard account.
             * <p>
             * *   Super: privileged account.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            public DBAccount build() {
                return new DBAccount(this);
            } 

        } 

    }
    public static class AccountList extends TeaModel {
        @NameInMap("DBAccount")
        private java.util.List < DBAccount> DBAccount;

        private AccountList(Builder builder) {
            this.DBAccount = builder.DBAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountList create() {
            return builder().build();
        }

        /**
         * @return DBAccount
         */
        public java.util.List < DBAccount> getDBAccount() {
            return this.DBAccount;
        }

        public static final class Builder {
            private java.util.List < DBAccount> DBAccount; 

            /**
             * DBAccount.
             */
            public Builder DBAccount(java.util.List < DBAccount> DBAccount) {
                this.DBAccount = DBAccount;
                return this;
            }

            public AccountList build() {
                return new AccountList(this);
            } 

        } 

    }
}
