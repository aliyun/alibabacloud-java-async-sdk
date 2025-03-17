// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryOrganizationRoleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrganizationRoleConfigResponseBody</p>
 */
public class QueryOrganizationRoleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryOrganizationRoleConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrganizationRoleConfigResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryOrganizationRoleConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BCE45E6D-9304-4F94-86BB-5A772B1615FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of the organization role configuration.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request was successful </li>
         * <li>false: The request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryOrganizationRoleConfigResponseBody build() {
            return new QueryOrganizationRoleConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOrganizationRoleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrganizationRoleConfigResponseBody</p>
     */
    public static class AuthConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        private AuthConfigList(Builder builder) {
            this.authKey = builder.authKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConfigList create() {
            return builder().build();
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        public static final class Builder {
            private String authKey; 

            private Builder() {
            } 

            private Builder(AuthConfigList model) {
                this.authKey = model.authKey;
            } 

            /**
             * <p>Permission type:</p>
             * <ul>
             * <li>quick_monitor: Metric Monitoring</li>
             * <li>subscription: Subscription Management</li>
             * <li>offline_download: Self-service Data Retrieval</li>
             * <li>resource_package: Resource Package Management</li>
             * <li>organization_ask: Organization Access Key/Secret (AK/SK)</li>
             * <li>developer_openapi: Open API</li>
             * <li>data_service: Data Service</li>
             * <li>admin_authorize3rd: Embedded Analysis</li>
             * <li>component_manage: Custom Component</li>
             * <li>template_open: Custom Template</li>
             * <li>custom_driver: Custom Driver (supported only in standalone deployment)</li>
             * <li>open_platform_custom_plugin: Custom Plugin (supported only in standalone deployment)</li>
             * <li>enterprise_safety: Enterprise Security</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>quick_monitor</p>
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            public AuthConfigList build() {
                return new AuthConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrganizationRoleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrganizationRoleConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthConfigList")
        private java.util.List<AuthConfigList> authConfigList;

        @com.aliyun.core.annotation.NameInMap("IsSystemRole")
        private Boolean isSystemRole;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private Long roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private Result(Builder builder) {
            this.authConfigList = builder.authConfigList;
            this.isSystemRole = builder.isSystemRole;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authConfigList
         */
        public java.util.List<AuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        /**
         * @return isSystemRole
         */
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        /**
         * @return roleId
         */
        public Long getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private java.util.List<AuthConfigList> authConfigList; 
            private Boolean isSystemRole; 
            private Long roleId; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authConfigList = model.authConfigList;
                this.isSystemRole = model.isSystemRole;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
            } 

            /**
             * <p>List of role permission configurations.</p>
             */
            public Builder authConfigList(java.util.List<AuthConfigList> authConfigList) {
                this.authConfigList = authConfigList;
                return this;
            }

            /**
             * <p>Whether it is a predefined role. Possible values:</p>
             * <ul>
             * <li>true: Yes</li>
             * <li>false: No</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSystemRole(Boolean isSystemRole) {
                this.isSystemRole = isSystemRole;
                return this;
            }

            /**
             * <p>Organization role ID, including predefined roles and custom roles:</p>
             * <ul>
             * <li>Organization Administrator (predefined role): 111111111</li>
             * <li>Permission Administrator (predefined role): 111111112</li>
             * <li>Regular User (predefined role): 111111113</li>
             * <li>Custom Role: The corresponding role ID of the custom role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>111111111</p>
             */
            public Builder roleId(Long roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>Role name.</p>
             * 
             * <strong>example:</strong>
             * <p>Organization Admin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
