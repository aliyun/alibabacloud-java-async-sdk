// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
    @com.aliyun.core.annotation.NameInMap("AccountList")
    private AccountList accountList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The queried database accounts.</p>
         */
        public Builder accountList(AccountList accountList) {
            this.accountList = accountList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CCFAAB4-97B7-5800-B9F2-685EB596E3EF</p>
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
    public static class DBAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDescription")
        private String accountDescription;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("RamUsers")
        private String ramUsers;

        private DBAccount(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.engine = builder.engine;
            this.ramUsers = builder.ramUsers;
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

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return ramUsers
         */
        public String getRamUsers() {
            return this.ramUsers;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountStatus; 
            private String accountType; 
            private String engine; 
            private String ramUsers; 

            /**
             * <p>The description of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_accout_des</p>
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_accout</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The status of the database account. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Deleting</strong></li>
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
             * <p>The type of the database account. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: standard account.</li>
             * <li><strong>Super</strong>: privileged account.</li>
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
             * <p>The database engine of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>AnalyticDB</strong>: the AnalyticDB for MySQL engine.</li>
             * <li><strong>Clickhouse</strong>: the wide table engine.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Clickhouse</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The ID of the Resource Access Management (RAM) user.</p>
             * 
             * <strong>example:</strong>
             * <p>1958134230****</p>
             */
            public Builder ramUsers(String ramUsers) {
                this.ramUsers = ramUsers;
                return this;
            }

            public DBAccount build() {
                return new DBAccount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class AccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBAccount")
        private java.util.List<DBAccount> DBAccount;

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
        public java.util.List<DBAccount> getDBAccount() {
            return this.DBAccount;
        }

        public static final class Builder {
            private java.util.List<DBAccount> DBAccount; 

            /**
             * DBAccount.
             */
            public Builder DBAccount(java.util.List<DBAccount> DBAccount) {
                this.DBAccount = DBAccount;
                return this;
            }

            public AccountList build() {
                return new AccountList(this);
            } 

        } 

    }
}
