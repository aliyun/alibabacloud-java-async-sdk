// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveProjectMemberFromRoleRequest} extends {@link RequestModel}
 *
 * <p>RemoveProjectMemberFromRoleRequest</p>
 */
public class RemoveProjectMemberFromRoleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000)
    private Long projectId;

    @Query
    @NameInMap("RoleCode")
    @Validation(required = true)
    private String roleCode;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private RemoveProjectMemberFromRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.roleCode = builder.roleCode;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveProjectMemberFromRoleRequest create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return roleCode
     */
    public String getRoleCode() {
        return this.roleCode;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RemoveProjectMemberFromRoleRequest, Builder> {
        private String regionId; 
        private Long projectId; 
        private String roleCode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveProjectMemberFromRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.roleCode = request.roleCode;
            this.userId = request.userId;
        } 

        /**
         * The ID of the region where the DataWorks workspace resides.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the DataWorks workspace.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The role in the DataWorks workspace. You can call the ListProjectRoles operation to query codes of the roles in the workspace.
         * <p>
         * 
         * Valid values:
         * 
         * *   role_project_owner: workspace owner
         * *   role_project_admin: workspace administrator
         * *   role_project_dev: developer
         * *   role_project_pe: O\&M engineer
         * *   role_project_deploy: deployment expert
         * *   role_project_guest: visitor
         * *   role_project_security: security administrator
         * *   role_project_tester: experiencer
         * *   role_project_erd: model designer
         */
        public Builder roleCode(String roleCode) {
            this.putQueryParameter("RoleCode", roleCode);
            this.roleCode = roleCode;
            return this;
        }

        /**
         * The ID of the user.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RemoveProjectMemberFromRoleRequest build() {
            return new RemoveProjectMemberFromRoleRequest(this);
        } 

    } 

}
