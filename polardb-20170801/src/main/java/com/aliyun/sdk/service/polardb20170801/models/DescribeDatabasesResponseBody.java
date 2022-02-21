// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabasesResponseBody</p>
 */
public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    private Databases databases;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
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
         * Databases.
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatabasesResponseBody build() {
            return new DescribeDatabasesResponseBody(this);
        } 

    } 

    public static class Account extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("PrivilegeStatus")
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
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AccountPrivilege.
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
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
             * PrivilegeStatus.
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
    public static class Database extends TeaModel {
        @NameInMap("Accounts")
        private Accounts accounts;

        @NameInMap("CharacterSetName")
        private String characterSetName;

        @NameInMap("DBDescription")
        private String DBDescription;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("DBStatus")
        private String DBStatus;

        @NameInMap("Engine")
        private String engine;

        private Database(Builder builder) {
            this.accounts = builder.accounts;
            this.characterSetName = builder.characterSetName;
            this.DBDescription = builder.DBDescription;
            this.DBName = builder.DBName;
            this.DBStatus = builder.DBStatus;
            this.engine = builder.engine;
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

        public static final class Builder {
            private Accounts accounts; 
            private String characterSetName; 
            private String DBDescription; 
            private String DBName; 
            private String DBStatus; 
            private String engine; 

            /**
             * Accounts.
             */
            public Builder accounts(Accounts accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * CharacterSetName.
             */
            public Builder characterSetName(String characterSetName) {
                this.characterSetName = characterSetName;
                return this;
            }

            /**
             * DBDescription.
             */
            public Builder DBDescription(String DBDescription) {
                this.DBDescription = DBDescription;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * DBStatus.
             */
            public Builder DBStatus(String DBStatus) {
                this.DBStatus = DBStatus;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @NameInMap("Database")
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
