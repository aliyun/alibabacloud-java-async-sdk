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
 * {@link CreateProjectMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectMemberRequest</p>
 */
public class CreateProjectMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> roleCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private CreateProjectMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.roleCodes = builder.roleCodes;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectMemberRequest create() {
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
     * @return roleCodes
     */
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateProjectMemberRequest, Builder> {
        private String regionId; 
        private Long projectId; 
        private java.util.List<String> roleCodes; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.roleCodes = request.roleCodes;
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
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
         * <p>This parameter specifies the DataWorks workspace for this API call operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24054</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The list of workspace role codes. You can call <a href="https://help.aliyun.com/document_detail/2853930.html">ListProjectRoles</a> to obtain the role codes.</p>
         * <p>This parameter is used to grant workspace roles to the member when adding the member to the workspace.</p>
         * <p>This parameter is required.</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "RoleCodes", "json");
            this.putBodyParameter("RoleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * <p>The ID of the DataWorks account. You can log on to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks console - Management Center</a>, select the workspace to which you want to add a member, go to the Management Center page, and then navigate to the <strong>Tenant Members and Roles</strong> page to view the account ID of the user you want to add to the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123422344899</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateProjectMemberRequest build() {
            return new CreateProjectMemberRequest(this);
        } 

    } 

}
