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
 * {@link GetWorkspaceRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceRoleResponseBody</p>
 */
public class GetWorkspaceRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("ModulePermissions")
    private java.util.List<ModulePermissions> modulePermissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetWorkspaceRoleResponseBody(Builder builder) {
        this.creator = builder.creator;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.modulePermissions = builder.modulePermissions;
        this.requestId = builder.requestId;
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String creator; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List<ModulePermissions> modulePermissions; 
        private String requestId; 
        private String roleId; 
        private String roleName; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetWorkspaceRoleResponseBody model) {
            this.creator = model.creator;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.modulePermissions = model.modulePermissions;
            this.requestId = model.requestId;
            this.roleId = model.roleId;
            this.roleName = model.roleName;
            this.status = model.status;
        } 

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * ModulePermissions.
         */
        public Builder modulePermissions(java.util.List<ModulePermissions> modulePermissions) {
            this.modulePermissions = modulePermissions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetWorkspaceRoleResponseBody build() {
            return new GetWorkspaceRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceRoleResponseBody</p>
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
     * {@link GetWorkspaceRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceRoleResponseBody</p>
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
     * {@link GetWorkspaceRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceRoleResponseBody</p>
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
