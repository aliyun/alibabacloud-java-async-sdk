// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCandidateOrganizationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCandidateOrganizationsRequest</p>
 */
public class DescribeCandidateOrganizationsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Location")
    private String location;

    private DescribeCandidateOrganizationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.location = builder.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCandidateOrganizationsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCandidateOrganizationsRequest, Builder> {
        private String regionId; 
        private String location; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCandidateOrganizationsRequest request) {
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
        public DescribeCandidateOrganizationsRequest build() {
            return new DescribeCandidateOrganizationsRequest(this);
        } 

    } 

}
