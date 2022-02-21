// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantUserRolesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTenantUserRolesRequest</p>
 */
public class DescribeTenantUserRolesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeTenantUserRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantUserRolesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTenantUserRolesRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTenantUserRolesRequest response) {
            super(response);
            this.regionId = response.regionId;
        } 

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeTenantUserRolesRequest build() {
            return new DescribeTenantUserRolesRequest(this);
        } 

    } 

}
