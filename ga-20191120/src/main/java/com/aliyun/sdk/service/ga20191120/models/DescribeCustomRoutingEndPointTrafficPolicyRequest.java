// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndPointTrafficPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomRoutingEndPointTrafficPolicyRequest</p>
 */
public class DescribeCustomRoutingEndPointTrafficPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeCustomRoutingEndPointTrafficPolicyRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomRoutingEndPointTrafficPolicyRequest create() {
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomRoutingEndPointTrafficPolicyRequest, Builder> {
        private String endpointId; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomRoutingEndPointTrafficPolicyRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the traffic policy to be queried.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeCustomRoutingEndPointTrafficPolicy**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCustomRoutingEndPointTrafficPolicyRequest build() {
            return new DescribeCustomRoutingEndPointTrafficPolicyRequest(this);
        } 

    } 

}
