// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    public static class DatabasePrivilege extends TeaModel {
        @NameInMap("AccountPrivilege")
        private String accountPrivilege;

        private DatabasePrivilege(Builder builder) {
            this.accountPrivilege = builder.accountPrivilege;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasePrivilege create() {
            return builder().build();
        }

        /**
         * @return accountPrivilege
         */
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public static final class Builder {
            private String accountPrivilege; 

            /**
             * AccountPrivilege.
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            public DatabasePrivilege build() {
                return new DatabasePrivilege(this);
            } 

        } 

    }
    public static class DatabasePrivileges extends TeaModel {
        @NameInMap("DatabasePrivilege")
        private java.util.List < DatabasePrivilege> databasePrivilege;

        private DatabasePrivileges(Builder builder) {
            this.databasePrivilege = builder.databasePrivilege;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasePrivileges create() {
            return builder().build();
        }

        /**
         * @return databasePrivilege
         */
        public java.util.List < DatabasePrivilege> getDatabasePrivilege() {
            return this.databasePrivilege;
        }

        public static final class Builder {
            private java.util.List < DatabasePrivilege> databasePrivilege; 

            /**
             * DatabasePrivilege.
             */
            public Builder databasePrivilege(java.util.List < DatabasePrivilege> databasePrivilege) {
                this.databasePrivilege = databasePrivilege;
                return this;
            }

            public DatabasePrivileges build() {
                return new DatabasePrivileges(this);
            } 

        } 

    }
    public static class Account extends TeaModel {
        @NameInMap("AccountDescription")
        private String accountDescription;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("DatabasePrivileges")
        private DatabasePrivileges databasePrivileges;

        @NameInMap("InstanceId")
        private String instanceId;

        private Account(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.databasePrivileges = builder.databasePrivileges;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Account create() {
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
         * @return databasePrivileges
         */
        public DatabasePrivileges getDatabasePrivileges() {
            return this.databasePrivileges;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountStatus; 
            private String accountType; 
            private DatabasePrivileges databasePrivileges; 
            private String instanceId; 

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
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * DatabasePrivileges.
             */
            public Builder databasePrivileges(DatabasePrivileges databasePrivileges) {
                this.databasePrivileges = databasePrivileges;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @NameInMap("Account")
        private java.util.List < Account> account;

        private Accounts(Builder builder) {
            this.account = builder.account;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public java.util.List < Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List < Account> account; 

            /**
             * Account.
             */
            public Builder account(java.util.List < Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
