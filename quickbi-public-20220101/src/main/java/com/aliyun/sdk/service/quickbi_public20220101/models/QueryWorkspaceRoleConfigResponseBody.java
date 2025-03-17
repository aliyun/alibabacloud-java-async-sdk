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
 * {@link QueryWorkspaceRoleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWorkspaceRoleConfigResponseBody</p>
 */
public class QueryWorkspaceRoleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryWorkspaceRoleConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorkspaceRoleConfigResponseBody create() {
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

        private Builder(QueryWorkspaceRoleConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the query result of the interface.</p>
         */
        public Builder result(Result result) {
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

        public QueryWorkspaceRoleConfigResponseBody build() {
            return new QueryWorkspaceRoleConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWorkspaceRoleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkspaceRoleConfigResponseBody</p>
     */
    public static class AuthConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionAuthKeys")
        private java.util.List<String> actionAuthKeys;

        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        private AuthConfigList(Builder builder) {
            this.actionAuthKeys = builder.actionAuthKeys;
            this.authKey = builder.authKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConfigList create() {
            return builder().build();
        }

        /**
         * @return actionAuthKeys
         */
        public java.util.List<String> getActionAuthKeys() {
            return this.actionAuthKeys;
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        public static final class Builder {
            private java.util.List<String> actionAuthKeys; 
            private String authKey; 

            private Builder() {
            } 

            private Builder(AuthConfigList model) {
                this.actionAuthKeys = model.actionAuthKeys;
                this.authKey = model.authKey;
            } 

            /**
             * <p>Permission scope.</p>
             */
            public Builder actionAuthKeys(java.util.List<String> actionAuthKeys) {
                this.actionAuthKeys = actionAuthKeys;
                return this;
            }

            /**
             * <p>Permission type:</p>
             * <ul>
             * <li>portal_create: Data Portal</li>
             * <li>dashboard_create: Dashboard</li>
             * <li>report_create: Spreadsheet</li>
             * <li>screen_create: Data Screen</li>
             * <li>analysis: Ad-hoc Analysis</li>
             * <li>offline_download: Self-service Data Retrieval</li>
             * <li>data_form: Data Entry</li>
             * <li>quick_etl: Data Preparation</li>
             * <li>cube: Dataset</li>
             * <li>datasource: Data Source</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>portal_create</p>
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
     * {@link QueryWorkspaceRoleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkspaceRoleConfigResponseBody</p>
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
             * <p>Whether it is a predefined role. Value range:</p>
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
             * <p>Workspace role ID, including predefined roles and custom roles:</p>
             * <ul>
             * <li>25: Workspace Administrator (predefined role)</li>
             * <li>26: Developer (predefined role)</li>
             * <li>27: Analyst (predefined role)</li>
             * <li>30: Viewer (predefined role)</li>
             * <li>Custom role: The corresponding role ID for the custom role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder roleId(Long roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>Role name.</p>
             * 
             * <strong>example:</strong>
             * <p>pace administrator</p>
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
