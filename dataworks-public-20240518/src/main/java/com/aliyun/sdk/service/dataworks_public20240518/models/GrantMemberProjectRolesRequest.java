// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GrantMemberProjectRolesRequest} extends {@link RequestModel}
 *
 * <p>GrantMemberProjectRolesRequest</p>
 */
public class GrantMemberProjectRolesRequest extends Request {
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
    private java.util.List < String > roleCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private GrantMemberProjectRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.roleCodes = builder.roleCodes;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantMemberProjectRolesRequest create() {
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
    public java.util.List < String > getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GrantMemberProjectRolesRequest, Builder> {
        private String regionId; 
        private Long projectId; 
        private java.util.List < String > roleCodes; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GrantMemberProjectRolesRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>105149</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roleCodes(java.util.List < String > roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "RoleCodes", "json");
            this.putBodyParameter("RoleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
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
        public GrantMemberProjectRolesRequest build() {
            return new GrantMemberProjectRolesRequest(this);
        } 

    } 

}
