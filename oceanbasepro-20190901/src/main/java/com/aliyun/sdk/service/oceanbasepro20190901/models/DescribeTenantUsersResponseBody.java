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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 租户中的数据库账号信息
         */
        public Builder tenantUsers(java.util.List < TenantUsers> tenantUsers) {
            this.tenantUsers = tenantUsers;
            return this;
        }

        /**
         * 租户中的数据库账号总数。
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
             * 数据库(schema)名称
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * 拥有的角色。 对于Oracle模式，角色为schema级别，其可分为 - ReadWrite：读写权限，包括CREATE TABLE CREATE VIEW CREATE PROCEDURE CREATE SYNONYM CREATE SEQUENCE CREATE TRIGGER CREATE TYPE CREATE SESSION EXECUTE ANY PROCEDURE CREATE ANY OUTLINE ALTER ANY OUTLINE DROP ANY OUTLINE CREATE ANY PROCEDURE ALTER ANY PROCEDURE DROP ANY PROCEDURE CREATE ANY SEQUENCE ALTER ANY SEQUENCE DROP ANY SEQUENCE CREATE ANY TYPE ALTER ANY TYPE DROP ANY TYPE SYSKM CREATE ANY TRIGGER ALTER ANY TRIGGER DROP ANY TRIGGER CREATE PROFILE ALTER PROFILE DROP PROFILE； - ReadOnly：只读权限，SELECT
             * <p>
             * 对于MySQL模式，角色为数据库（Database）级别，其有以下几类： - ReadWrite：读写权限，包括ALL PRIVILEGES； - ReadOnly：只读权限，包括SELECT - DDL: DDL权限，包括CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW - DML: DML权限，包括SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
             * * 另外Oracle账户对自己的schema有默认的读写权限，这里不会列出。
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 表的名称。
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

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserStatus")
        private String userStatus;

        @NameInMap("UserType")
        private String userType;

        private TenantUsers(Builder builder) {
            this.databases = builder.databases;
            this.description = builder.description;
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
            private String userName; 
            private String userStatus; 
            private String userType; 

            /**
             * 账号具备的数据库权限信息。
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * 数据库账号的描述信息。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 数据库账号名称。
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * 数据库账号的状态。 - LOCKED：锁定 - ONLINE：解锁
             */
            public Builder userStatus(String userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            /**
             * 数据库账号类型。 - Admin：超级账户 - Normal：普通账户
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
