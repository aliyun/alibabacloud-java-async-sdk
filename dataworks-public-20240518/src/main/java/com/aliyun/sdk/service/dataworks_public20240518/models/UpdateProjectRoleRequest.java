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
 * {@link UpdateProjectRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectRoleRequest</p>
 */
public class UpdateProjectRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModulePermissions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ModulePermissions> modulePermissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private UpdateProjectRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.code = builder.code;
        this.modulePermissions = builder.modulePermissions;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectRoleRequest create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return modulePermissions
     */
    public java.util.List<ModulePermissions> getModulePermissions() {
        return this.modulePermissions;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<UpdateProjectRoleRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String code; 
        private java.util.List<ModulePermissions> modulePermissions; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.code = request.code;
            this.modulePermissions = request.modulePermissions;
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
         * <p>A reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The unique identifier of the custom role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>base_role_xx</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The list of DataWorks module permissions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder modulePermissions(java.util.List<ModulePermissions> modulePermissions) {
            String modulePermissionsShrink = shrink(modulePermissions, "ModulePermissions", "json");
            this.putQueryParameter("ModulePermissions", modulePermissionsShrink);
            this.modulePermissions = modulePermissions;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the Storage Management page to obtain the ID.</p>
         * <p>This parameter specifies the DataWorks workspace for this API invocation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public UpdateProjectRoleRequest build() {
            return new UpdateProjectRoleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProjectRoleRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectRoleRequest</p>
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
             * <li>2: HoloStudio</li>
             * <li>3: StreamStudio</li>
             * <li>4: Deploy Management</li>
             * <li>6: Data Protection Umbrella</li>
             * <li>7: Data Map</li>
             * <li>8: DataService Studio</li>
             * <li>9: Data Integration</li>
             * <li>10: Data Modeling (DataBlau DDM)</li>
             * <li>11: DataStudio</li>
             * <li>12: Data Quality</li>
             * <li>13: Data Governance Center</li>
             * <li>14: Operation Center</li>
             * <li>15: Resource Optimization</li>
             * <li>16: Migration Assistant</li>
             * <li>17: Data Analytics</li>
             * <li>18: Approval Center</li>
             * <li>19: Security Center</li>
             * <li>20: Intelligent Data Modeling</li>
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
             * <li>Write: Edit.</li>
             * <li>Read: Read-only.</li>
             * <li>NotSet: Not controlled.</li>
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
