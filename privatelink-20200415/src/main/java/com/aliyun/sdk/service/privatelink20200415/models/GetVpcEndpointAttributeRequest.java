// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcEndpointAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetVpcEndpointAttributeRequest</p>
 */
public class GetVpcEndpointAttributeRequest extends Request {
    @Query
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetVpcEndpointAttributeRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcEndpointAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetVpcEndpointAttributeRequest, Builder> {
        private String endpointId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetVpcEndpointAttributeRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the endpoint whose attributes you want to query.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The region ID of the endpoint whose attributes you want to query.
         * <p>
         * 
         * You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetVpcEndpointAttributeRequest build() {
            return new GetVpcEndpointAttributeRequest(this);
        } 

    } 

}
