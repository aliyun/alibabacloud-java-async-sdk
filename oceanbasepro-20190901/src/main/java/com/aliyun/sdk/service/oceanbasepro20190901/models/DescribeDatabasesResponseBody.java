// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
    private java.util.List < Databases> databases;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
    public java.util.List < Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Databases> databases; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of databases in the tenant.
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.databases = databases;
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
         * The total number of databases in the tenant.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatabasesResponseBody build() {
            return new DescribeDatabasesResponseBody(this);
        } 

    } 

    public static class Tables extends TeaModel {
        @NameInMap("TableName")
        private String tableName;

        private Tables(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            /**
             * The name of the database table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("Privileges")
        private String privileges;

        @NameInMap("Role")
        private String role;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserType")
        private String userType;

        private Users(Builder builder) {
            this.privileges = builder.privileges;
            this.role = builder.role;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return privileges
         */
        public String getPrivileges() {
            return this.privileges;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String privileges; 
            private String role; 
            private String userName; 
            private String userType; 

            /**
             * If you have granted custom privileges on the database, this parameter indicates the custom privileges, separated by commas (,). Otherwise, no data is returned for this parameter.
             */
            public Builder privileges(String privileges) {
                this.privileges = privileges;
                return this;
            }

            /**
             * The role of the account.    
             * <p>
             * In MySQL mode, a role is a database-level role. Valid values:  
             * - ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.  
             * - ReadOnly: a role that has only the read-only privilege SELECT.   
             * - DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.   
             * - DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The name of the account.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The type of the account. Valid values:  
             * <p>
             * - Admin: the super administrator account. 
             * - Normal: a general account.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @NameInMap("Collation")
        private String collation;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataSize")
        private Double dataSize;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RequiredSize")
        private Double requiredSize;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tables")
        private java.util.List < Tables> tables;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("Users")
        private java.util.List < Users> users;

        private Databases(Builder builder) {
            this.collation = builder.collation;
            this.createTime = builder.createTime;
            this.dataSize = builder.dataSize;
            this.databaseName = builder.databaseName;
            this.dbType = builder.dbType;
            this.description = builder.description;
            this.encoding = builder.encoding;
            this.instanceId = builder.instanceId;
            this.requiredSize = builder.requiredSize;
            this.status = builder.status;
            this.tables = builder.tables;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return collation
         */
        public String getCollation() {
            return this.collation;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSize
         */
        public Double getDataSize() {
            return this.dataSize;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return requiredSize
         */
        public Double getRequiredSize() {
            return this.requiredSize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return users
         */
        public java.util.List < Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String collation; 
            private String createTime; 
            private Double dataSize; 
            private String databaseName; 
            private String dbType; 
            private String description; 
            private String encoding; 
            private String instanceId; 
            private Double requiredSize; 
            private String status; 
            private java.util.List < Tables> tables; 
            private String tenantId; 
            private String tenantName; 
            private java.util.List < Users> users; 

            /**
             * The collation.
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * The time when the database was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The actual data size, in GB. 
             * <p>
             * ><notice>This parameter is no longer used in later versions. RequiredSize is used instead.></notice>
             */
            public Builder dataSize(Double dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database type.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The description of the database.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The encoding standard of the database. Encoding standards such as utf8mb4 and GBK are supported.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The ID of the cluster to which the tenant belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The storage space required, in GB.
             */
            public Builder requiredSize(Double requiredSize) {
                this.requiredSize = requiredSize;
                return this;
            }

            /**
             * The status of the database. Valid values:    
             * <p>
             * - ONLINE: The database is running.  
             * - DELETING: The database is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The list of database tables.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The name of the tenant.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * The list of accounts that are granted privileges on this database.
             */
            public Builder users(java.util.List < Users> users) {
                this.users = users;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
