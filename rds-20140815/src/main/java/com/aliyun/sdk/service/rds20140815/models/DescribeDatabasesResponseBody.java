// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Databases databases; 
        private String requestId; 

        /**
         * Databases.
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
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

    public static class AccountPrivilegeInfo extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        private String accountPrivilegeDetail;

        private AccountPrivilegeInfo(Builder builder) {
            this.account = builder.account;
            this.accountPrivilege = builder.accountPrivilege;
            this.accountPrivilegeDetail = builder.accountPrivilegeDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountPrivilegeInfo create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
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

        public static final class Builder {
            private String account; 
            private String accountPrivilege; 
            private String accountPrivilegeDetail; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
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
             * AccountPrivilegeDetail.
             */
            public Builder accountPrivilegeDetail(String accountPrivilegeDetail) {
                this.accountPrivilegeDetail = accountPrivilegeDetail;
                return this;
            }

            public AccountPrivilegeInfo build() {
                return new AccountPrivilegeInfo(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @NameInMap("AccountPrivilegeInfo")
        private java.util.List < AccountPrivilegeInfo> accountPrivilegeInfo;

        private Accounts(Builder builder) {
            this.accountPrivilegeInfo = builder.accountPrivilegeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountPrivilegeInfo
         */
        public java.util.List < AccountPrivilegeInfo> getAccountPrivilegeInfo() {
            return this.accountPrivilegeInfo;
        }

        public static final class Builder {
            private java.util.List < AccountPrivilegeInfo> accountPrivilegeInfo; 

            /**
             * AccountPrivilegeInfo.
             */
            public Builder accountPrivilegeInfo(java.util.List < AccountPrivilegeInfo> accountPrivilegeInfo) {
                this.accountPrivilegeInfo = accountPrivilegeInfo;
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

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

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
            this.DBInstanceId = builder.DBInstanceId;
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
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
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
            private String DBInstanceId; 
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
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
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
