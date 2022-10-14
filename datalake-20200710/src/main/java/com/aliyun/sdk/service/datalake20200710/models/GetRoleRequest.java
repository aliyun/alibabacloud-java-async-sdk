// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleRequest} extends {@link RequestModel}
 *
 * <p>GetRoleRequest</p>
 */
public class GetRoleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RoleName")
    private String roleName;

    private GetRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleRequest create() {
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

    public static final class Builder extends Request.Builder<GetRoleRequest, Builder> {
        private String regionId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(GetRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * roleName
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public GetRoleRequest build() {
            return new GetRoleRequest(this);
        } 

    } 

}
