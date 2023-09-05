// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoutingEndpointGroupsRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomRoutingEndpointGroupsRequest</p>
 */
public class CreateCustomRoutingEndpointGroupsRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EndpointGroupConfigurations")
    @Validation(required = true)
    private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateCustomRoutingEndpointGroupsRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointGroupConfigurations = builder.endpointGroupConfigurations;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoutingEndpointGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointGroupConfigurations
     */
    public java.util.List < EndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateCustomRoutingEndpointGroupsRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomRoutingEndpointGroupsRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.endpointGroupConfigurations = request.endpointGroupConfigurations;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
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
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The information about the endpoint groups.
         * <p>
         * 
         * You can specify at most five endpoint groups.
         */
        public Builder endpointGroupConfigurations(java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations) {
            this.putQueryParameter("EndpointGroupConfigurations", endpointGroupConfigurations);
            this.endpointGroupConfigurations = endpointGroupConfigurations;
            return this;
        }

        /**
         * The ID of the custom routing listener.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateCustomRoutingEndpointGroupsRequest build() {
            return new CreateCustomRoutingEndpointGroupsRequest(this);
        } 

    } 

    public static class DestinationConfigurations extends TeaModel {
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("Protocols")
        private java.util.List < String > protocols;

        @NameInMap("ToPort")
        private Integer toPort;

        private DestinationConfigurations(Builder builder) {
            this.fromPort = builder.fromPort;
            this.protocols = builder.protocols;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationConfigurations create() {
            return builder().build();
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return protocols
         */
        public java.util.List < String > getProtocols() {
            return this.protocols;
        }

        /**
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private Integer fromPort; 
            private java.util.List < String > protocols; 
            private Integer toPort; 

            /**
             * The first backend service port for the endpoint group.
             * <p>
             * 
             * Valid values: **1** to **65499**. The value of **FromPort** must be smaller than or equal to the value of **ToPort**.
             * 
             * You can specify at most 20 first backend service ports for each endpoint group.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The backend service protocol.
             * <p>
             * 
             * You can specify up to four backend service protocols in each mapping configuration.
             */
            public Builder protocols(java.util.List < String > protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * The last backend service port for the endpoint group.
             * <p>
             * 
             * Valid values: **1** to **65499**. The value of **FromPort** must be smaller than or equal to the value of **ToPort**.
             * 
             * You can specify at most 20 last backend service ports for each endpoint group.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public DestinationConfigurations build() {
                return new DestinationConfigurations(this);
            } 

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
             * The first port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.
             * <p>
             * 
             * This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for at most 20 destinations in each endpoint and specify at most five first ports for each destination.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port of the destination port range. The value of this parameter must fall within the port range of the endpoint group.
             * <p>
             * 
             * This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for at most 20 destinations in each endpoint and specify at most five last ports for each destination.
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
             * The IP address of the destination to which traffic is forwarded.
             * <p>
             * 
             * This parameter takes effect only when **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify at most 20 destination IP addresses for each endpoint.
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
             * You can specify port ranges for at most 20 destinations in each endpoint and specify at most five port ranges for each destination.
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
             * The name of the vSwitch that is specified as an endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The destination to which traffic is forwarded.
             * <p>
             * 
             * You can specify at most 20 destinations for each endpoint.
             */
            public Builder policyConfigurations(java.util.List < PolicyConfigurations> policyConfigurations) {
                this.policyConfigurations = policyConfigurations;
                return this;
            }

            /**
             * The traffic policy that is used to process traffic to the endpoint. Valid values:
             * <p>
             * 
             * *   **AllowAll**: allows all traffic to the endpoint.
             * *   **DenyAll** (default): denies all traffic to the endpoint.
             * *   **AllowCustom**: allows traffic only to specified destinations in the endpoint.
             * 
             * If you set this parameter to AllowCustom, you must specify IP addresses and port ranges as the destinations to which traffic is distributed. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to the specified IP addresses over all destination ports.
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * The type of endpoint.
             * <p>
             * 
             * Set the value to **PrivateSubNet**, which specifies a private CIDR block. This is the default value.
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
    public static class EndpointGroupConfigurations extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationConfigurations")
        private java.util.List < DestinationConfigurations> destinationConfigurations;

        @NameInMap("EndpointConfigurations")
        private java.util.List < EndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointGroupRegion")
        @Validation(required = true)
        private String endpointGroupRegion;

        @NameInMap("Name")
        private String name;

        private EndpointGroupConfigurations(Builder builder) {
            this.description = builder.description;
            this.destinationConfigurations = builder.destinationConfigurations;
            this.endpointConfigurations = builder.endpointConfigurations;
            this.endpointGroupRegion = builder.endpointGroupRegion;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroupConfigurations create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationConfigurations
         */
        public java.util.List < DestinationConfigurations> getDestinationConfigurations() {
            return this.destinationConfigurations;
        }

        /**
         * @return endpointConfigurations
         */
        public java.util.List < EndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        /**
         * @return endpointGroupRegion
         */
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private java.util.List < DestinationConfigurations> destinationConfigurations; 
            private java.util.List < EndpointConfigurations> endpointConfigurations; 
            private String endpointGroupRegion; 
            private String name; 

            /**
             * The description of the endpoint group.
             * <p>
             * 
             * The description cannot exceed 256 characters in length and cannot contain `http://` or `https://`.
             * 
             * You can specify at most five endpoint group descriptions.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The mapping configuration of the endpoint group.
             * <p>
             * 
             * You need to specify the backend service ports and protocols for the endpoint group. The ports are mapped to listener ports.
             * 
             * You can specify at most 20 mapping configurations for each endpoint group.
             */
            public Builder destinationConfigurations(java.util.List < DestinationConfigurations> destinationConfigurations) {
                this.destinationConfigurations = destinationConfigurations;
                return this;
            }

            /**
             * The information about the endpoints.
             * <p>
             * 
             * You can specify at most 10 endpoints for each endpoint group.
             */
            public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * The ID of the region in which the endpoint group resides.
             * <p>
             * 
             * You can specify at most five region IDs.
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * The name of the endpoint group.
             * <p>
             * 
             * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
             * 
             * You can specify at most five endpoint group names.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EndpointGroupConfigurations build() {
                return new EndpointGroupConfigurations(this);
            } 

        } 

    }
}
