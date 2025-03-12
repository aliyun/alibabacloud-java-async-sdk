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
 * {@link ModifyTenantUserRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantUserRolesResponseBody</p>
 */
public class ModifyTenantUserRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantUser")
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
         * <p>The ID of the tenant.</p>
         */
        public Builder tenantUser(TenantUser tenantUser) {
            this.tenantUser = tenantUser;
            return this;
        }

        public ModifyTenantUserRolesResponseBody build() {
            return new ModifyTenantUserRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTenantUserRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyTenantUserRolesResponseBody</p>
     */
    public static class UserRole extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private Boolean isSuccess;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Table")
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
             * <pre><code>http(s)://[Endpoint]/?Action=ModifyTenantUserRoles
             * &amp;UserName=pay_test
             * &amp;TenantId=ob2mr3oae0****
             * &amp;UserRole=[{&quot;Database&quot;:&quot;20210824160559&quot;,&quot;Role&quot;:&quot;readwrite&quot;}]
             * &amp;InstanceId=ob317v4uif****
             * &amp;ModifyType=update
             * &amp;Common request parameters
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>db_pay1</p>
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
             * <p>You can call this operation to modify the database privileges of a specified account in a tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>ReadOnly</p>
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
    /**
     * 
     * {@link ModifyTenantUserRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyTenantUserRolesResponseBody</p>
     */
    public static class TenantUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserRole")
        private java.util.List<UserRole> userRole;

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
        public java.util.List<UserRole> getUserRole() {
            return this.userRole;
        }

        public static final class Builder {
            private String tenantId; 
            private String userName; 
            private java.util.List<UserRole> userRole; 

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
             * <p>The name of the database (MySQL mode) or schema (Oracle mode).</p>
             * 
             * <strong>example:</strong>
             * <p>账号具备的数据库权限信息列表。</p>
             */
            public Builder userRole(java.util.List<UserRole> userRole) {
                this.userRole = userRole;
                return this;
            }

            public TenantUser build() {
                return new TenantUser(this);
            } 

        } 

    }
}
