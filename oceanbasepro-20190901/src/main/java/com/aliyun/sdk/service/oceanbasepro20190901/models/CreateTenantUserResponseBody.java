// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTenantUserResponseBody</p>
 */
public class CreateTenantUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantUser")
    private java.util.List < TenantUser> tenantUser;

    private CreateTenantUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantUser = builder.tenantUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantUser
     */
    public java.util.List < TenantUser> getTenantUser() {
        return this.tenantUser;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TenantUser> tenantUser; 

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
        public Builder tenantUser(java.util.List < TenantUser> tenantUser) {
            this.tenantUser = tenantUser;
            return this;
        }

        public CreateTenantUserResponseBody build() {
            return new CreateTenantUserResponseBody(this);
        } 

    } 

    public static class Roles extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Role")
        private String role;

        private Roles(Builder builder) {
            this.database = builder.database;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
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

        public static final class Builder {
            private String database; 
            private String role; 

            /**
             * 数据库名称
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

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class TenantUser extends TeaModel {
        @NameInMap("Roles")
        private java.util.List < Roles> roles;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserStatus")
        private String userStatus;

        @NameInMap("UserType")
        private String userType;

        private TenantUser(Builder builder) {
            this.roles = builder.roles;
            this.userName = builder.userName;
            this.userStatus = builder.userStatus;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantUser create() {
            return builder().build();
        }

        /**
         * @return roles
         */
        public java.util.List < Roles> getRoles() {
            return this.roles;
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
            private java.util.List < Roles> roles; 
            private String userName; 
            private String userStatus; 
            private String userType; 

            /**
             * 账户对应的角色权限信息
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
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
             * 数据库账号的状态。 - Locked：锁定 - ONLINE：解锁 创建完的账户默认为ONLINE状态
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

            public TenantUser build() {
                return new TenantUser(this);
            } 

        } 

    }
}
