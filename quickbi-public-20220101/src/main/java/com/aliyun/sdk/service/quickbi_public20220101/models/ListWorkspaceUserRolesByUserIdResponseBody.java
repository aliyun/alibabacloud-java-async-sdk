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
 * {@link ListWorkspaceUserRolesByUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspaceUserRolesByUserIdResponseBody</p>
 */
public class ListWorkspaceUserRolesByUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWorkspaceUserRolesByUserIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspaceUserRolesByUserIdResponseBody create() {
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

        private Builder(ListWorkspaceUserRolesByUserIdResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkspaceUserRolesByUserIdResponseBody build() {
            return new ListWorkspaceUserRolesByUserIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspaceUserRolesByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceUserRolesByUserIdResponseBody</p>
     */
    public static class RoleModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleCode")
        private String roleCode;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private RoleModel(Builder builder) {
            this.roleCode = builder.roleCode;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleModel create() {
            return builder().build();
        }

        /**
         * @return roleCode
         */
        public String getRoleCode() {
            return this.roleCode;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String roleCode; 
            private String roleId; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(RoleModel model) {
                this.roleCode = model.roleCode;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
            } 

            /**
             * RoleCode.
             */
            public Builder roleCode(String roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public RoleModel build() {
                return new RoleModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspaceUserRolesByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceUserRolesByUserIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleModel")
        private RoleModel roleModel;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Result(Builder builder) {
            this.roleModel = builder.roleModel;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return roleModel
         */
        public RoleModel getRoleModel() {
            return this.roleModel;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private RoleModel roleModel; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.roleModel = model.roleModel;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * RoleModel.
             */
            public Builder roleModel(RoleModel roleModel) {
                this.roleModel = roleModel;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
