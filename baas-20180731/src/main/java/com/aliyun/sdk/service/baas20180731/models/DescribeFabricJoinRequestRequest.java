// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricJoinRequestRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricJoinRequestRequest</p>
 */
public class DescribeFabricJoinRequestRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    private DescribeFabricJoinRequestRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricJoinRequestRequest create() {
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
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricJoinRequestRequest, Builder> {
        private String regionId; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricJoinRequestRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.organizationId = request.organizationId;
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
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DescribeFabricJoinRequestRequest build() {
            return new DescribeFabricJoinRequestRequest(this);
        } 

    } 

}
