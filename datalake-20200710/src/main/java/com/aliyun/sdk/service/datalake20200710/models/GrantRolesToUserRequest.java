// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantRolesToUserRequest} extends {@link RequestModel}
 *
 * <p>GrantRolesToUserRequest</p>
 */
public class GrantRolesToUserRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleNames")
    @Validation(required = true)
    private java.util.List < String > roleNames;

    @Body
    @NameInMap("User")
    @Validation(required = true)
    private Principal user;

    private GrantRolesToUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleNames = builder.roleNames;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantRolesToUserRequest create() {
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

    public static final class Builder extends Request.Builder<GrantRolesToUserRequest, Builder> {
        private String regionId; 
        private java.util.List < String > roleNames; 
        private Principal user; 

        private Builder() {
            super();
        } 

        private Builder(GrantRolesToUserRequest request) {
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
        public GrantRolesToUserRequest build() {
            return new GrantRolesToUserRequest(this);
        } 

    } 

}
