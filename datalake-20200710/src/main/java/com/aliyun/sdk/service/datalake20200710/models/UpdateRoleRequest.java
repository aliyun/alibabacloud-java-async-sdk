// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoleRequest</p>
 */
public class UpdateRoleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleInput")
    private RoleInput roleInput;

    @Body
    @NameInMap("RoleName")
    private String roleName;

    private UpdateRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleInput = builder.roleInput;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoleRequest create() {
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
     * @return roleInput
     */
    public RoleInput getRoleInput() {
        return this.roleInput;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<UpdateRoleRequest, Builder> {
        private String regionId; 
        private RoleInput roleInput; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleInput = request.roleInput;
            this.roleName = request.roleName;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleInput.
         */
        public Builder roleInput(RoleInput roleInput) {
            this.putBodyParameter("RoleInput", roleInput);
            this.roleInput = roleInput;
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

        @Override
        public UpdateRoleRequest build() {
            return new UpdateRoleRequest(this);
        } 

    } 

}
