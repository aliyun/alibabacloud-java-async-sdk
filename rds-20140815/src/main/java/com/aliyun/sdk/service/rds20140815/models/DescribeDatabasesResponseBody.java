// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the databases.</p>
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2603CA96-B17D-4903-BC04-61A2C829CD94</p>
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
    public static class AccountPrivilegeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @com.aliyun.core.annotation.NameInMap("AccountPrivilegeDetail")
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
             * <p>The account username.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The permissions that the account has on the database. Valid values:</p>
             * <ul>
             * <li><strong>ReadWrite</strong>: read and write permissions</li>
             * <li><strong>ReadOnly</strong>: read-only permissions</li>
             * <li><strong>DMLOnly</strong>: DML-only permissions</li>
             * <li><strong>DDLOnly</strong>: DDL-only permissions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DMLOnly</p>
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * <p>The permission that the account has on the database.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
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
    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountPrivilegeInfo")
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
    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class AdvancedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedDbProperty")
        private java.util.List < java.util.Map<String, ?>> advancedDbProperty;

        private AdvancedInfo(Builder builder) {
            this.advancedDbProperty = builder.advancedDbProperty;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedInfo create() {
            return builder().build();
        }

        /**
         * @return advancedDbProperty
         */
        public java.util.List < java.util.Map<String, ?>> getAdvancedDbProperty() {
            return this.advancedDbProperty;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> advancedDbProperty; 

            /**
             * AdvancedDbProperty.
             */
            public Builder advancedDbProperty(java.util.List < java.util.Map<String, ?>> advancedDbProperty) {
                this.advancedDbProperty = advancedDbProperty;
                return this;
            }

            public AdvancedInfo build() {
                return new AdvancedInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class BasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicDbProperty")
        private java.util.List < java.util.Map<String, ?>> basicDbProperty;

        private BasicInfo(Builder builder) {
            this.basicDbProperty = builder.basicDbProperty;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicInfo create() {
            return builder().build();
        }

        /**
         * @return basicDbProperty
         */
        public java.util.List < java.util.Map<String, ?>> getBasicDbProperty() {
            return this.basicDbProperty;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> basicDbProperty; 

            /**
             * BasicDbProperty.
             */
            public Builder basicDbProperty(java.util.List < java.util.Map<String, ?>> basicDbProperty) {
                this.basicDbProperty = basicDbProperty;
                return this;
            }

            public BasicInfo build() {
                return new BasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class RuntimeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuntimeDbProperty")
        private java.util.List < java.util.Map<String, ?>> runtimeDbProperty;

        private RuntimeInfo(Builder builder) {
            this.runtimeDbProperty = builder.runtimeDbProperty;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeInfo create() {
            return builder().build();
        }

        /**
         * @return runtimeDbProperty
         */
        public java.util.List < java.util.Map<String, ?>> getRuntimeDbProperty() {
            return this.runtimeDbProperty;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> runtimeDbProperty; 

            /**
             * RuntimeDbProperty.
             */
            public Builder runtimeDbProperty(java.util.List < java.util.Map<String, ?>> runtimeDbProperty) {
                this.runtimeDbProperty = runtimeDbProperty;
                return this;
            }

            public RuntimeInfo build() {
                return new RuntimeInfo(this);
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

        @com.aliyun.core.annotation.NameInMap("AdvancedInfo")
        private AdvancedInfo advancedInfo;

        @com.aliyun.core.annotation.NameInMap("BasicInfo")
        private BasicInfo basicInfo;

        @com.aliyun.core.annotation.NameInMap("CharacterSetName")
        private String characterSetName;

        @com.aliyun.core.annotation.NameInMap("Collate")
        private String collate;

        @com.aliyun.core.annotation.NameInMap("ConnLimit")
        private String connLimit;

        @com.aliyun.core.annotation.NameInMap("Ctype")
        private String ctype;

        @com.aliyun.core.annotation.NameInMap("DBDescription")
        private String DBDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DBStatus")
        private String DBStatus;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RuntimeInfo")
        private RuntimeInfo runtimeInfo;

        @com.aliyun.core.annotation.NameInMap("Tablespace")
        private String tablespace;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Database(Builder builder) {
            this.accounts = builder.accounts;
            this.advancedInfo = builder.advancedInfo;
            this.basicInfo = builder.basicInfo;
            this.characterSetName = builder.characterSetName;
            this.collate = builder.collate;
            this.connLimit = builder.connLimit;
            this.ctype = builder.ctype;
            this.DBDescription = builder.DBDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBName = builder.DBName;
            this.DBStatus = builder.DBStatus;
            this.engine = builder.engine;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.runtimeInfo = builder.runtimeInfo;
            this.tablespace = builder.tablespace;
            this.totalCount = builder.totalCount;
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
         * @return advancedInfo
         */
        public AdvancedInfo getAdvancedInfo() {
            return this.advancedInfo;
        }

        /**
         * @return basicInfo
         */
        public BasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        /**
         * @return characterSetName
         */
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        /**
         * @return collate
         */
        public String getCollate() {
            return this.collate;
        }

        /**
         * @return connLimit
         */
        public String getConnLimit() {
            return this.connLimit;
        }

        /**
         * @return ctype
         */
        public String getCtype() {
            return this.ctype;
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

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return runtimeInfo
         */
        public RuntimeInfo getRuntimeInfo() {
            return this.runtimeInfo;
        }

        /**
         * @return tablespace
         */
        public String getTablespace() {
            return this.tablespace;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Accounts accounts; 
            private AdvancedInfo advancedInfo; 
            private BasicInfo basicInfo; 
            private String characterSetName; 
            private String collate; 
            private String connLimit; 
            private String ctype; 
            private String DBDescription; 
            private String DBInstanceId; 
            private String DBName; 
            private String DBStatus; 
            private String engine; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private RuntimeInfo runtimeInfo; 
            private String tablespace; 
            private Integer totalCount; 

            /**
             * <p>The information about the account. Each account has specific permissions on the database.</p>
             */
            public Builder accounts(Accounts accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>The advanced information about the database.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             */
            public Builder advancedInfo(AdvancedInfo advancedInfo) {
                this.advancedInfo = advancedInfo;
                return this;
            }

            /**
             * <p>The basic information about the database.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             */
            public Builder basicInfo(BasicInfo basicInfo) {
                this.basicInfo = basicInfo;
                return this;
            }

            /**
             * <p>The name of the character set.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
             */
            public Builder characterSetName(String characterSetName) {
                this.characterSetName = characterSetName;
                return this;
            }

            /**
             * <p>The collation of the character set. The example value C indicates localization.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>C</p>
             */
            public Builder collate(String collate) {
                this.collate = collate;
                return this;
            }

            /**
             * <p>The limit on the number of concurrent requests. The value -1 indicates that the number of concurrent requests is unlimited.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder connLimit(String connLimit) {
                this.connLimit = connLimit;
                return this;
            }

            /**
             * <p>The type of the character set.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>en_US.utf8</p>
             */
            public Builder ctype(String ctype) {
                this.ctype = ctype;
                return this;
            }

            /**
             * <p>The description of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder DBDescription(String DBDescription) {
                this.DBDescription = DBDescription;
                return this;
            }

            /**
             * <p>The ID of the instance to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB01</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The database status. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Running</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Cold</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder DBStatus(String DBStatus) {
                this.DBStatus = DBStatus;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The page number of the page to return.</p>
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
             * <p>30</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The runtime information about the database.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             */
            public Builder runtimeInfo(RuntimeInfo runtimeInfo) {
                this.runtimeInfo = runtimeInfo;
                return this;
            }

            /**
             * <p>The database tablespace.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run PostgreSQL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pg_default</p>
             */
            public Builder tablespace(String tablespace) {
                this.tablespace = tablespace;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
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
