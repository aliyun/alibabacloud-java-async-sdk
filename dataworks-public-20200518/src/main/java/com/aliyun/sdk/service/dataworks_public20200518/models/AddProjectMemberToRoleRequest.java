// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProjectMemberToRoleRequest} extends {@link RequestModel}
 *
 * <p>AddProjectMemberToRoleRequest</p>
 */
public class AddProjectMemberToRoleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

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

    private AddProjectMemberToRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.roleCode = builder.roleCode;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProjectMemberToRoleRequest create() {
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

    public static final class Builder extends Request.Builder<AddProjectMemberToRoleRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Long projectId; 
        private String roleCode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddProjectMemberToRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
            this.roleCode = request.roleCode;
            this.userId = request.userId;
        } 

        /**
         * The code of the role that you want to assign to a member of a DataWorks workspace. You can call the [ListProjectRoles](~~178228~~) operation to query the code of all roles in a DataWorks workspace.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account. To view the ID, log on to [the DataWorks console](https://workbench.data.aliyun.com/console) and move the pointer over the profile picture in the upper-right corner.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The client token. It is a field with the idempotence property. We recommend that you use a universally unique identifier (UUID). This parameter is used to uniquely identify the API operation call.
         */
        public Builder roleCode(String roleCode) {
            this.putQueryParameter("RoleCode", roleCode);
            this.roleCode = roleCode;
            return this;
        }

        /**
         * The region of the workspace. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddProjectMemberToRoleRequest build() {
            return new AddProjectMemberToRoleRequest(this);
        } 

    } 

}
