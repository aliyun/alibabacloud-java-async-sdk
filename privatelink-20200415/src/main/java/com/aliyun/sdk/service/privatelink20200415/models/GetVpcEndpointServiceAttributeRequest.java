// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The region ID of the endpoint service.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The endpoint service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
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
