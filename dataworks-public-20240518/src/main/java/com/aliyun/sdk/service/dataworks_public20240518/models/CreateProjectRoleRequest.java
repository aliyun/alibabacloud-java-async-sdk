// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateProjectRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRoleRequest</p>
 */
public class CreateProjectRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModulePermissions")
    private java.util.List<ModulePermissions> modulePermissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private CreateProjectRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.modulePermissions = builder.modulePermissions;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return modulePermissions
     */
    public java.util.List<ModulePermissions> getModulePermissions() {
        return this.modulePermissions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateProjectRoleRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private java.util.List<ModulePermissions> modulePermissions; 
        private String name; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.modulePermissions = request.modulePermissions;
            this.name = request.name;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ModulePermissions.
         */
        public Builder modulePermissions(java.util.List<ModulePermissions> modulePermissions) {
            String modulePermissionsShrink = shrink(modulePermissions, "ModulePermissions", "json");
            this.putQueryParameter("ModulePermissions", modulePermissionsShrink);
            this.modulePermissions = modulePermissions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>category_role</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateProjectRoleRequest build() {
            return new CreateProjectRoleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectRoleRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRoleRequest</p>
     */
    public static class ModulePermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("PermissionType")
        private String permissionType;

        private ModulePermissions(Builder builder) {
            this.moduleId = builder.moduleId;
            this.permissionType = builder.permissionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModulePermissions create() {
            return builder().build();
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return permissionType
         */
        public String getPermissionType() {
            return this.permissionType;
        }

        public static final class Builder {
            private Long moduleId; 
            private String permissionType; 

            private Builder() {
            } 

            private Builder(ModulePermissions model) {
                this.moduleId = model.moduleId;
                this.permissionType = model.permissionType;
            } 

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * PermissionType.
             */
            public Builder permissionType(String permissionType) {
                this.permissionType = permissionType;
                return this;
            }

            public ModulePermissions build() {
                return new ModulePermissions(this);
            } 

        } 

    }
}
