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

        private Builder() {
        } 

        private Builder(DescribeAccountsResponseBody model) {
            this.accounts = model.accounts;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.systemAdminAccountFirstActivationTime = model.systemAdminAccountFirstActivationTime;
            this.systemAdminAccountStatus = model.systemAdminAccountStatus;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Accounts.
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
         * <p>17F2EA6C-3CA2-528D-A263-DC29707AD652</p>
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
         * <p>The time when the super administrator (SA) account was first activated. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-10-17T07:51:22Z</p>
         */
        public Builder systemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
            this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
            return this;
        }

        /**
         * <p>Indicates whether the super administrator (SA) account is activated. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: Activated.</li>
         * <li><strong>False</strong>: Not activated.</li>
         * </ul>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances support the <a href="https://help.aliyun.com/document_detail/170736.html">super administrator (SA) account</a>, and this parameter has a return value. For instances of other engines, the return value is empty.</p>
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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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

            private Builder() {
            } 

            private Builder(DatabasePrivilege model) {
                this.accountPrivilege = model.accountPrivilege;
                this.accountPrivilegeDetail = model.accountPrivilegeDetail;
                this.DBName = model.DBName;
            } 

            /**
             * AccountPrivilege.
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * AccountPrivilegeDetail.
             */
            public Builder accountPrivilegeDetail(String accountPrivilegeDetail) {
                this.accountPrivilegeDetail = accountPrivilegeDetail;
                return this;
            }

            /**
             * DBName.
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

            private Builder() {
            } 

            private Builder(DBInstanceAccount model) {
                this.accountDescription = model.accountDescription;
                this.accountName = model.accountName;
                this.accountStatus = model.accountStatus;
                this.accountType = model.accountType;
                this.bypassRLS = model.bypassRLS;
                this.checkPolicy = model.checkPolicy;
                this.createDB = model.createDB;
                this.createRole = model.createRole;
                this.DBInstanceId = model.DBInstanceId;
                this.databasePrivileges = model.databasePrivileges;
                this.passwordExpireTime = model.passwordExpireTime;
                this.privExceeded = model.privExceeded;
                this.replication = model.replication;
                this.validUntil = model.validUntil;
            } 

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
             * BypassRLS.
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
             * CreateDB.
             */
            public Builder createDB(String createDB) {
                this.createDB = createDB;
                return this;
            }

            /**
             * CreateRole.
             */
            public Builder createRole(String createRole) {
                this.createRole = createRole;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
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
             * PasswordExpireTime.
             */
            public Builder passwordExpireTime(String passwordExpireTime) {
                this.passwordExpireTime = passwordExpireTime;
                return this;
            }

            /**
             * PrivExceeded.
             */
            public Builder privExceeded(String privExceeded) {
                this.privExceeded = privExceeded;
                return this;
            }

            /**
             * Replication.
             */
            public Builder replication(String replication) {
                this.replication = replication;
                return this;
            }

            /**
             * ValidUntil.
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

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.DBInstanceAccount = model.DBInstanceAccount;
            } 

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
