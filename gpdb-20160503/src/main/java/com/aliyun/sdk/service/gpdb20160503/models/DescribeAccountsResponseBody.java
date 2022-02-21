// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    private Accounts accounts;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAccountsResponseBody(Builder builder) {
        this.accounts = builder.accounts;
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
    public Accounts getAccounts() {
        return this.accounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Accounts accounts; 
        private String requestId; 

        /**
         * Accounts.
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
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

    public static class DBInstanceAccount extends TeaModel {
        @NameInMap("AccountDescription")
        private String accountDescription;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        private DBInstanceAccount(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceAccount create() {
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
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountStatus; 
            private String DBInstanceId; 

            /**
             * AccountDescription.
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
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
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public DBInstanceAccount build() {
                return new DBInstanceAccount(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @NameInMap("DBInstanceAccount")
        private java.util.List < DBInstanceAccount> DBInstanceAccount;

        private Accounts(Builder builder) {
            this.DBInstanceAccount = builder.DBInstanceAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return DBInstanceAccount
         */
        public java.util.List < DBInstanceAccount> getDBInstanceAccount() {
            return this.DBInstanceAccount;
        }

        public static final class Builder {
            private java.util.List < DBInstanceAccount> DBInstanceAccount; 

            /**
             * DBInstanceAccount.
             */
            public Builder DBInstanceAccount(java.util.List < DBInstanceAccount> DBInstanceAccount) {
                this.DBInstanceAccount = DBInstanceAccount;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
