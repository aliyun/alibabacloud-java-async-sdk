// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDatabasesZonalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabasesZonalResponseBody</p>
 */
public class DescribeDatabasesZonalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<Databases> databases;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDatabasesZonalResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabasesZonalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databases
     */
    public java.util.List<Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<Databases> databases; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDatabasesZonalResponseBody model) {
            this.databases = model.databases;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the databases.</p>
         */
        public Builder databases(java.util.List<Databases> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The query token. This is the NextToken value from the previous API call. If there are no more results, do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>212db86sca4384811e0b5e8707e******</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatabasesZonalResponseBody build() {
            return new DescribeDatabasesZonalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatabasesZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesZonalResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("PrivilegeStatus")
        private String privilegeStatus;

        private Accounts(Builder builder) {
            this.accountName = builder.accountName;
            this.accountPrivilege = builder.accountPrivilege;
            this.accountStatus = builder.accountStatus;
            this.privilegeStatus = builder.privilegeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
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

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountName = model.accountName;
                this.accountPrivilege = model.accountPrivilege;
                this.accountStatus = model.accountStatus;
                this.privilegeStatus = model.privilegeStatus;
            } 

            /**
             * <p>The account name.</p>
             * <blockquote>
             * <p>If the cluster is a PolarDB for MySQL cluster, privileged accounts are not included.</p>
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
             * <p>The permissions of the account. Valid values:</p>
             * <ul>
             * <li><p><strong>ReadWrite</strong></p>
             * </li>
             * <li><p><strong>ReadOnly</strong></p>
             * </li>
             * <li><p><strong>DMLOnly</strong></p>
             * </li>
             * <li><p><strong>DDLOnly</strong></p>
             * </li>
             * <li><p><strong>ReadIndex</strong></p>
             * </li>
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
             * <p>The status of the account. Valid values:</p>
             * <ul>
             * <li><p><strong>Creating</strong></p>
             * </li>
             * <li><p><strong>Available</strong></p>
             * </li>
             * <li><p><strong>Deleting</strong></p>
             * </li>
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
             * <p>The authorization status. Valid values:</p>
             * <ul>
             * <li><p><strong>Empowering</strong>: Permissions are being granted.</p>
             * </li>
             * <li><p><strong>Empowered</strong>: Permissions are granted.</p>
             * </li>
             * <li><p><strong>Removing</strong>: Permissions are being revoked.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Empowered</p>
             */
            public Builder privilegeStatus(String privilegeStatus) {
                this.privilegeStatus = privilegeStatus;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDatabasesZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesZonalResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        private java.util.List<Accounts> accounts;

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

        private Databases(Builder builder) {
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

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public java.util.List<Accounts> getAccounts() {
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
            private java.util.List<Accounts> accounts; 
            private String characterSetName; 
            private String DBDescription; 
            private String DBName; 
            private String DBStatus; 
            private String engine; 
            private String masterID; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.accounts = model.accounts;
                this.characterSetName = model.characterSetName;
                this.DBDescription = model.DBDescription;
                this.DBName = model.DBName;
                this.DBStatus = model.DBStatus;
                this.engine = model.engine;
                this.masterID = model.masterID;
            } 

            /**
             * <p>The details of the database accounts.</p>
             * <blockquote>
             * <p>If the cluster is a PolarDB for MySQL cluster, privileged accounts are not included.</p>
             * </blockquote>
             */
            public Builder accounts(java.util.List<Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>The character set.</p>
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
             * <p>The status of the database. Valid values:</p>
             * <ul>
             * <li><p><strong>Creating</strong></p>
             * </li>
             * <li><p><strong>Running</strong></p>
             * </li>
             * <li><p><strong>Deleting</strong></p>
             * </li>
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
             * <p>The database engine type. Valid values:</p>
             * <ul>
             * <li><p><strong>MySQL</strong></p>
             * </li>
             * <li><p><strong>Oracle</strong></p>
             * </li>
             * <li><p><strong>PostgreSQL</strong></p>
             * </li>
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
             * <p>The ID of the primary node that corresponds to the database in a Multi-master Cluster (Database/Table) edition cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder masterID(String masterID) {
                this.masterID = masterID;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
