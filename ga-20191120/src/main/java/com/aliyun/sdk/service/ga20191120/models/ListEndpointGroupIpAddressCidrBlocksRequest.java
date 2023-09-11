// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEndpointGroupIpAddressCidrBlocksRequest} extends {@link RequestModel}
 *
 * <p>ListEndpointGroupIpAddressCidrBlocksRequest</p>
 */
public class ListEndpointGroupIpAddressCidrBlocksRequest extends Request {
    @Query
    @NameInMap("EndpointGroupRegion")
    @Validation(required = true)
    private String endpointGroupRegion;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListEndpointGroupIpAddressCidrBlocksRequest(Builder builder) {
        super(builder);
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEndpointGroupIpAddressCidrBlocksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointGroupRegion
     */
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListEndpointGroupIpAddressCidrBlocksRequest, Builder> {
        private String endpointGroupRegion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEndpointGroupIpAddressCidrBlocksRequest request) {
            super(request);
            this.endpointGroupRegion = request.endpointGroupRegion;
            this.regionId = request.regionId;
        } 

        /**
         * The region ID of the endpoint group.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.putQueryParameter("EndpointGroupRegion", endpointGroupRegion);
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListEndpointGroupIpAddressCidrBlocksRequest build() {
            return new ListEndpointGroupIpAddressCidrBlocksRequest(this);
        } 

    } 

}
