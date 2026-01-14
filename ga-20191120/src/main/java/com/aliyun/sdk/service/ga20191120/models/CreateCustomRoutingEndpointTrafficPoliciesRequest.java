// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link CreateCustomRoutingEndpointTrafficPoliciesRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomRoutingEndpointTrafficPoliciesRequest</p>
 */
public class CreateCustomRoutingEndpointTrafficPoliciesRequest extends Request {
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
    private java.util.List<PolicyConfigurations> policyConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateCustomRoutingEndpointTrafficPoliciesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endpointId = builder.endpointId;
        this.policyConfigurations = builder.policyConfigurations;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoutingEndpointTrafficPoliciesRequest create() {
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
    public java.util.List<PolicyConfigurations> getPolicyConfigurations() {
        return this.policyConfigurations;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateCustomRoutingEndpointTrafficPoliciesRequest, Builder> {
        private String clientToken; 
        private String endpointId; 
        private java.util.List<PolicyConfigurations> policyConfigurations; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomRoutingEndpointTrafficPoliciesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endpointId = request.endpointId;
            this.policyConfigurations = request.policyConfigurations;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the endpoint for which you want to create traffic destinations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-2zewuzypq5e6r3pfh****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The configurations of the traffic destinations.</p>
         * <p>You can specify up to 500 traffic destinations for each endpoint.</p>
         * <p>This parameter is required.</p>
         */
        public Builder policyConfigurations(java.util.List<PolicyConfigurations> policyConfigurations) {
            this.putQueryParameter("PolicyConfigurations", policyConfigurations);
            this.policyConfigurations = policyConfigurations;
            return this;
        }

        /**
         * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateCustomRoutingEndpointTrafficPoliciesRequest build() {
            return new CreateCustomRoutingEndpointTrafficPoliciesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomRoutingEndpointTrafficPoliciesRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointTrafficPoliciesRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(PortRanges model) {
                this.fromPort = model.fromPort;
                this.toPort = model.toPort;
            } 

            /**
             * <p>The first port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
             * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>If the first port and the last port are not specified, traffic on all ports of the destination is allowed.</p>
             * <p>You can specify port ranges for up to 500 destinations in each endpoint and specify up to 10 first ports for each destination.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The last port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.</p>
             * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>If the first port and the last port are not specified, traffic on all ports of the destination is allowed.</p>
             * <p>You can specify port ranges for up to 500 destinations in each endpoint and specify up to 10 last ports for each destination.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link CreateCustomRoutingEndpointTrafficPoliciesRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointTrafficPoliciesRequest</p>
     */
    public static class PolicyConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("PortRanges")
        private java.util.List<PortRanges> portRanges;

        private PolicyConfigurations(Builder builder) {
            this.address = builder.address;
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
         * @return portRanges
         */
        public java.util.List<PortRanges> getPortRanges() {
            return this.portRanges;
        }

        public static final class Builder {
            private String address; 
            private java.util.List<PortRanges> portRanges; 

            private Builder() {
            } 

            private Builder(PolicyConfigurations model) {
                this.address = model.address;
                this.portRanges = model.portRanges;
            } 

            /**
             * <p>The IP address of the destination to which traffic is forwarded.</p>
             * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify up to 500 destination IP addresses for each endpoint.</p>
             * <blockquote>
             * <p>This parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.</p>
             * <p>If you leave this parameter empty, traffic is forwarded to all destination ports.</p>
             * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify port ranges for up to 500 traffic destinations in each endpoint and specify up to 10 port ranges for each traffic destination.</p>
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            public PolicyConfigurations build() {
                return new PolicyConfigurations(this);
            } 

        } 

    }
}
