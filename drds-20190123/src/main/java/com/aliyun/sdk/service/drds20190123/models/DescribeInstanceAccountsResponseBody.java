// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeInstanceAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAccountsResponseBody</p>
 */
public class DescribeInstanceAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceAccounts")
    private InstanceAccounts instanceAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>Indicates the information about the instance accounts.</p>
         */
        public Builder instanceAccounts(InstanceAccounts instanceAccounts) {
            this.instanceAccounts = instanceAccounts;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E2E4056D-57EB-4353-8355-2E6284******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstanceAccountsResponseBody build() {
            return new DescribeInstanceAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAccountsResponseBody</p>
     */
    public static class DbPrivilege extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Privilege")
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
             * <p>Indicates the name of a database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_rds3</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Indicates the permissions that an account is granted on the database. Valid values:</p>
             * <ul>
             * <li><strong>R</strong>: The account is granted the permissions that are required to read the data of the database.</li>
             * <li><strong>W</strong>: The account is granted the permissions that are required to write data to the database.</li>
             * <li><strong>DDL</strong>: The account is granted the permissions that are required to perform DDL operations on the database.</li>
             * <li><strong>DML</strong>: The account is granted the permissions that are required to perform DML operations on the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>R</p>
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
    /**
     * 
     * {@link DescribeInstanceAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAccountsResponseBody</p>
     */
    public static class DbPrivileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbPrivilege")
        private java.util.List<DbPrivilege> dbPrivilege;

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
        public java.util.List<DbPrivilege> getDbPrivilege() {
            return this.dbPrivilege;
        }

        public static final class Builder {
            private java.util.List<DbPrivilege> dbPrivilege; 

            /**
             * DbPrivilege.
             */
            public Builder dbPrivilege(java.util.List<DbPrivilege> dbPrivilege) {
                this.dbPrivilege = dbPrivilege;
                return this;
            }

            public DbPrivileges build() {
                return new DbPrivileges(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAccountsResponseBody</p>
     */
    public static class InstanceAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private Integer accountType;

        @com.aliyun.core.annotation.NameInMap("DbPrivileges")
        private DbPrivileges dbPrivileges;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Host")
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
             * <p>Indicates the username of an instance account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_rds3</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Indicates the type of an instance account. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The instance account is a privileged account.</li>
             * <li><strong>1</strong>: The instance account is a standard account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder accountType(Integer accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>Indicates the information about the permissions of an account on a database.</p>
             */
            public Builder dbPrivileges(DbPrivileges dbPrivileges) {
                this.dbPrivileges = dbPrivileges;
                return this;
            }

            /**
             * <p>Indicates the description of an account. By default, if 0 is the value of the AccountType parameter, <strong>Created by DRDS</strong> is returned as the value of the Description parameter. If 1 is the value of the AccountType parameter, an empty string is returned as the value of the Description parameter. You can modify the description of an account on the Accounts page in the PolarDB-X console.</p>
             * 
             * <strong>example:</strong>
             * <p>Created by DRDS</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates an IP address that is allowed to access the database. The value <strong>%</strong> indicates that each IP address is allowed to access the database. &lt;/note&gt;</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
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
    /**
     * 
     * {@link DescribeInstanceAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAccountsResponseBody</p>
     */
    public static class InstanceAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceAccount")
        private java.util.List<InstanceAccount> instanceAccount;

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
        public java.util.List<InstanceAccount> getInstanceAccount() {
            return this.instanceAccount;
        }

        public static final class Builder {
            private java.util.List<InstanceAccount> instanceAccount; 

            /**
             * InstanceAccount.
             */
            public Builder instanceAccount(java.util.List<InstanceAccount> instanceAccount) {
                this.instanceAccount = instanceAccount;
                return this;
            }

            public InstanceAccounts build() {
                return new InstanceAccounts(this);
            } 

        } 

    }
}
