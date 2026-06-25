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
 * {@link UpdateWorkspaceRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceRoleRequest</p>
 */
public class UpdateWorkspaceRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModulePermissions")
    private java.util.List<ModulePermissions> modulePermissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private UpdateWorkspaceRoleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.roleId = builder.roleId;
        this.modulePermissions = builder.modulePermissions;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceRoleRequest create() {
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
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
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

    public static final class Builder extends Request.Builder<UpdateWorkspaceRoleRequest, Builder> {
        private String workspaceId; 
        private String roleId; 
        private java.util.List<ModulePermissions> modulePermissions; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceRoleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.roleId = request.roleId;
            this.modulePermissions = request.modulePermissions;
            this.roleName = request.roleName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>83***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>role-dhg*******</p>
         */
        public Builder roleId(String roleId) {
            this.putPathParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * ModulePermissions.
         */
        public Builder modulePermissions(java.util.List<ModulePermissions> modulePermissions) {
            this.putBodyParameter("ModulePermissions", modulePermissions);
            this.modulePermissions = modulePermissions;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public UpdateWorkspaceRoleRequest build() {
            return new UpdateWorkspaceRoleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkspaceRoleRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceRoleRequest</p>
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
             * Accessibility.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * EntityAccessType.
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
     * {@link UpdateWorkspaceRoleRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceRoleRequest</p>
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
             * PermissionCodes.
             */
            public Builder permissionCodes(java.util.List<String> permissionCodes) {
                this.permissionCodes = permissionCodes;
                return this;
            }

            /**
             * PermissionRules.
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
     * {@link UpdateWorkspaceRoleRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceRoleRequest</p>
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
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * PermissionType.
             */
            public Builder permissionType(String permissionType) {
                this.permissionType = permissionType;
                return this;
            }

            /**
             * Permissions.
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
