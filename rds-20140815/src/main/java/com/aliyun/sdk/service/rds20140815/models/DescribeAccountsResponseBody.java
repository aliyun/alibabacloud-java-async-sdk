// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemAdminAccountFirstActivationTime")
    private String systemAdminAccountFirstActivationTime;

    @NameInMap("SystemAdminAccountStatus")
    private String systemAdminAccountStatus;

    @NameInMap("TotalRecordCount")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The first time when the superuser account was enabled. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder systemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
            this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
            return this;
        }

        /**
         * Indicates whether the superuser account is enabled.
         */
        public Builder systemAdminAccountStatus(String systemAdminAccountStatus) {
            this.systemAdminAccountStatus = systemAdminAccountStatus;
            return this;
        }

        /**
         * The total number of entries returned.
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
        @NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        private String accountPrivilegeDetail;

        @NameInMap("DBName")
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
    public static class DBInstanceAccount extends TeaModel {
        @NameInMap("AccountDescription")
        private String accountDescription;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("BypassRLS")
        private String bypassRLS;

        @NameInMap("CreateDB")
        private String createDB;

        @NameInMap("CreateRole")
        private String createRole;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DatabasePrivileges")
        private DatabasePrivileges databasePrivileges;

        @NameInMap("PrivExceeded")
        private String privExceeded;

        @NameInMap("Replication")
        private String replication;

        @NameInMap("ValidUntil")
        private String validUntil;

        private DBInstanceAccount(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.bypassRLS = builder.bypassRLS;
            this.createDB = builder.createDB;
            this.createRole = builder.createRole;
            this.DBInstanceId = builder.DBInstanceId;
            this.databasePrivileges = builder.databasePrivileges;
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
            private String createDB; 
            private String createRole; 
            private String DBInstanceId; 
            private DatabasePrivileges databasePrivileges; 
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
             * *   **Sysadmin**: superuser account that has the system administrator permissions
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Indicates whether the account has the row-level security (RLS) permissions. Valid values:
             * <p>
             * 
             * *   **t**: yes
             * *   **f**: no
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder bypassRLS(String bypassRLS) {
                this.bypassRLS = bypassRLS;
                return this;
            }

            /**
             * Indicates whether the account has the permissions to create databases. Valid values:
             * <p>
             * 
             * *   **t**: yes
             * *   **f**: no
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
             * *   **t**: yes
             * *   **f**: no
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
             * The details of the permissions that are granted to the account.
             */
            public Builder databasePrivileges(DatabasePrivileges databasePrivileges) {
                this.databasePrivileges = databasePrivileges;
                return this;
            }

            /**
             * Indicates whether the number of databases that are managed by the account exceeds the upper limit. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder privExceeded(String privExceeded) {
                this.privExceeded = privExceeded;
                return this;
            }

            /**
             * Indicates whether the account has the replication permissions. Valid values:
             * <p>
             * 
             * *   **t**: yes
             * *   **f**: no
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
             * *   **Actual expiration time** in the format of *yyyy-MM-dd*T*HH:mm:ss*Z in UTC. Example: 2022-10-01T00:00:00Z.
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
