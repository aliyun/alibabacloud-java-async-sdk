// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeRolesFromUserRequest} extends {@link RequestModel}
 *
 * <p>RevokeRolesFromUserRequest</p>
 */
public class RevokeRolesFromUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > roleNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("User")
    @com.aliyun.core.annotation.Validation(required = true)
    private Principal user;

    private RevokeRolesFromUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleNames = builder.roleNames;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeRolesFromUserRequest create() {
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
     * @return roleNames
     */
    public java.util.List < String > getRoleNames() {
        return this.roleNames;
    }

    /**
     * @return user
     */
    public Principal getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<RevokeRolesFromUserRequest, Builder> {
        private String regionId; 
        private java.util.List < String > roleNames; 
        private Principal user; 

        private Builder() {
            super();
        } 

        private Builder(RevokeRolesFromUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleNames = request.roleNames;
            this.user = request.user;
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
         * RoleNames.
         */
        public Builder roleNames(java.util.List < String > roleNames) {
            this.putBodyParameter("RoleNames", roleNames);
            this.roleNames = roleNames;
            return this;
        }

        /**
         * User.
         */
        public Builder user(Principal user) {
            this.putBodyParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public RevokeRolesFromUserRequest build() {
            return new RevokeRolesFromUserRequest(this);
        } 

    } 

}
