// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        private String systemAdminAccountFirstActivationTime; 
        private String systemAdminAccountStatus; 
        private Integer totalRecordCount; 

        /**
         * The details of the account.
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The first time when the system admin account was enabled. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         * <p>
         * 
         * >  This parameter is returned only for instances that run SQL Server.
         */
        public Builder systemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
            this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
            return this;
        }

        /**
         * Indicates whether the system admin account was enabled. Valid values:
         * <p>
         * 
         * *   **true**: The system admin account was enabled.
         * *   **false**: The system admin account was disabled.
         * 
         * >  The [system admin account](~~170736~~) is supported only for the instances that run SQL Server. If the instance runs SQL Server, a value is returned for this parameter. If the instance runs a different database engine, no value is returned for this parameter.
         */
        public Builder systemAdminAccountStatus(String systemAdminAccountStatus) {
            this.systemAdminAccountStatus = systemAdminAccountStatus;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAccountsResponseBody build() {
            return new DescribeAccountsResponseBody(this);
        } 

    } 

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
             * The type of the permissions. Valid values:
             * <p>
             * 
             * *   **ReadWrite**: read and write permissions.
             * *   **ReadOnly**: read-only permissions.
             * *   **DDLOnly**: DDL-only permissions.
             * *   **DMLOnly**: DML-only permissions.
             * *   **Custom**: custom permissions. You can modify the permissions of the account by using SQL commands.
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * The permissions that are granted to the account. For more information, see [Account permissions](~~146395~~).
             */
            public Builder accountPrivilegeDetail(String accountPrivilegeDetail) {
                this.accountPrivilegeDetail = accountPrivilegeDetail;
                return this;
            }

            /**
             * The name of the database.
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
    public static class DatabasePrivileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabasePrivilege")
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
             * The description of the account.
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
             * The status of the account. Valid values:
             * <p>
             * 
             * *   **Unavailable**
             * *   **Available**
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * The type of the account. Valid values:
             * <p>
             * 
             * *   **Normal**: standard account
             * *   **Super**: privileged account
             * *   **Sysadmin**: system admin account, which is supported only for instances running SQL Server
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Indicates whether the account has the row-level security (RLS) permissions. Valid values:
             * <p>
             * 
             * *   **t**: The account has the RLS permissions.
             * *   **f**: The account does not have the RLS permissions.
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder bypassRLS(String bypassRLS) {
                this.bypassRLS = bypassRLS;
                return this;
            }

            /**
             * CheckPolicy.
             */
            public Builder checkPolicy(Boolean checkPolicy) {
                this.checkPolicy = checkPolicy;
                return this;
            }

            /**
             * Indicates whether the account has the permissions to create databases. Valid values:
             * <p>
             * 
             * *   **t**: The account has the permissions to create databases.
             * *   **f**: The account does not have the permissions to create databases.
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder createDB(String createDB) {
                this.createDB = createDB;
                return this;
            }

            /**
             * Indicates whether the account has the permissions to create roles. Valid values:
             * <p>
             * 
             * *   **t**: The account has the permissions to create roles.
             * *   **f**: The account does not have the permissions to create roles.
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder createRole(String createRole) {
                this.createRole = createRole;
                return this;
            }

            /**
             * The ID of the instance to which the account belongs.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The details about the permissions that are granted to the account.
             */
            public Builder databasePrivileges(DatabasePrivileges databasePrivileges) {
                this.databasePrivileges = databasePrivileges;
                return this;
            }

            /**
             * PasswordExpireTime.
             */
            public Builder passwordExpireTime(String passwordExpireTime) {
                this.passwordExpireTime = passwordExpireTime;
                return this;
            }

            /**
             * Indicates whether the number of databases that are managed by the account exceeds the upper limit. Valid values:
             * <p>
             * 
             * *   **1**: The number of databases that are managed by the account exceeds the upper limit.
             * *   **0**: The number of databases that are managed by the account does not exceed the upper limit.
             */
            public Builder privExceeded(String privExceeded) {
                this.privExceeded = privExceeded;
                return this;
            }

            /**
             * Indicates whether the account has the replication permissions. Valid values:
             * <p>
             * 
             * *   **t**: The account has the replication permissions.
             * *   **f**: The account does not have the replication permissions.
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder replication(String replication) {
                this.replication = replication;
                return this;
            }

            /**
             * The expiration time of the password. Valid values:
             * <p>
             * 
             * *   **infinity**: The password never expires.
             * *   **Empty**: The expiration time is not specified.
             * *   **Actual expiration time**: in the format of *yyyy-MM-dd*T*HH:mm:ss*Z in UTC. Example: 2022-10-01T00:00:00Z.
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
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
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceAccount")
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
