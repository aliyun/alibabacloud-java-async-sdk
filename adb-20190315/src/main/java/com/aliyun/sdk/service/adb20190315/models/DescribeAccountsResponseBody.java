// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
         * <p>64E37E6F-C363-41F3-867A-70EF5DC60EA4</p>
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
             * <p>The description of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>C@test</p>
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The state of the database account. Valid values:</p>
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
