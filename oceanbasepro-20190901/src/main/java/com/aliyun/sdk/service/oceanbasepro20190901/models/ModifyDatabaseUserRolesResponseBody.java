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
 * {@link ModifyDatabaseUserRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDatabaseUserRolesResponseBody</p>
 */
public class ModifyDatabaseUserRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantUser")
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
     * @return tenantUser
     */
    public TenantUser getTenantUser() {
        return this.tenantUser;
    }

    public static final class Builder {
        private String requestId; 
        private TenantUser tenantUser; 

        private Builder() {
        } 

        private Builder(ModifyDatabaseUserRolesResponseBody model) {
            this.requestId = model.requestId;
            this.tenantUser = model.tenantUser;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         */
        public Builder tenantUser(TenantUser tenantUser) {
            this.tenantUser = tenantUser;
            return this;
        }

        public ModifyDatabaseUserRolesResponseBody build() {
            return new ModifyDatabaseUserRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDatabaseUserRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDatabaseUserRolesResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(Users model) {
                this.role = model.role;
                this.userName = model.userName;
            } 

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * UserName.
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
    /**
     * 
     * {@link ModifyDatabaseUserRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDatabaseUserRolesResponseBody</p>
     */
    public static class TenantUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List<Users> users;

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
        public java.util.List<Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String databaseName; 
            private String tenantId; 
            private java.util.List<Users> users; 

            private Builder() {
            } 

            private Builder(TenantUser model) {
                this.databaseName = model.databaseName;
                this.tenantId = model.tenantId;
                this.users = model.users;
            } 

            /**
             * <p>Example 1</p>
             * 
             * <strong>example:</strong>
             * <p>sms_pre</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Users.
             */
            public Builder users(java.util.List<Users> users) {
                this.users = users;
                return this;
            }

            public TenantUser build() {
                return new TenantUser(this);
            } 

        } 

    }
}
