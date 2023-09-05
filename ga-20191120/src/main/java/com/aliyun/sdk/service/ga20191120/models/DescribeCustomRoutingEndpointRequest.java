// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndpointRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomRoutingEndpointRequest</p>
 */
public class DescribeCustomRoutingEndpointRequest extends Request {
    @Query
    @NameInMap("EndpointGroup")
    private String endpointGroup;

    @Query
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeCustomRoutingEndpointRequest(Builder builder) {
        super(builder);
        this.endpointGroup = builder.endpointGroup;
        this.endpointId = builder.endpointId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomRoutingEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointGroup
     */
    public String getEndpointGroup() {
        return this.endpointGroup;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomRoutingEndpointRequest, Builder> {
        private String endpointGroup; 
        private String endpointId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomRoutingEndpointRequest request) {
            super(request);
            this.endpointGroup = request.endpointGroup;
            this.endpointId = request.endpointId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroup(String endpointGroup) {
            this.putQueryParameter("EndpointGroup", endpointGroup);
            this.endpointGroup = endpointGroup;
            return this;
        }

        /**
         * The ID of the endpoint.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
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
        public DescribeCustomRoutingEndpointRequest build() {
            return new DescribeCustomRoutingEndpointRequest(this);
        } 

    } 

}
