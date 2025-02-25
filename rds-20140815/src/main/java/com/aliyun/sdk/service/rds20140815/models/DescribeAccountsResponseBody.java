// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SystemAdminAccountFirstActivationTime")
    private String systemAdminAccountFirstActivationTime;

    @com.aliyun.core.annotation.NameInMap("SystemAdminAccountStatus")
    private String systemAdminAccountStatus;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeAccountsResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.systemAdminAccountFirstActivationTime = builder.systemAdminAccountFirstActivationTime;
        this.systemAdminAccountStatus = builder.systemAdminAccountStatus;
        this.totalRecordCount = builder.totalRecordCount;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return systemAdminAccountFirstActivationTime
     */
    public String getSystemAdminAccountFirstActivationTime() {
        return this.systemAdminAccountFirstActivationTime;
    }

    /**
     * @return systemAdminAccountStatus
     */
    public String getSystemAdminAccountStatus() {
        return this.systemAdminAccountStatus;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Accounts accounts; 
        private Integer pageNumber; 
        private String requestId; 
        private String resourceGroupId; 
        private String systemAdminAccountFirstActivationTime; 
        private String systemAdminAccountStatus; 
        private Integer totalRecordCount; 

        /**
         * <p>The information about the account.</p>
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A2E94301-D07F-4457-9B49-6AA2BB388C85</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The first time when the system admin account was enabled. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-02-06T11:00:00Z</p>
         */
        public Builder systemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
            this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
            return this;
        }

        /**
         * <p>Indicates whether the system admin account was enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The system admin account was enabled.</li>
         * <li><strong>false</strong>: The system admin account was disabled.</li>
         * </ul>
         * <blockquote>
         * <p> The <a href="https://help.aliyun.com/document_detail/170736.html">system admin account</a> is supported only for the instances that run SQL Server. If the instance runs SQL Server, a value is returned for this parameter. If the instance runs a different database engine, no value is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder systemAdminAccountStatus(String systemAdminAccountStatus) {
            this.systemAdminAccountStatus = systemAdminAccountStatus;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
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

        @com.aliyun.core.annotation.NameInMap("AccountPrivilegeDetail")
        private String accountPrivilegeDetail;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        private DatabasePrivilege(Builder builder) {
            this.accountPrivilege = builder.accountPrivilege;
            this.accountPrivilegeDetail = builder.accountPrivilegeDetail;
            this.DBName = builder.DBName;
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

        /**
         * @return accountPrivilegeDetail
         */
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        public static final class Builder {
            private String accountPrivilege; 
            private String accountPrivilegeDetail; 
            private String DBName; 

            /**
             * <p>The type of the permissions. Valid values:</p>
             * <ul>
             * <li><strong>ReadWrite</strong>: read and write permissions.</li>
             * <li><strong>ReadOnly</strong>: read-only permissions.</li>
             * <li><strong>DDLOnly</strong>: DDL-only permissions.</li>
             * <li><strong>DMLOnly</strong>: DML-only permissions.</li>
             * <li><strong>Custom</strong>: custom permissions. You can modify the permissions of the account by using SQL commands.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadWrite</p>
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * <p>The permissions that are granted to the account. For more information, see <a href="https://help.aliyun.com/document_detail/146395.html">Account permissions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT,INSERT</p>
             */
            public Builder accountPrivilegeDetail(String accountPrivilegeDetail) {
                this.accountPrivilegeDetail = accountPrivilegeDetail;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
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
    public static class DBInstanceAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDescription")
        private String accountDescription;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("BypassRLS")
        private String bypassRLS;

        @com.aliyun.core.annotation.NameInMap("CheckPolicy")
        private Boolean checkPolicy;

        @com.aliyun.core.annotation.NameInMap("CreateDB")
        private String createDB;

        @com.aliyun.core.annotation.NameInMap("CreateRole")
        private String createRole;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DatabasePrivileges")
        private DatabasePrivileges databasePrivileges;

        @com.aliyun.core.annotation.NameInMap("PasswordExpireTime")
        private String passwordExpireTime;

        @com.aliyun.core.annotation.NameInMap("PrivExceeded")
        private String privExceeded;

        @com.aliyun.core.annotation.NameInMap("Replication")
        private String replication;

        @com.aliyun.core.annotation.NameInMap("ValidUntil")
        private String validUntil;

        private DBInstanceAccount(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.bypassRLS = builder.bypassRLS;
            this.checkPolicy = builder.checkPolicy;
            this.createDB = builder.createDB;
            this.createRole = builder.createRole;
            this.DBInstanceId = builder.DBInstanceId;
            this.databasePrivileges = builder.databasePrivileges;
            this.passwordExpireTime = builder.passwordExpireTime;
            this.privExceeded = builder.privExceeded;
            this.replication = builder.replication;
            this.validUntil = builder.validUntil;
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
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return bypassRLS
         */
        public String getBypassRLS() {
            return this.bypassRLS;
        }

        /**
         * @return checkPolicy
         */
        public Boolean getCheckPolicy() {
            return this.checkPolicy;
        }

        /**
         * @return createDB
         */
        public String getCreateDB() {
            return this.createDB;
        }

        /**
         * @return createRole
         */
        public String getCreateRole() {
            return this.createRole;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return databasePrivileges
         */
        public DatabasePrivileges getDatabasePrivileges() {
            return this.databasePrivileges;
        }

        /**
         * @return passwordExpireTime
         */
        public String getPasswordExpireTime() {
            return this.passwordExpireTime;
        }

        /**
         * @return privExceeded
         */
        public String getPrivExceeded() {
            return this.privExceeded;
        }

        /**
         * @return replication
         */
        public String getReplication() {
            return this.replication;
        }

        /**
         * @return validUntil
         */
        public String getValidUntil() {
            return this.validUntil;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountStatus; 
            private String accountType; 
            private String bypassRLS; 
            private Boolean checkPolicy; 
            private String createDB; 
            private String createRole; 
            private String DBInstanceId; 
            private DatabasePrivileges databasePrivileges; 
            private String passwordExpireTime; 
            private String privExceeded; 
            private String replication; 
            private String validUntil; 

            /**
             * <p>The description of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>Test account</p>
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
             * <p>The status of the account. Valid values:</p>
             * <ul>
             * <li><strong>Unavailable</strong></li>
             * <li><strong>Available</strong></li>
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
             * <li><strong>Super</strong>: privileged account</li>
             * <li><strong>Sysadmin</strong>: system admin account, which is supported only for instances running SQL Server</li>
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
             * <p>Indicates whether the account has the row-level security (RLS) permissions. Valid values:</p>
             * <ul>
             * <li><strong>t</strong>: The account has the RLS permissions.</li>
             * <li><strong>f</strong>: The account does not have the RLS permissions.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>f</p>
             */
            public Builder bypassRLS(String bypassRLS) {
                this.bypassRLS = bypassRLS;
                return this;
            }

            /**
             * <p>Indicates whether the password policy is applied.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder checkPolicy(Boolean checkPolicy) {
                this.checkPolicy = checkPolicy;
                return this;
            }

            /**
             * <p>Indicates whether the account has the permissions to create databases. Valid values:</p>
             * <ul>
             * <li><strong>t</strong>: The account has the permissions to create databases.</li>
             * <li><strong>f</strong>: The account does not have the permissions to create databases.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>t</p>
             */
            public Builder createDB(String createDB) {
                this.createDB = createDB;
                return this;
            }

            /**
             * <p>Indicates whether the account has the permissions to create roles. Valid values:</p>
             * <ul>
             * <li><strong>t</strong>: The account has the permissions to create roles.</li>
             * <li><strong>f</strong>: The account does not have the permissions to create roles.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>t</p>
             */
            public Builder createRole(String createRole) {
                this.createRole = createRole;
                return this;
            }

            /**
             * <p>The ID of the instance to which the account belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5*****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The details about the permissions that are granted to the account.</p>
             */
            public Builder databasePrivileges(DatabasePrivileges databasePrivileges) {
                this.databasePrivileges = databasePrivileges;
                return this;
            }

            /**
             * <p>The expiration time of the password.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-10-21</p>
             */
            public Builder passwordExpireTime(String passwordExpireTime) {
                this.passwordExpireTime = passwordExpireTime;
                return this;
            }

            /**
             * <p>Indicates whether the number of databases that are managed by the account exceeds the upper limit. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The number of databases that are managed by the account exceeds the upper limit.</li>
             * <li><strong>0</strong>: The number of databases that are managed by the account does not exceed the upper limit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder privExceeded(String privExceeded) {
                this.privExceeded = privExceeded;
                return this;
            }

            /**
             * <p>Indicates whether the account has the replication permissions. Valid values:</p>
             * <ul>
             * <li><strong>t</strong>: The account has the replication permissions.</li>
             * <li><strong>f</strong>: The account does not have the replication permissions.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>t</p>
             */
            public Builder replication(String replication) {
                this.replication = replication;
                return this;
            }

            /**
             * <p>The expiration time of the password. Valid values:</p>
             * <ul>
             * <li><strong>infinity</strong>: The password never expires.</li>
             * <li><strong>Empty</strong>: The expiration time is not specified.</li>
             * <li><strong>Actual expiration time</strong>: in the format of <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z in UTC. Example: 2022-10-01T00:00:00Z.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-10-01T00:00:00Z</p>
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            public DBInstanceAccount build() {
                return new DBInstanceAccount(this);
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
        @com.aliyun.core.annotation.NameInMap("DBInstanceAccount")
        private java.util.List<DBInstanceAccount> DBInstanceAccount;

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
        public java.util.List<DBInstanceAccount> getDBInstanceAccount() {
            return this.DBInstanceAccount;
        }

        public static final class Builder {
            private java.util.List<DBInstanceAccount> DBInstanceAccount; 

            /**
             * DBInstanceAccount.
             */
            public Builder DBInstanceAccount(java.util.List<DBInstanceAccount> DBInstanceAccount) {
                this.DBInstanceAccount = DBInstanceAccount;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
