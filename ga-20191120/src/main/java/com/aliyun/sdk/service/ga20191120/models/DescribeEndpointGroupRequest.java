// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeEndpointGroupRequest</p>
 */
public class DescribeEndpointGroupRequest extends Request {
    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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

        private Builder(DescribeEndpointGroupRequest response) {
            super(response);
            this.endpointGroupId = response.endpointGroupId;
            this.regionId = response.regionId;
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
         * RegionId.
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
