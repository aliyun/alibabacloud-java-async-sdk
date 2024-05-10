// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcEndpointServiceAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetVpcEndpointServiceAttributeRequest</p>
 */
public class GetVpcEndpointServiceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    private GetVpcEndpointServiceAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcEndpointServiceAttributeRequest create() {
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<GetVpcEndpointServiceAttributeRequest, Builder> {
        private String regionId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(GetVpcEndpointServiceAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
        } 

        /**
         * The region ID of the endpoint service.
         * <p>
         * 
         * You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The endpoint service ID.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public GetVpcEndpointServiceAttributeRequest build() {
            return new GetVpcEndpointServiceAttributeRequest(this);
        } 

    } 

}
