// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointTrafficPoliciesRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomRoutingEndpointTrafficPoliciesRequest</p>
 */
public class UpdateCustomRoutingEndpointTrafficPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyConfigurations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < PolicyConfigurations> policyConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateCustomRoutingEndpointTrafficPoliciesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endpointId = builder.endpointId;
        this.policyConfigurations = builder.policyConfigurations;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomRoutingEndpointTrafficPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return policyConfigurations
     */
    public java.util.List < PolicyConfigurations> getPolicyConfigurations() {
        return this.policyConfigurations;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateCustomRoutingEndpointTrafficPoliciesRequest, Builder> {
        private String clientToken; 
        private String endpointId; 
        private java.util.List < PolicyConfigurations> policyConfigurations; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomRoutingEndpointTrafficPoliciesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endpointId = request.endpointId;
            this.policyConfigurations = request.policyConfigurations;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the endpoint for which you want to modify the traffic policies.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The access policies.
         * <p>
         * 
         * You can specify a maximum of 500 traffic policies for each endpoint.
         */
        public Builder policyConfigurations(java.util.List < PolicyConfigurations> policyConfigurations) {
            this.putQueryParameter("PolicyConfigurations", policyConfigurations);
            this.policyConfigurations = policyConfigurations;
            return this;
        }

        /**
         * The region ID of the Global Accelerator (GA) instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateCustomRoutingEndpointTrafficPoliciesRequest build() {
            return new UpdateCustomRoutingEndpointTrafficPoliciesRequest(this);
        } 

    } 

    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
        private Integer toPort;

        private PortRanges(Builder builder) {
            this.fromPort = builder.fromPort;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private Integer fromPort; 
            private Integer toPort; 

            /**
             * The first port of the destination port range. The value of this parameter must fall within the port range of the backend service.
             * <p>
             * 
             * This parameter takes effect only when you set the **TrafficToEndpointPolicy** parameter to **AllowCustom**. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the traffic policy of an endpoint.
             * 
             * If the start port and end port values are empty, traffic on all ports of the destination is allowed.
             * 
             * You can specify a maximum of 500 port ranges for each endpoint and a maximum of 10 port ranges for each traffic policy.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port of the destination port range. The value of this parameter must fall within the port range of the backend service.
             * <p>
             * 
             * This parameter takes effect only when you set the **TrafficToEndpointPolicy** parameter to **AllowCustom**. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the traffic policy of an endpoint.
             * 
             * If the start port and end port values are empty, traffic on all ports of the destination is allowed.
             * 
             * You can specify a maximum of 500 port ranges for each endpoint and a maximum of 10 port ranges for each traffic policy.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

        } 

    }
    public static class PolicyConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PortRanges")
        private java.util.List < PortRanges> portRanges;

        private PolicyConfigurations(Builder builder) {
            this.address = builder.address;
            this.policyId = builder.policyId;
            this.portRanges = builder.portRanges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyConfigurations create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return portRanges
         */
        public java.util.List < PortRanges> getPortRanges() {
            return this.portRanges;
        }

        public static final class Builder {
            private String address; 
            private String policyId; 
            private java.util.List < PortRanges> portRanges; 

            /**
             * The IP address of the destination which to allow traffic.
             * <p>
             * 
             * This parameter takes effect only when you set the **TrafficToEndpointPolicy** parameter to **AllowCustom**. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the traffic policy of an endpoint.
             * 
             * You can specify a maximum of 500 traffic policies for each endpoint.
             * 
             * >  This parameter is required.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The ID of the traffic policy that you want to modify.
             * <p>
             * 
             * >  This parameter is required.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.
             * <p>
             * 
             * If you do not specify object, traffic is forwarded to all ports.
             * 
             * This parameter takes effect only when you set the **TrafficToEndpointPolicy** parameter to **AllowCustom**. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the traffic policy of an endpoint.
             * 
             * You can specify a maximum of 500 port ranges for each endpoint and a maximum of 10 port ranges for each traffic policy.
             */
            public Builder portRanges(java.util.List < PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            public PolicyConfigurations build() {
                return new PolicyConfigurations(this);
            } 

        } 

    }
}
