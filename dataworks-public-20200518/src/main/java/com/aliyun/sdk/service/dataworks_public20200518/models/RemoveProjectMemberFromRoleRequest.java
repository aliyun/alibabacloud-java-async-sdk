// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link RemoveProjectMemberFromRoleRequest} extends {@link RequestModel}
 *
 * <p>RemoveProjectMemberFromRoleRequest</p>
 */
public class RemoveProjectMemberFromRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The code of the role in the DataWorks workspace. You can call the ListProjectRoles operation to query the codes of all roles in a DataWorks workspace. Valid values:</p>
         * <ul>
         * <li>role_project_owner: workspace owner</li>
         * <li>role_project_admin: workspace administrator</li>
         * <li>role_project_dev: developer</li>
         * <li>role_project_pe: O&amp;M engineer</li>
         * <li>role_project_deploy: deployment expert</li>
         * <li>role_project_guest: visitor</li>
         * <li>role_project_security: security administrator</li>
         * <li>role_project_tester: experiencer</li>
         * <li>role_project_erd: model designer</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        public Builder roleCode(String roleCode) {
            this.putQueryParameter("RoleCode", roleCode);
            this.roleCode = roleCode;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
