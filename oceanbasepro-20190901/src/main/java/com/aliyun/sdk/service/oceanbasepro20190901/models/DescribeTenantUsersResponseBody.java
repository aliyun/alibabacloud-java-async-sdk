// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantUsersResponseBody</p>
 */
public class DescribeTenantUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantUsers")
    private java.util.List < TenantUsers> tenantUsers;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTenantUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantUsers = builder.tenantUsers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantUsers
     */
    public java.util.List < TenantUsers> getTenantUsers() {
        return this.tenantUsers;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TenantUsers> tenantUsers; 
        private Integer totalCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of database accounts in the tenant.
         */
        public Builder tenantUsers(java.util.List < TenantUsers> tenantUsers) {
            this.tenantUsers = tenantUsers;
            return this;
        }

        /**
         * The total number of database accounts in the tenant.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantUsersResponseBody build() {
            return new DescribeTenantUsersResponseBody(this);
        } 

    } 

    public static class Databases extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Role")
        private String role;

        @NameInMap("Table")
        private String table;

        private Databases(Builder builder) {
            this.database = builder.database;
            this.role = builder.role;
            this.table = builder.table;
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
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String database; 
            private String role; 
            private String table; 

            /**
             * The name of the database (MySQL mode) or schema (Oracle mode).
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The role of the account.   
             * <p>
             * In Oracle mode, a role is a schema-level role. Valid values:  
             * - ReadWrite: a role that has the read and write privileges, including: CREATE TABLE, CREATE VIEW, CREATE PROCEDURE, CREATE SYNONYM, CREATE SEQUENCE, CREATE TRIGGER, CREATE TYPE, CREATE SESSION, EXECUTE ANY PROCEDURE, CREATE ANY OUTLINE, ALTER ANY OUTLINE, DROP ANY OUTLINE, CREATE ANY PROCEDURE, ALTER ANY PROCEDURE, DROP ANY PROCEDURE, CREATE ANY SEQUENCE, ALTER ANY SEQUENCE, DROP ANY SEQUENCE, CREATE ANY TYPE, ALTER ANY TYPE, DROP ANY TYPE, SYSKM, CREATE ANY TRIGGER, ALTER ANY TRIGGER, DROP ANY TRIGGER, CREATE PROFILE, ALTER PROFILE, and DROP PROFILE.  
             * - ReadOnly: a role that has only the read-only privilege SELECT.
             * In MySQL mode, a role is a database-level role. Valid values: 
             * - ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.   
             * - ReadOnly: a role that has only the read-only privilege SELECT.   
             * - DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.   
             * - DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.   
             * 
             * > <br>By default, an Oracle account has the read and write privileges on its own schema, which are not listed here.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    public static class TenantUsers extends TeaModel {
        @NameInMap("Databases")
        private java.util.List < Databases> databases;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserStatus")
        private String userStatus;

        @NameInMap("UserType")
        private String userType;

        private TenantUsers(Builder builder) {
            this.databases = builder.databases;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.tenantId = builder.tenantId;
            this.userName = builder.userName;
            this.userStatus = builder.userStatus;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantUsers create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userStatus
         */
        public String getUserStatus() {
            return this.userStatus;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private java.util.List < Databases> databases; 
            private String description; 
            private String instanceId; 
            private String tenantId; 
            private String userName; 
            private String userStatus; 
            private String userType; 

            /**
             * The database privileges of the account.
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * The description of the database account.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 所属集群Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 所属租户Id
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The name of the database account.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The status of the database account. Valid values:   
             * <p>
             *  - LOCKED: The account is locked.   
             * - NORMAL: The account is unlocked.
             */
            public Builder userStatus(String userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            /**
             * The type of the database account. Valid values:    
             * <p>
             * - Admin: the super administrator account.   
             * - NORMAL: a general account.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public TenantUsers build() {
                return new TenantUsers(this);
            } 

        } 

    }
}
