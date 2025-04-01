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
 * {@link CreateTenantUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTenantUserResponseBody</p>
 */
public class CreateTenantUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantUser")
    private TenantUser tenantUser;

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

        private Builder(CreateTenantUserResponseBody model) {
            this.requestId = model.requestId;
            this.tenantUser = model.tenantUser;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of database accounts in the tenant.</p>
         */
        public Builder tenantUser(TenantUser tenantUser) {
            this.tenantUser = tenantUser;
            return this;
        }

        public CreateTenantUserResponseBody build() {
            return new CreateTenantUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTenantUserResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTenantUserResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Role")
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

            private Builder() {
            } 

            private Builder(Roles model) {
                this.database = model.database;
                this.role = model.role;
            } 

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Role.
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
    /**
     * 
     * {@link CreateTenantUserResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTenantUserResponseBody</p>
     */
    public static class TenantUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalPermissions")
        private String globalPermissions;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private String userStatus;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private TenantUser(Builder builder) {
            this.globalPermissions = builder.globalPermissions;
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
         * @return globalPermissions
         */
        public String getGlobalPermissions() {
            return this.globalPermissions;
        }

        /**
         * @return roles
         */
        public java.util.List<Roles> getRoles() {
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
            private String globalPermissions; 
            private java.util.List<Roles> roles; 
            private String userName; 
            private String userStatus; 
            private String userType; 

            private Builder() {
            } 

            private Builder(TenantUser model) {
                this.globalPermissions = model.globalPermissions;
                this.roles = model.roles;
                this.userName = model.userName;
                this.userStatus = model.userStatus;
                this.userType = model.userType;
            } 

            /**
             * GlobalPermissions.
             */
            public Builder globalPermissions(String globalPermissions) {
                this.globalPermissions = globalPermissions;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
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

            public TenantUser build() {
                return new TenantUser(this);
            } 

        } 

    }
}
