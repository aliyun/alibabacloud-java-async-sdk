// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabasesResponseBody</p>
 */
public class DescribeDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private Databases databases;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databases
     */
    public Databases getDatabases() {
        return this.databases;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Databases databases; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        /**
         * <p>Details about databases.</p>
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E1DF8CA6-2300-448B-9ABF-760C4B******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatabasesResponseBody build() {
            return new DescribeDatabasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class Account extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("PrivilegeStatus")
        private String privilegeStatus;

        private Account(Builder builder) {
            this.accountName = builder.accountName;
            this.accountPrivilege = builder.accountPrivilege;
            this.accountStatus = builder.accountStatus;
            this.privilegeStatus = builder.privilegeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Account create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountPrivilege
         */
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return privilegeStatus
         */
        public String getPrivilegeStatus() {
            return this.privilegeStatus;
        }

        public static final class Builder {
            private String accountName; 
            private String accountPrivilege; 
            private String accountStatus; 
            private String privilegeStatus; 

            /**
             * <p>The username of the account.</p>
             * <blockquote>
             * <p>A PolarDB for MySQL cluster does not support privileged accounts.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_acc</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The permissions that are granted to the account. Valid values:</p>
             * <ul>
             * <li><strong>ReadWrite</strong>: read and write permissions</li>
             * <li><strong>ReadOnly</strong>: read-only permissions</li>
             * <li><strong>DMLOnly</strong>: The account is granted the permissions to execute only DML statements on the database.</li>
             * <li><strong>DDLOnly</strong>: The account is granted the permissions to execute only DDL statements on the database.</li>
             * <li><strong>ReadIndex</strong>: The account has the read and index permissions on the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadOnly</p>
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * <p>The state of the account. Valid values:</p>
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
             * <p>The authorization state of the account. Valid values:</p>
             * <ul>
             * <li><strong>Empowering</strong>: The system is granting permissions to the account.</li>
             * <li><strong>Empowered</strong>: Permissions are granted to the account.</li>
             * <li><strong>Removing</strong>: The system is revoking permissions from the account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Empowered</p>
             */
            public Builder privilegeStatus(String privilegeStatus) {
                this.privilegeStatus = privilegeStatus;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
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
    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class Database extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        private Accounts accounts;

        @com.aliyun.core.annotation.NameInMap("CharacterSetName")
        private String characterSetName;

        @com.aliyun.core.annotation.NameInMap("DBDescription")
        private String DBDescription;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DBStatus")
        private String DBStatus;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("MasterID")
        private String masterID;

        private Database(Builder builder) {
            this.accounts = builder.accounts;
            this.characterSetName = builder.characterSetName;
            this.DBDescription = builder.DBDescription;
            this.DBName = builder.DBName;
            this.DBStatus = builder.DBStatus;
            this.engine = builder.engine;
            this.masterID = builder.masterID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public Accounts getAccounts() {
            return this.accounts;
        }

        /**
         * @return characterSetName
         */
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        /**
         * @return DBDescription
         */
        public String getDBDescription() {
            return this.DBDescription;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return DBStatus
         */
        public String getDBStatus() {
            return this.DBStatus;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return masterID
         */
        public String getMasterID() {
            return this.masterID;
        }

        public static final class Builder {
            private Accounts accounts; 
            private String characterSetName; 
            private String DBDescription; 
            private String DBName; 
            private String DBStatus; 
            private String engine; 
            private String masterID; 

            /**
             * <p>Details about the accounts.</p>
             * <blockquote>
             * <p>A PolarDB for MySQL cluster does not support privileged accounts.</p>
             * </blockquote>
             */
            public Builder accounts(Accounts accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>The character set that the database uses. For more information, see <a href="https://help.aliyun.com/document_detail/99716.html">Character set tables</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8mb4</p>
             */
            public Builder characterSetName(String characterSetName) {
                this.characterSetName = characterSetName;
                return this;
            }

            /**
             * <p>The description of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_des</p>
             */
            public Builder DBDescription(String DBDescription) {
                this.DBDescription = DBDescription;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The state of the database. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Running</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBStatus(String DBStatus) {
                this.DBStatus = DBStatus;
                return this;
            }

            /**
             * <p>The type of the database engine. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The ID of the primary node in the cluster of Multi-master Cluster (Database/Table) Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder masterID(String masterID) {
                this.masterID = masterID;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private java.util.List < Database> database;

        private Databases(Builder builder) {
            this.database = builder.database;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public java.util.List < Database> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List < Database> database; 

            /**
             * Database.
             */
            public Builder database(java.util.List < Database> database) {
                this.database = database;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
