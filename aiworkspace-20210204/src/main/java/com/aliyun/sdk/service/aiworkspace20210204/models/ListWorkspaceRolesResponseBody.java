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
 * {@link ListWorkspaceRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspaceRolesResponseBody</p>
 */
public class ListWorkspaceRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List<Roles> roles;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWorkspaceRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roles = builder.roles;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspaceRolesResponseBody create() {
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
     * @return roles
     */
    public java.util.List<Roles> getRoles() {
        return this.roles;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Roles> roles; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWorkspaceRolesResponseBody model) {
            this.requestId = model.requestId;
            this.roles = model.roles;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A519F77D-28A0-52F5-AB82-5********8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of custom roles.</p>
         */
        public Builder roles(java.util.List<Roles> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * <p>The total count of matching entries.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkspaceRolesResponseBody build() {
            return new ListWorkspaceRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspaceRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceRolesResponseBody</p>
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
     * {@link ListWorkspaceRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceRolesResponseBody</p>
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
     * {@link ListWorkspaceRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceRolesResponseBody</p>
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
    /**
     * 
     * {@link ListWorkspaceRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceRolesResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModulePermissions")
        private java.util.List<ModulePermissions> modulePermissions;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private Roles(Builder builder) {
            this.creator = builder.creator;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.modulePermissions = builder.modulePermissions;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return modulePermissions
         */
        public java.util.List<ModulePermissions> getModulePermissions() {
            return this.modulePermissions;
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
            private String creator; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private java.util.List<ModulePermissions> modulePermissions; 
            private String roleId; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.creator = model.creator;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.modulePermissions = model.modulePermissions;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The Alibaba Cloud account UID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>2680******4103</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creation time, in UTC and ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-14T07:40:01.000Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The modification time, in UTC and ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-15T02:29:52Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The permission configuration of the role.</p>
             */
            public Builder modulePermissions(java.util.List<ModulePermissions> modulePermissions) {
                this.modulePermissions = modulePermissions;
                return this;
            }

            /**
             * <p>The ID of the custom role.</p>
             * 
             * <strong>example:</strong>
             * <p>role-dhg*******</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The role name.</p>
             * 
             * <strong>example:</strong>
             * <p>dev-test</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}
