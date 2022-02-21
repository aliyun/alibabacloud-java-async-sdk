// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationChaincodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricOrganizationChaincodesRequest</p>
 */
public class DescribeFabricOrganizationChaincodesRequest extends Request {
    @Body
    @NameInMap("Location")
    private String location;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricOrganizationChaincodesRequest(Builder builder) {
        super(builder);
        this.location = builder.location;
        this.organizationId = builder.organizationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricOrganizationChaincodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricOrganizationChaincodesRequest, Builder> {
        private String location; 
        private String organizationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricOrganizationChaincodesRequest response) {
            super(response);
            this.location = response.location;
            this.organizationId = response.organizationId;
            this.regionId = response.regionId;
        } 

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFabricOrganizationChaincodesRequest build() {
            return new DescribeFabricOrganizationChaincodesRequest(this);
        } 

    } 

}
