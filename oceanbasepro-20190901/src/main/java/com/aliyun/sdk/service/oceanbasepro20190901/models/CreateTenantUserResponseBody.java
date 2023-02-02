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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of database accounts in the tenant.
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
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The role of the account.   
             * <p>
             * In Oracle mode, a role is a schema-level role. Valid values:  
             * 
             * - ReadWrite: a role that has the read and write privileges, including CREATE TABLE, CREATE VIEW, CREATE PROCEDURE, CREATE SYNONYM, CREATE SEQUENCE, CREATE TRIGGER, CREATE TYPE, CREATE SESSION, EXECUTE ANY PROCEDURE, CREATE ANY OUTLINE, ALTER ANY OUTLINE, DROP ANY OUTLINE, CREATE ANY PROCEDURE, ALTER ANY PROCEDURE, DROP ANY PROCEDURE, CREATE ANY SEQUENCE, ALTER ANY SEQUENCE, DROP ANY SEQUENCE, CREATE ANY TYPE, ALTER ANY TYPE, DROP ANY TYPE, SYSKM, CREATE ANY TRIGGER, ALTER ANY TRIGGER, DROP ANY TRIGGER, CREATE PROFILE, ALTER PROFILE, and DROP PROFILE.   
             * - ReadOnly: a role that has only the read-only privilege SELECT. 
             * 
             * In MySQL mode, a role is a database-level role. Valid values:  
             * 
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
             * The roles of the accounts.
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
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
             * - Locked: The account is locked.   
             * - ONLINE: The account is unlocked. The default status of a new account is ONLINE after it is created.
             */
            public Builder userStatus(String userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            /**
             * The type of the database account. Valid values:   
             * <p>
             *  - Admin: the super administrator account.   
             *  - Normal: a general account.
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
