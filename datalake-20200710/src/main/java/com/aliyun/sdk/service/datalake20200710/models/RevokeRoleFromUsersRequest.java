// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeRoleFromUsersRequest} extends {@link RequestModel}
 *
 * <p>RevokeRoleFromUsersRequest</p>
 */
public class RevokeRoleFromUsersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List < Principal > users;

    private RevokeRoleFromUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeRoleFromUsersRequest create() {
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return users
     */
    public java.util.List < Principal > getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<RevokeRoleFromUsersRequest, Builder> {
        private String regionId; 
        private String roleName; 
        private java.util.List < Principal > users; 

        private Builder() {
            super();
        } 

        private Builder(RevokeRoleFromUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleName = request.roleName;
            this.users = request.users;
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
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < Principal > users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public RevokeRoleFromUsersRequest build() {
            return new RevokeRoleFromUsersRequest(this);
        } 

    } 

}
