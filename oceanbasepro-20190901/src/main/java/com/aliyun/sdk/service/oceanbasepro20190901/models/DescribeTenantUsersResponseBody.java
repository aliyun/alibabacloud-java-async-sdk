// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantUsersResponseBody</p>
 */
public class DescribeTenantUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantUsers")
    private java.util.List<TenantUsers> tenantUsers;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TenantUsers> getTenantUsers() {
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
        private java.util.List<TenantUsers> tenantUsers; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTenantUsersResponseBody model) {
            this.requestId = model.requestId;
            this.tenantUsers = model.tenantUsers;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the database account. Valid values:    </p>
         * <ul>
         * <li>Admin: the super administrator account.   </li>
         * <li>NORMAL: a general account.</li>
         * </ul>
         */
        public Builder tenantUsers(java.util.List<TenantUsers> tenantUsers) {
            this.tenantUsers = tenantUsers;
            return this;
        }

        /**
         * <p>The role of the account.<br>In Oracle mode, a role is a schema-level role. Valid values:  </p>
         * <ul>
         * <li>ReadWrite: a role that has the read and write privileges, including: CREATE TABLE, CREATE VIEW, CREATE PROCEDURE, CREATE SYNONYM, CREATE SEQUENCE, CREATE TRIGGER, CREATE TYPE, CREATE SESSION, EXECUTE ANY PROCEDURE, CREATE ANY OUTLINE, ALTER ANY OUTLINE, DROP ANY OUTLINE, CREATE ANY PROCEDURE, ALTER ANY PROCEDURE, DROP ANY PROCEDURE, CREATE ANY SEQUENCE, ALTER ANY SEQUENCE, DROP ANY SEQUENCE, CREATE ANY TYPE, ALTER ANY TYPE, DROP ANY TYPE, SYSKM, CREATE ANY TRIGGER, ALTER ANY TRIGGER, DROP ANY TRIGGER, CREATE PROFILE, ALTER PROFILE, and DROP PROFILE.  </li>
         * <li>ReadOnly: a role that has only the read-only privilege SELECT.
         * In MySQL mode, a role is a database-level role. Valid values: </li>
         * <li>ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.   </li>
         * <li>ReadOnly: a role that has only the read-only privilege SELECT.   </li>
         * <li>DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.   </li>
         * <li>DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.</li>
         * </ul>
         * <blockquote>
         * <p><br>By default, an Oracle account has the read and write privileges on its own schema, which are not listed here.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantUsersResponseBody build() {
            return new DescribeTenantUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTenantUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantUsersResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Privileges")
        private String privileges;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        private Databases(Builder builder) {
            this.database = builder.database;
            this.privileges = builder.privileges;
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
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String database; 
            private String privileges; 
            private String role; 
            private String table; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.database = model.database;
                this.privileges = model.privileges;
                this.role = model.role;
                this.table = model.table;
            } 

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Privileges.
             */
            public Builder privileges(String privileges) {
                this.privileges = privileges;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Table.
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
    /**
     * 
     * {@link DescribeTenantUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantUsersResponseBody</p>
     */
    public static class TenantUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List<Databases> databases;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GlobalPermissions")
        private String globalPermissions;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private String userStatus;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private TenantUsers(Builder builder) {
            this.databases = builder.databases;
            this.description = builder.description;
            this.globalPermissions = builder.globalPermissions;
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
        public java.util.List<Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return globalPermissions
         */
        public String getGlobalPermissions() {
            return this.globalPermissions;
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
            private java.util.List<Databases> databases; 
            private String description; 
            private String globalPermissions; 
            private String instanceId; 
            private String tenantId; 
            private String userName; 
            private String userStatus; 
            private String userType; 

            private Builder() {
            } 

            private Builder(TenantUsers model) {
                this.databases = model.databases;
                this.description = model.description;
                this.globalPermissions = model.globalPermissions;
                this.instanceId = model.instanceId;
                this.tenantId = model.tenantId;
                this.userName = model.userName;
                this.userStatus = model.userStatus;
                this.userType = model.userType;
            } 

            /**
             * Databases.
             */
            public Builder databases(java.util.List<Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GlobalPermissions.
             */
            public Builder globalPermissions(String globalPermissions) {
                this.globalPermissions = globalPermissions;
                return this;
            }

            /**
             * <p>所属集群Id</p>
             * 
             * <strong>example:</strong>
             * <p>obshc32****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>所属租户Id</p>
             * 
             * <strong>example:</strong>
             * <p>tshfs3****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserStatus.
             */
            public Builder userStatus(String userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            /**
             * UserType.
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
