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
 * {@link ListOrganizationRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationRolesResponseBody</p>
 */
public class ListOrganizationRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListOrganizationRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationRolesResponseBody create() {
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
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListOrganizationRolesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7AAB95D7-2E11-4FE2-94BC-858E4FC0C976</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the list of organization roles.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>是否请求成功。取值范围：</p>
         * <ul>
         * <li>true：请求成功</li>
         * <li>false：请求失败</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListOrganizationRolesResponseBody build() {
            return new ListOrganizationRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrganizationRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationRolesResponseBody</p>
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
             * <li>quick_monitor: Metric monitoring</li>
             * <li>subscription: Subscription management</li>
             * <li>offline_download: Self-service data retrieval</li>
             * <li>resource_package: Resource package management</li>
             * <li>organization_ask: Organization identification code (AK/SK)</li>
             * <li>developer_openapi: Open API</li>
             * <li>data_service: Data service</li>
             * <li>admin_authorize3rd: Embedded analysis</li>
             * <li>component_manage: Custom component</li>
             * <li>template_open: Custom template</li>
             * <li>custom_driver: Custom driver (supported only in standalone deployment)</li>
             * <li>open_platform_custom_plugin: Custom plugin (supported only in standalone deployment)</li>
             * <li>enterprise_safety: Enterprise security</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enterprise_safety</p>
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
     * {@link ListOrganizationRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationRolesResponseBody</p>
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
             * <p>Role ID.</p>
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
