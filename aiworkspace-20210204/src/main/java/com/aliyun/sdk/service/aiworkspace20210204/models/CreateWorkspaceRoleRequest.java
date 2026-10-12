// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateWorkspaceRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRoleRequest</p>
 */
public class CreateWorkspaceRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModulePermissions")
    private java.util.List<ModulePermissions> modulePermissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private CreateWorkspaceRoleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.modulePermissions = builder.modulePermissions;
        this.roleName = builder.roleName;
        this.roleType = builder.roleType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return modulePermissions
     */
    public java.util.List<ModulePermissions> getModulePermissions() {
        return this.modulePermissions;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceRoleRequest, Builder> {
        private String workspaceId; 
        private java.util.List<ModulePermissions> modulePermissions; 
        private String roleName; 
        private String roleType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRoleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.modulePermissions = request.modulePermissions;
            this.roleName = request.roleName;
            this.roleType = request.roleType;
            this.userId = request.userId;
        } 

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>(Required) The role permission configurations.</p>
         */
        public Builder modulePermissions(java.util.List<ModulePermissions> modulePermissions) {
            this.putBodyParameter("ModulePermissions", modulePermissions);
            this.modulePermissions = modulePermissions;
            return this;
        }

        /**
         * <p>(Required) The custom role name. The name must be unique within the same workspace. The name can contain letters, digits, underscores (_), and hyphens (-), and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-test</p>
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The role type. Valid values: custom: custom role. Only custom roles are supported. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder roleType(String roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21513926******88039</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateWorkspaceRoleRequest build() {
            return new CreateWorkspaceRoleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkspaceRoleRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRoleRequest</p>
     */
    public static class PermissionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessibility")
        private String accessibility;

        @com.aliyun.core.annotation.NameInMap("EntityAccessType")
        private String entityAccessType;

        private PermissionRules(Builder builder) {
            this.accessibility = builder.accessibility;
            this.entityAccessType = builder.entityAccessType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionRules create() {
            return builder().build();
        }

        /**
         * @return accessibility
         */
        public String getAccessibility() {
            return this.accessibility;
        }

        /**
         * @return entityAccessType
         */
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

        public static final class Builder {
            private String accessibility; 
            private String entityAccessType; 

            private Builder() {
            } 

            private Builder(PermissionRules model) {
                this.accessibility = model.accessibility;
                this.entityAccessType = model.entityAccessType;
            } 

            /**
             * <p>The access type. Valid values are:</p>
             * <ul>
             * <li><p>PUBLIC: All members in the current workspace can perform this action.</p>
             * </li>
             * <li><p>PRIVATE: Only the creator can perform this action.</p>
             * </li>
             * <li><p>ANY: Both the creator and non-creators can perform this action.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * <p>The entity access type. This parameter is ignored if <code>Accessibility</code> is set to <code>PUBLIC</code>. If <code>Accessibility</code> is set to <code>PRIVATE</code>, the value of this parameter determines the permissions. Valid values are:</p>
             * <ul>
             * <li><p>CREATOR: Only the creator can perform this action.</p>
             * </li>
             * <li><p>ANY: Both the creator and non-creators can perform this action.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATOR</p>
             */
            public Builder entityAccessType(String entityAccessType) {
                this.entityAccessType = entityAccessType;
                return this;
            }

            public PermissionRules build() {
                return new PermissionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkspaceRoleRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRoleRequest</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PermissionCodes")
        private java.util.List<String> permissionCodes;

        @com.aliyun.core.annotation.NameInMap("PermissionRules")
        private java.util.List<PermissionRules> permissionRules;

        private Permissions(Builder builder) {
            this.permissionCodes = builder.permissionCodes;
            this.permissionRules = builder.permissionRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return permissionCodes
         */
        public java.util.List<String> getPermissionCodes() {
            return this.permissionCodes;
        }

        /**
         * @return permissionRules
         */
        public java.util.List<PermissionRules> getPermissionRules() {
            return this.permissionRules;
        }

        public static final class Builder {
            private java.util.List<String> permissionCodes; 
            private java.util.List<PermissionRules> permissionRules; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.permissionCodes = model.permissionCodes;
                this.permissionRules = model.permissionRules;
            } 

            /**
             * <p>A list of permissions.</p>
             */
            public Builder permissionCodes(java.util.List<String> permissionCodes) {
                this.permissionCodes = permissionCodes;
                return this;
            }

            /**
             * <p>A list of permission rules.</p>
             */
            public Builder permissionRules(java.util.List<PermissionRules> permissionRules) {
                this.permissionRules = permissionRules;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkspaceRoleRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRoleRequest</p>
     */
    public static class ModulePermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("PermissionType")
        private String permissionType;

        @com.aliyun.core.annotation.NameInMap("Permissions")
        private java.util.List<Permissions> permissions;

        private ModulePermissions(Builder builder) {
            this.moduleName = builder.moduleName;
            this.permissionType = builder.permissionType;
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModulePermissions create() {
            return builder().build();
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return permissionType
         */
        public String getPermissionType() {
            return this.permissionType;
        }

        /**
         * @return permissions
         */
        public java.util.List<Permissions> getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private String moduleName; 
            private String permissionType; 
            private java.util.List<Permissions> permissions; 

            private Builder() {
            } 

            private Builder(ModulePermissions model) {
                this.moduleName = model.moduleName;
                this.permissionType = model.permissionType;
                this.permissions = model.permissions;
            } 

            /**
             * <p>The module name. Valid values are:</p>
             * <ul>
             * <li><p>PaiDesigner: PAI-Designer</p>
             * </li>
             * <li><p>Paiflow: workflow</p>
             * </li>
             * <li><p>DSW: PAI-DSW</p>
             * </li>
             * <li><p>DLC: PAI-DLC</p>
             * </li>
             * <li><p>Dataset: dataset</p>
             * </li>
             * <li><p>Model: model</p>
             * </li>
             * <li><p>Image: image</p>
             * </li>
             * <li><p>CodeSource: code source</p>
             * </li>
             * <li><p>PaiWorkspace@@Workspace: Basic workspace information</p>
             * </li>
             * <li><p>PaiWorkspace@@MemberRole: workspace member management</p>
             * </li>
             * <li><p>PaiWorkspace@@Resource: workspace computing resource management</p>
             * </li>
             * <li><p>PaiWorkspace@@Config: workspace configuration center</p>
             * </li>
             * <li><p>ArtLab: ArtLab</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PaiDesigner</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The permission type. Valid values are:</p>
             * <ul>
             * <li><p>ReadOnly: read-only access.</p>
             * </li>
             * <li><p>ReadWrite: Allows users to edit and run.</p>
             * </li>
             * <li><p>FullAccess: full control.</p>
             * </li>
             * <li><p>NoPrivilege: no permissions.</p>
             * </li>
             * <li><p>CustomPermissions: custom permissions.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadOnly</p>
             */
            public Builder permissionType(String permissionType) {
                this.permissionType = permissionType;
                return this;
            }

            /**
             * <p>The permissions. This parameter is required and applies only when <code>PermissionType</code> is set to <code>CustomPermissions</code>.</p>
             */
            public Builder permissions(java.util.List<Permissions> permissions) {
                this.permissions = permissions;
                return this;
            }

            public ModulePermissions build() {
                return new ModulePermissions(this);
            } 

        } 

    }
}
