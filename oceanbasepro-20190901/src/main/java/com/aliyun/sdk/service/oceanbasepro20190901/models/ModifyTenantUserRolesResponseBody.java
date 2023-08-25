// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantUserRolesResponseBody</p>
 */
public class ModifyTenantUserRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantUser")
    private TenantUser tenantUser;

    private ModifyTenantUserRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantUser = builder.tenantUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantUserRolesResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantUser(TenantUser tenantUser) {
            this.tenantUser = tenantUser;
            return this;
        }

        public ModifyTenantUserRolesResponseBody build() {
            return new ModifyTenantUserRolesResponseBody(this);
        } 

    } 

    public static class UserRole extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("IsSuccess")
        private Boolean isSuccess;

        @NameInMap("Role")
        private String role;

        @NameInMap("Table")
        private String table;

        private UserRole(Builder builder) {
            this.database = builder.database;
            this.isSuccess = builder.isSuccess;
            this.role = builder.role;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserRole create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return isSuccess
         */
        public Boolean getIsSuccess() {
            return this.isSuccess;
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
            private Boolean isSuccess; 
            private String role; 
            private String table; 

            /**
             * ```
             * <p>
             * http(s)://[Endpoint]/?Action=ModifyTenantUserRoles
             * &UserName=pay_test
             * &TenantId=ob2mr3oae0****
             * &UserRole=[{"Database":"20210824160559","Role":"readwrite"}]
             * &InstanceId=ob317v4uif****
             * &ModifyType=update
             * &Common request parameters
             * ```
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * IsSuccess.
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * You can call this operation to modify the database privileges of a specified account in a tenant.
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

            public UserRole build() {
                return new UserRole(this);
            } 

        } 

    }
    public static class TenantUser extends TeaModel {
        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserRole")
        private java.util.List < UserRole> userRole;

        private TenantUser(Builder builder) {
            this.tenantId = builder.tenantId;
            this.userName = builder.userName;
            this.userRole = builder.userRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantUser create() {
            return builder().build();
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
         * @return userRole
         */
        public java.util.List < UserRole> getUserRole() {
            return this.userRole;
        }

        public static final class Builder {
            private String tenantId; 
            private String userName; 
            private java.util.List < UserRole> userRole; 

            /**
             * TenantId.
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
             * The name of the database (MySQL mode) or schema (Oracle mode).
             */
            public Builder userRole(java.util.List < UserRole> userRole) {
                this.userRole = userRole;
                return this;
            }

            public TenantUser build() {
                return new TenantUser(this);
            } 

        } 

    }
}
