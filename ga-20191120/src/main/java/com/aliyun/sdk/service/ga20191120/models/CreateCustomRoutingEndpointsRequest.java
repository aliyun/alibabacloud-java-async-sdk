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
 * {@link CreateCustomRoutingEndpointsRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomRoutingEndpointsRequest</p>
 */
public class CreateCustomRoutingEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointConfigurations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EndpointConfigurations> endpointConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateCustomRoutingEndpointsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endpointConfigurations = builder.endpointConfigurations;
        this.endpointGroupId = builder.endpointGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoutingEndpointsRequest create() {
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
     * @return endpointConfigurations
     */
    public java.util.List<EndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
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

    public static final class Builder extends Request.Builder<CreateCustomRoutingEndpointsRequest, Builder> {
        private String clientToken; 
        private java.util.List<EndpointConfigurations> endpointConfigurations; 
        private String endpointGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomRoutingEndpointsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endpointConfigurations = request.endpointConfigurations;
            this.endpointGroupId = request.endpointGroupId;
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
         * <p>The information about the endpoints.</p>
         * <p>You can specify information for up to 20 endpoints.</p>
         * <p>This parameter is required.</p>
         */
        public Builder endpointConfigurations(java.util.List<EndpointConfigurations> endpointConfigurations) {
            this.putQueryParameter("EndpointConfigurations", endpointConfigurations);
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * <p>The ID of the endpoint group in which to create endpoints.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp1bpn0kn908w4nb****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
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
        public CreateCustomRoutingEndpointsRequest build() {
            return new CreateCustomRoutingEndpointsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomRoutingEndpointsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointsRequest</p>
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
             * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 first ports for each destination.</p>
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
             * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 last ports for each destination.</p>
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
     * {@link CreateCustomRoutingEndpointsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointsRequest</p>
     */
    public static class PolicyConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>You can specify up to 20 destination IP addresses for each endpoint.</p>
             * <p>This parameter is required.</p>
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
             * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 port ranges for each destination.</p>
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
    /**
     * 
     * {@link CreateCustomRoutingEndpointsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointsRequest</p>
     */
    public static class EndpointConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("PolicyConfigurations")
        private java.util.List<PolicyConfigurations> policyConfigurations;

        @com.aliyun.core.annotation.NameInMap("TrafficToEndpointPolicy")
        private String trafficToEndpointPolicy;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EndpointConfigurations(Builder builder) {
            this.endpoint = builder.endpoint;
            this.policyConfigurations = builder.policyConfigurations;
            this.trafficToEndpointPolicy = builder.trafficToEndpointPolicy;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConfigurations create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return policyConfigurations
         */
        public java.util.List<PolicyConfigurations> getPolicyConfigurations() {
            return this.policyConfigurations;
        }

        /**
         * @return trafficToEndpointPolicy
         */
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endpoint; 
            private java.util.List<PolicyConfigurations> policyConfigurations; 
            private String trafficToEndpointPolicy; 
            private String type; 

            private Builder() {
            } 

            private Builder(EndpointConfigurations model) {
                this.endpoint = model.endpoint;
                this.policyConfigurations = model.policyConfigurations;
                this.trafficToEndpointPolicy = model.trafficToEndpointPolicy;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the vSwitch that is specified as an endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-test01</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The destination to which traffic is forwarded.</p>
             * <p>You can specify up to 20 destinations for each endpoint.</p>
             */
            public Builder policyConfigurations(java.util.List<PolicyConfigurations> policyConfigurations) {
                this.policyConfigurations = policyConfigurations;
                return this;
            }

            /**
             * <p>The traffic policy that is used to process traffic to the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>DenyAll</strong> (default): denies all traffic to the endpoint.</li>
             * <li><strong>AllowAll</strong>: allows all traffic to the endpoint.</li>
             * <li><strong>AllowCustom</strong>: allows traffic only to specified destinations in the endpoint.</li>
             * </ul>
             * <p>If you set this parameter to AllowCustom, you must specify IP addresses and port ranges as the destinations to which traffic is distributed. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to the specified IP addresses over all destination ports.</p>
             * 
             * <strong>example:</strong>
             * <p>DenyAll</p>
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * <p>The type of endpoint.</p>
             * <p>Set the value to <strong>PrivateSubNet</strong>, which specifies a private CIDR block. This is the default value.</p>
             * 
             * <strong>example:</strong>
             * <p>PrivateSubNet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EndpointConfigurations build() {
                return new EndpointConfigurations(this);
            } 

        } 

    }
}
