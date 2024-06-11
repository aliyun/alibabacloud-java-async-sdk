// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceIdentityRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceIdentityRoleRequest</p>
 */
public class CreateServiceIdentityRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    private CreateServiceIdentityRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceIdentityRoleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateServiceIdentityRoleRequest, Builder> {
        private String regionId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceIdentityRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleName = request.roleName;
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

        @Override
        public CreateServiceIdentityRoleRequest build() {
            return new CreateServiceIdentityRoleRequest(this);
        } 

    } 

}
