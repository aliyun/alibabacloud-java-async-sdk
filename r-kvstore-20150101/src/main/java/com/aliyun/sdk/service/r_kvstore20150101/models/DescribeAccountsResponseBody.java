// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    private Accounts accounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAccountsResponseBody model) {
            this.accounts = model.accounts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about returned accounts of the instance.</p>
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6C9E114C-217C-4118-83C0-B4070222****</p>
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
    public static class DatabasePrivilege extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
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

            private Builder() {
            } 

            private Builder(DatabasePrivilege model) {
                this.accountPrivilege = model.accountPrivilege;
            } 

            /**
             * <p>The permission of the account. Default value: RoleReadWrite. Valid values:</p>
             * <ul>
             * <li><strong>RoleReadOnly</strong>: The account has the read-only permissions.</li>
             * <li><strong>RoleReadWrite</strong>: The account has the read and write permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RoleReadWrite</p>
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
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class DatabasePrivileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabasePrivilege")
        private java.util.List<DatabasePrivilege> databasePrivilege;

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
        public java.util.List<DatabasePrivilege> getDatabasePrivilege() {
            return this.databasePrivilege;
        }

        public static final class Builder {
            private java.util.List<DatabasePrivilege> databasePrivilege; 

            private Builder() {
            } 

            private Builder(DatabasePrivileges model) {
                this.databasePrivilege = model.databasePrivilege;
            } 

            /**
             * DatabasePrivilege.
             */
            public Builder databasePrivilege(java.util.List<DatabasePrivilege> databasePrivilege) {
                this.databasePrivilege = databasePrivilege;
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
    public static class Account extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDescription")
        private String accountDescription;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("DatabasePrivileges")
        private DatabasePrivileges databasePrivileges;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
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

            private Builder() {
            } 

            private Builder(Account model) {
                this.accountDescription = model.accountDescription;
                this.accountName = model.accountName;
                this.accountStatus = model.accountStatus;
                this.accountType = model.accountType;
                this.databasePrivileges = model.databasePrivileges;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The description of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>testdec</p>
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * <p>The name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>demoaccount</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The state of the account. Valid values:</p>
             * <ul>
             * <li><strong>Unavailable</strong>: The account is unavailable.</li>
             * <li><strong>Available</strong>: The account is available.</li>
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
             * <li><strong>Normal</strong>: standard account</li>
             * <li><strong>Super</strong>: super account</li>
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
             * <p>Details about account permissions.</p>
             */
            public Builder databasePrivileges(DatabasePrivileges databasePrivileges) {
                this.databasePrivileges = databasePrivileges;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp10noxlhcoim2****</p>
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
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private java.util.List<Account> account;

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
        public java.util.List<Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List<Account> account; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.account = model.account;
            } 

            /**
             * Account.
             */
            public Builder account(java.util.List<Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
