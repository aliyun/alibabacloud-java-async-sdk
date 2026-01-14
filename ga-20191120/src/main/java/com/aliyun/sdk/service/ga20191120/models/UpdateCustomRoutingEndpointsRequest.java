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
 * {@link UpdateCustomRoutingEndpointsRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomRoutingEndpointsRequest</p>
 */
public class UpdateCustomRoutingEndpointsRequest extends Request {
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

    private UpdateCustomRoutingEndpointsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endpointConfigurations = builder.endpointConfigurations;
        this.endpointGroupId = builder.endpointGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomRoutingEndpointsRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateCustomRoutingEndpointsRequest, Builder> {
        private String clientToken; 
        private java.util.List<EndpointConfigurations> endpointConfigurations; 
        private String endpointGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomRoutingEndpointsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endpointConfigurations = request.endpointConfigurations;
            this.endpointGroupId = request.endpointGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>The configurations of the endpoint.</p>
         * <p>This parameter is required.</p>
         */
        public Builder endpointConfigurations(java.util.List<EndpointConfigurations> endpointConfigurations) {
            this.putQueryParameter("EndpointConfigurations", endpointConfigurations);
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * <p>The ID of the endpoint group to which the endpoints that you want to modify belong.</p>
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
        public UpdateCustomRoutingEndpointsRequest build() {
            return new UpdateCustomRoutingEndpointsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCustomRoutingEndpointsRequest} extends {@link TeaModel}
     *
     * <p>UpdateCustomRoutingEndpointsRequest</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private String fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
        private String toPort;

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
        public String getFromPort() {
            return this.fromPort;
        }

        /**
         * @return toPort
         */
        public String getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private String fromPort; 
            private String toPort; 

            private Builder() {
            } 

            private Builder(PortRanges model) {
                this.fromPort = model.fromPort;
                this.toPort = model.toPort;
            } 

            /**
             * <p>The start port of the port range in the destination to which to allow traffic. The specified port must fall within the port range of the specified endpoint group.</p>
             * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 start ports for each destination.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder fromPort(String fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The end port of the port range in the destination to which to allow traffic. The specified port must fall within the port range of the specified endpoint group.</p>
             * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 end ports for each destination.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder toPort(String toPort) {
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
     * {@link UpdateCustomRoutingEndpointsRequest} extends {@link TeaModel}
     *
     * <p>UpdateCustomRoutingEndpointsRequest</p>
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
             * <p>The IP address of the destination to which to allow traffic.</p>
             * <p>This parameter takes effect only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify up to 20 destination IP addresses for each endpoint.</p>
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
     * {@link UpdateCustomRoutingEndpointsRequest} extends {@link TeaModel}
     *
     * <p>UpdateCustomRoutingEndpointsRequest</p>
     */
    public static class EndpointConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("PolicyConfigurations")
        private java.util.List<PolicyConfigurations> policyConfigurations;

        @com.aliyun.core.annotation.NameInMap("TrafficToEndpointPolicy")
        private String trafficToEndpointPolicy;

        private EndpointConfigurations(Builder builder) {
            this.endpointId = builder.endpointId;
            this.policyConfigurations = builder.policyConfigurations;
            this.trafficToEndpointPolicy = builder.trafficToEndpointPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConfigurations create() {
            return builder().build();
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
         * @return trafficToEndpointPolicy
         */
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        public static final class Builder {
            private String endpointId; 
            private java.util.List<PolicyConfigurations> policyConfigurations; 
            private String trafficToEndpointPolicy; 

            private Builder() {
            } 

            private Builder(EndpointConfigurations model) {
                this.endpointId = model.endpointId;
                this.policyConfigurations = model.policyConfigurations;
                this.trafficToEndpointPolicy = model.trafficToEndpointPolicy;
            } 

            /**
             * <p>The ID of the endpoint.</p>
             * <p>You can specify up to 20 endpoint IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp1dmlohjjz4kqaun****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The configurations of the policy.</p>
             */
            public Builder policyConfigurations(java.util.List<PolicyConfigurations> policyConfigurations) {
                this.policyConfigurations = policyConfigurations;
                return this;
            }

            /**
             * <p>The access policy of traffic for the specified endpoint. Default value: DenyAll. Valid values:</p>
             * <ul>
             * <li><p><strong>DenyAll</strong>: denies all traffic to the endpoint.</p>
             * </li>
             * <li><p><strong>AllowAll</strong>: allows all traffic to the endpoint.</p>
             * </li>
             * <li><p><strong>AllowCustom</strong>: allows traffic only to specified destinations.</p>
             * <p>If you set this parameter to AllowCustom, you must specify IP addresses and port ranges of destinations to which to allow traffic. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to all ports and the specified IP addresses in the destinations.</p>
             * </li>
             * </ul>
             * <p>You can specify up to 20 access policies of traffic for the specified endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>DenyAll</p>
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            public EndpointConfigurations build() {
                return new EndpointConfigurations(this);
            } 

        } 

    }
}
