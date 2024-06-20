// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricCandidateOrganizationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricCandidateOrganizationsRequest</p>
 */
public class DescribeFabricCandidateOrganizationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    private DescribeFabricCandidateOrganizationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.location = builder.location;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    public static final class Builder extends Request.Builder<DescribeFabricCandidateOrganizationsRequest, Builder> {
        private String regionId; 
        private String location; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricCandidateOrganizationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.location = request.location;
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
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        @Override
        public DescribeFabricCandidateOrganizationsRequest build() {
            return new DescribeFabricCandidateOrganizationsRequest(this);
        } 

    } 

}
