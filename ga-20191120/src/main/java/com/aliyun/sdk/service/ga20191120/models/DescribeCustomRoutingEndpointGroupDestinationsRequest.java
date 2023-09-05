// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndpointGroupDestinationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomRoutingEndpointGroupDestinationsRequest</p>
 */
public class DescribeCustomRoutingEndpointGroupDestinationsRequest extends Request {
    @Query
    @NameInMap("DestinationId")
    @Validation(required = true)
    private String destinationId;

    @Query
    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeCustomRoutingEndpointGroupDestinationsRequest(Builder builder) {
        super(builder);
        this.destinationId = builder.destinationId;
        this.endpointGroupId = builder.endpointGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomRoutingEndpointGroupDestinationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationId
     */
    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomRoutingEndpointGroupDestinationsRequest, Builder> {
        private String destinationId; 
        private String endpointGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomRoutingEndpointGroupDestinationsRequest request) {
            super(request);
            this.destinationId = request.destinationId;
            this.endpointGroupId = request.endpointGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the endpoint group mapping configuration.
         */
        public Builder destinationId(String destinationId) {
            this.putQueryParameter("DestinationId", destinationId);
            this.destinationId = destinationId;
            return this;
        }

        /**
         * EndpointGroupId.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCustomRoutingEndpointGroupDestinationsRequest build() {
            return new DescribeCustomRoutingEndpointGroupDestinationsRequest(this);
        } 

    } 

}
