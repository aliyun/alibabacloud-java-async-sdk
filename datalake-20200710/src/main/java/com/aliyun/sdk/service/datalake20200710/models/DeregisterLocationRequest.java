// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterLocationRequest} extends {@link RequestModel}
 *
 * <p>DeregisterLocationRequest</p>
 */
public class DeregisterLocationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String locationId;

    private DeregisterLocationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.locationId = builder.locationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterLocationRequest create() {
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
     * @return locationId
     */
    public String getLocationId() {
        return this.locationId;
    }

    public static final class Builder extends Request.Builder<DeregisterLocationRequest, Builder> {
        private String regionId; 
        private String locationId; 

        private Builder() {
            super();
        } 

        private Builder(DeregisterLocationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.locationId = request.locationId;
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
         * LocationId.
         */
        public Builder locationId(String locationId) {
            this.putQueryParameter("LocationId", locationId);
            this.locationId = locationId;
            return this;
        }

        @Override
        public DeregisterLocationRequest build() {
            return new DeregisterLocationRequest(this);
        } 

    } 

}
