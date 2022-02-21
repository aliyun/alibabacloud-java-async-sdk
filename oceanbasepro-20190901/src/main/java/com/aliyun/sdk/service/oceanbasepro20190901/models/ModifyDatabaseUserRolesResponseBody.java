// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseUserRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDatabaseUserRolesResponseBody</p>
 */
public class ModifyDatabaseUserRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantUser")
    private TenantUser tenantUser;

    private ModifyDatabaseUserRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantUser = builder.tenantUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseUserRolesResponseBody create() {
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
    public TenantUser getTenantUser() {
        return this.tenantUser;
    }

    public static final class Builder {
        private String requestId; 
        private TenantUser tenantUser; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 账号信息。
         */
        public Builder tenantUser(TenantUser tenantUser) {
            this.tenantUser = tenantUser;
            return this;
        }

        public ModifyDatabaseUserRolesResponseBody build() {
            return new ModifyDatabaseUserRolesResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @NameInMap("Role")
        private String role;

        @NameInMap("UserName")
        private String userName;

        private Users(Builder builder) {
            this.role = builder.role;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
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

        public static final class Builder {
            private String role; 
            private String userName; 

            /**
             * 账号赋予该库的角色权限。 对于MySQL模式，角色为数据库（Database）级别，其有以下几类： - ReadWrite：读写权限，包括ALL PRIVILEGES； - ReadOnly：只读权限，包括SELECT - DDL: DDL权限，包括CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW - DML: DML权限，包括SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 账号名称。
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    public static class TenantUser extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("Users")
        private java.util.List < Users> users;

        private TenantUser(Builder builder) {
            this.databaseName = builder.databaseName;
            this.tenantId = builder.tenantId;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantUser create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return users
         */
        public java.util.List < Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String databaseName; 
            private String tenantId; 
            private java.util.List < Users> users; 

            /**
             * 数据库名称。
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * 租户ID。
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * 对数据库有赋权的账户信息
             */
            public Builder users(java.util.List < Users> users) {
                this.users = users;
                return this;
            }

            public TenantUser build() {
                return new TenantUser(this);
            } 

        } 

    }
}
