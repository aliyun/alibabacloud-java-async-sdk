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
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String clientToken; 
        private Long projectId; 
        private String regionId; 
        private String roleCode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddProjectMemberToRoleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.roleCode = request.roleCode;
            this.userId = request.userId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleCode.
         */
        public Builder roleCode(String roleCode) {
            this.putQueryParameter("RoleCode", roleCode);
            this.roleCode = roleCode;
            return this;
        }

        /**
         * UserId.
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
