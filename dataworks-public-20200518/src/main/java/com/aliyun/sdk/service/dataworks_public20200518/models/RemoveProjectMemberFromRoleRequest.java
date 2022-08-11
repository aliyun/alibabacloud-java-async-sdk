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

    private RemoveProjectMemberFromRoleRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<RemoveProjectMemberFromRoleRequest, Builder> {
        private Long projectId; 
        private String regionId; 
        private String roleCode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveProjectMemberFromRoleRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.roleCode = request.roleCode;
            this.userId = request.userId;
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
        public RemoveProjectMemberFromRoleRequest build() {
            return new RemoveProjectMemberFromRoleRequest(this);
        } 

    } 

}
