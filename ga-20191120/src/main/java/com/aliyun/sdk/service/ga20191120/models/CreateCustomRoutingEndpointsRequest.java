// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoutingEndpointsRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomRoutingEndpointsRequest</p>
 */
public class CreateCustomRoutingEndpointsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointConfigurations")
    @Validation(required = true)
    private java.util.List < EndpointConfigurations> endpointConfigurations;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
    public java.util.List < EndpointConfigurations> getEndpointConfigurations() {
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
        private java.util.List < EndpointConfigurations> endpointConfigurations; 
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
         * The ID of the endpoint group in which to create endpoints.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The information about the endpoints.
         * <p>
         * 
         * You can specify information for up to 20 endpoints.
         */
        public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
            this.putQueryParameter("EndpointConfigurations", endpointConfigurations);
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * The information about the endpoints.
         * <p>
         * 
         * You can specify information for up to 20 endpoints.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.
         * 
         * > If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request is different.
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

    public static class PortRanges extends TeaModel {
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ToPort")
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
             * The last port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.
             * <p>
             * 
             * This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 last ports for each destination.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The returned information.
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
        @NameInMap("Address")
        @Validation(required = true)
        private String address;

        @NameInMap("PortRanges")
        private java.util.List < PortRanges> portRanges;

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
        public java.util.List < PortRanges> getPortRanges() {
            return this.portRanges;
        }

        public static final class Builder {
            private String address; 
            private java.util.List < PortRanges> portRanges; 

            /**
             * The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.
             * <p>
             * 
             * If you leave this parameter empty, traffic is forwarded to all destination ports.
             * 
             * This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 port ranges for each destination.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.
             * <p>
             * 
             * If you leave this parameter empty, traffic is forwarded to all destination ports.
             * 
             * This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for up to 20 destinations for each endpoint and specify up to 20 port ranges for each destination.
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
    public static class EndpointConfigurations extends TeaModel {
        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("PolicyConfigurations")
        private java.util.List < PolicyConfigurations> policyConfigurations;

        @NameInMap("TrafficToEndpointPolicy")
        private String trafficToEndpointPolicy;

        @NameInMap("Type")
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
        public java.util.List < PolicyConfigurations> getPolicyConfigurations() {
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
            private java.util.List < PolicyConfigurations> policyConfigurations; 
            private String trafficToEndpointPolicy; 
            private String type; 

            /**
             * The traffic policy that is used to process traffic to the endpoint. Valid values:
             * <p>
             * 
             * *   **DenyAll** (default): denies all traffic to the endpoint.
             * *   **AllowAll**: allows all traffic to the endpoint.
             * *   **AllowCustom**: allows traffic only to specified destinations in the endpoint.
             * 
             * If you set this parameter to AllowCustom, you must specify IP addresses and port ranges as the destinations to which traffic is distributed. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to the specified IP addresses over all destination ports.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The destination to which traffic is forwarded.
             * <p>
             * 
             * You can specify up to 20 destinations for each endpoint.
             */
            public Builder policyConfigurations(java.util.List < PolicyConfigurations> policyConfigurations) {
                this.policyConfigurations = policyConfigurations;
                return this;
            }

            /**
             * The destination to which traffic is forwarded.
             * <p>
             * 
             * You can specify up to 20 destinations for each endpoint.
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * The ID of the vSwitch that is specified as an endpoint.
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
