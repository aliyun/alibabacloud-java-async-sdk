// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantRoleToUsersRequest} extends {@link RequestModel}
 *
 * <p>GrantRoleToUsersRequest</p>
 */
public class GrantRoleToUsersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleName")
    private String roleName;

    @Body
    @NameInMap("Users")
    private java.util.List < Principal > users;

    private GrantRoleToUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantRoleToUsersRequest create() {
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

    public static final class Builder extends Request.Builder<GrantRoleToUsersRequest, Builder> {
        private String regionId; 
        private String roleName; 
        private java.util.List < Principal > users; 

        private Builder() {
            super();
        } 

        private Builder(GrantRoleToUsersRequest request) {
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
         * RoleName
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
        public GrantRoleToUsersRequest build() {
            return new GrantRoleToUsersRequest(this);
        } 

    } 

}
