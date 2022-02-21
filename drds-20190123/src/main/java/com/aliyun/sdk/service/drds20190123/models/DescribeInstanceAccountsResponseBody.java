// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAccountsResponseBody</p>
 */
public class DescribeInstanceAccountsResponseBody extends TeaModel {
    @NameInMap("InstanceAccounts")
    private InstanceAccounts instanceAccounts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeInstanceAccountsResponseBody(Builder builder) {
        this.instanceAccounts = builder.instanceAccounts;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceAccounts
     */
    public InstanceAccounts getInstanceAccounts() {
        return this.instanceAccounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private InstanceAccounts instanceAccounts; 
        private String requestId; 
        private Boolean success; 

        /**
         * InstanceAccounts.
         */
        public Builder instanceAccounts(InstanceAccounts instanceAccounts) {
            this.instanceAccounts = instanceAccounts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstanceAccountsResponseBody build() {
            return new DescribeInstanceAccountsResponseBody(this);
        } 

    } 

    public static class DbPrivilege extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Privilege")
        private String privilege;

        private DbPrivilege(Builder builder) {
            this.dbName = builder.dbName;
            this.privilege = builder.privilege;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbPrivilege create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return privilege
         */
        public String getPrivilege() {
            return this.privilege;
        }

        public static final class Builder {
            private String dbName; 
            private String privilege; 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Privilege.
             */
            public Builder privilege(String privilege) {
                this.privilege = privilege;
                return this;
            }

            public DbPrivilege build() {
                return new DbPrivilege(this);
            } 

        } 

    }
    public static class DbPrivileges extends TeaModel {
        @NameInMap("DbPrivilege")
        private java.util.List < DbPrivilege> dbPrivilege;

        private DbPrivileges(Builder builder) {
            this.dbPrivilege = builder.dbPrivilege;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbPrivileges create() {
            return builder().build();
        }

        /**
         * @return dbPrivilege
         */
        public java.util.List < DbPrivilege> getDbPrivilege() {
            return this.dbPrivilege;
        }

        public static final class Builder {
            private java.util.List < DbPrivilege> dbPrivilege; 

            /**
             * DbPrivilege.
             */
            public Builder dbPrivilege(java.util.List < DbPrivilege> dbPrivilege) {
                this.dbPrivilege = dbPrivilege;
                return this;
            }

            public DbPrivileges build() {
                return new DbPrivileges(this);
            } 

        } 

    }
    public static class InstanceAccount extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountType")
        private Integer accountType;

        @NameInMap("DbPrivileges")
        private DbPrivileges dbPrivileges;

        @NameInMap("Description")
        private String description;

        @NameInMap("Host")
        private String host;

        private InstanceAccount(Builder builder) {
            this.accountName = builder.accountName;
            this.accountType = builder.accountType;
            this.dbPrivileges = builder.dbPrivileges;
            this.description = builder.description;
            this.host = builder.host;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAccount create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountType
         */
        public Integer getAccountType() {
            return this.accountType;
        }

        /**
         * @return dbPrivileges
         */
        public DbPrivileges getDbPrivileges() {
            return this.dbPrivileges;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        public static final class Builder {
            private String accountName; 
            private Integer accountType; 
            private DbPrivileges dbPrivileges; 
            private String description; 
            private String host; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AccountType.
             */
            public Builder accountType(Integer accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * DbPrivileges.
             */
            public Builder dbPrivileges(DbPrivileges dbPrivileges) {
                this.dbPrivileges = dbPrivileges;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            public InstanceAccount build() {
                return new InstanceAccount(this);
            } 

        } 

    }
    public static class InstanceAccounts extends TeaModel {
        @NameInMap("InstanceAccount")
        private java.util.List < InstanceAccount> instanceAccount;

        private InstanceAccounts(Builder builder) {
            this.instanceAccount = builder.instanceAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAccounts create() {
            return builder().build();
        }

        /**
         * @return instanceAccount
         */
        public java.util.List < InstanceAccount> getInstanceAccount() {
            return this.instanceAccount;
        }

        public static final class Builder {
            private java.util.List < InstanceAccount> instanceAccount; 

            /**
             * InstanceAccount.
             */
            public Builder instanceAccount(java.util.List < InstanceAccount> instanceAccount) {
                this.instanceAccount = instanceAccount;
                return this;
            }

            public InstanceAccounts build() {
                return new InstanceAccounts(this);
            } 

        } 

    }
}
