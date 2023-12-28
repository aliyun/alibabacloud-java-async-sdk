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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of database accounts in the tenant.
         */
        public Builder tenantUser(TenantUser tenantUser) {
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
             * Roles.
             */
            public Builder roles(java.util.List < Roles> roles) {
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
