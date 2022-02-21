// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricCandidateOrganizationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricCandidateOrganizationsRequest</p>
 */
public class DescribeFabricCandidateOrganizationsRequest extends Request {
    @Body
    @NameInMap("Location")
    private String location;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricCandidateOrganizationsRequest(Builder builder) {
        super(builder);
        this.location = builder.location;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricCandidateOrganizationsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricCandidateOrganizationsRequest, Builder> {
        private String location; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricCandidateOrganizationsRequest response) {
            super(response);
            this.location = response.location;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFabricCandidateOrganizationsRequest build() {
            return new DescribeFabricCandidateOrganizationsRequest(this);
        } 

    } 

}
