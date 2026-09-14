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
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>保留字段</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The list of DataWorks module permissions.</p>
         */
        public Builder modulePermissions(java.util.List<ModulePermissions> modulePermissions) {
            String modulePermissionsShrink = shrink(modulePermissions, "ModulePermissions", "json");
            this.putQueryParameter("ModulePermissions", modulePermissionsShrink);
            this.modulePermissions = modulePermissions;
            return this;
        }

        /**
         * <p>The role name.</p>
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
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
         * <p>This parameter specifies the DataWorks workspace on which the API operation is performed.</p>
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
             * <p>The DataWorks module ID. Valid values:</p>
             * <ul>
             * <li><p>2: HoloStudio</p>
             * </li>
             * <li><p>3: StreamStudio</p>
             * </li>
             * <li><p>4: Deployment management</p>
             * </li>
             * <li><p>6: Data Security Guard</p>
             * </li>
             * <li><p>7: Data Map</p>
             * </li>
             * <li><p>8: Data Service</p>
             * </li>
             * <li><p>9: Data Integration</p>
             * </li>
             * <li><p>10: Data Modeling (DataBlau DDM)</p>
             * </li>
             * <li><p>11: Data Studio</p>
             * </li>
             * <li><p>12: Data Quality</p>
             * </li>
             * <li><p>13: Data Governance</p>
             * </li>
             * <li><p>14: Operation Center</p>
             * </li>
             * <li><p>15: Resource optimization</p>
             * </li>
             * <li><p>16: Migration Assistant</p>
             * </li>
             * <li><p>17: Data Analysis</p>
             * </li>
             * <li><p>18: Approval center</p>
             * </li>
             * <li><p>19: Security Center</p>
             * </li>
             * <li><p>20: Intelligent Data Modeling</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * <p>The permission type. Valid values:</p>
             * <ul>
             * <li><p>Write: Read-only</p>
             * </li>
             * <li><p>Read: Edit</p>
             * </li>
             * <li><p>NotSet: Not controlled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Write</p>
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
