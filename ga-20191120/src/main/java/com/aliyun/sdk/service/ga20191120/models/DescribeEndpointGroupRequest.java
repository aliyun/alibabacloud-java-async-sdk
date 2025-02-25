// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeEndpointGroupRequest</p>
 */
public class DescribeEndpointGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeEndpointGroupRequest(Builder builder) {
        super(builder);
        this.endpointGroupId = builder.endpointGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndpointGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeEndpointGroupRequest, Builder> {
        private String endpointGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEndpointGroupRequest request) {
            super(request);
            this.endpointGroupId = request.endpointGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the endpoint group that you want to query.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the region where your Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeEndpointGroupRequest build() {
            return new DescribeEndpointGroupRequest(this);
        } 

    } 

}
