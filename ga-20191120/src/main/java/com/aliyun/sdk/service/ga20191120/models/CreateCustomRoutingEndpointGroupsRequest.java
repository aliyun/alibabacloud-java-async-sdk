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
 * {@link CreateCustomRoutingEndpointGroupsRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomRoutingEndpointGroupsRequest</p>
 */
public class CreateCustomRoutingEndpointGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupConfigurations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EndpointGroupConfigurations> endpointGroupConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<EndpointGroupConfigurations> getEndpointGroupConfigurations() {
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
        private java.util.List<EndpointGroupConfigurations> endpointGroupConfigurations; 
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
         * <p>The ID of the GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The information about the endpoint groups.</p>
         * <p>You can specify at most five endpoint groups.</p>
         * <p>This parameter is required.</p>
         */
        public Builder endpointGroupConfigurations(java.util.List<EndpointGroupConfigurations> endpointGroupConfigurations) {
            this.putQueryParameter("EndpointGroupConfigurations", endpointGroupConfigurations);
            this.endpointGroupConfigurations = endpointGroupConfigurations;
            return this;
        }

        /**
         * <p>The ID of the custom routing listener.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
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
        public CreateCustomRoutingEndpointGroupsRequest build() {
            return new CreateCustomRoutingEndpointGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomRoutingEndpointGroupsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointGroupsRequest</p>
     */
    public static class DestinationConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private java.util.List<String> protocols;

        @com.aliyun.core.annotation.NameInMap("ToPort")
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
        public java.util.List<String> getProtocols() {
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
            private java.util.List<String> protocols; 
            private Integer toPort; 

            private Builder() {
            } 

            private Builder(DestinationConfigurations model) {
                this.fromPort = model.fromPort;
                this.protocols = model.protocols;
                this.toPort = model.toPort;
            } 

            /**
             * <p>The first backend service port for the endpoint group.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be smaller than or equal to the value of <strong>ToPort</strong>.</p>
             * <p>You can specify at most 20 first backend service ports for each endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The backend service protocol.</p>
             * <p>You can specify up to four backend service protocols in each mapping configuration.</p>
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The last backend service port for the endpoint group.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be smaller than or equal to the value of <strong>ToPort</strong>.</p>
             * <p>You can specify at most 20 last backend service ports for each endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link CreateCustomRoutingEndpointGroupsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointGroupsRequest</p>
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
             * <p>You can specify port ranges for at most 20 destinations in each endpoint and specify at most five first ports for each destination.</p>
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
             * <p>You can specify port ranges for at most 20 destinations in each endpoint and specify at most five last ports for each destination.</p>
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
     * {@link CreateCustomRoutingEndpointGroupsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointGroupsRequest</p>
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
             * <p>You can specify at most 20 destination IP addresses for each endpoint.</p>
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
             * <p>You can specify port ranges for at most 20 destinations in each endpoint and specify at most five port ranges for each destination.</p>
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
     * {@link CreateCustomRoutingEndpointGroupsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointGroupsRequest</p>
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
             * <p>The name of the vSwitch that is specified as an endpoint.</p>
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
             * <p>You can specify at most 20 destinations for each endpoint.</p>
             */
            public Builder policyConfigurations(java.util.List<PolicyConfigurations> policyConfigurations) {
                this.policyConfigurations = policyConfigurations;
                return this;
            }

            /**
             * <p>The traffic policy that is used to process traffic to the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>AllowAll</strong>: allows all traffic to the endpoint.</li>
             * <li><strong>DenyAll</strong> (default): denies all traffic to the endpoint.</li>
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
    /**
     * 
     * {@link CreateCustomRoutingEndpointGroupsRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomRoutingEndpointGroupsRequest</p>
     */
    public static class EndpointGroupConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationConfigurations")
        private java.util.List<DestinationConfigurations> destinationConfigurations;

        @com.aliyun.core.annotation.NameInMap("EndpointConfigurations")
        private java.util.List<EndpointConfigurations> endpointConfigurations;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupRegion")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpointGroupRegion;

        @com.aliyun.core.annotation.NameInMap("Name")
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
        public java.util.List<DestinationConfigurations> getDestinationConfigurations() {
            return this.destinationConfigurations;
        }

        /**
         * @return endpointConfigurations
         */
        public java.util.List<EndpointConfigurations> getEndpointConfigurations() {
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
            private java.util.List<DestinationConfigurations> destinationConfigurations; 
            private java.util.List<EndpointConfigurations> endpointConfigurations; 
            private String endpointGroupRegion; 
            private String name; 

            private Builder() {
            } 

            private Builder(EndpointGroupConfigurations model) {
                this.description = model.description;
                this.destinationConfigurations = model.destinationConfigurations;
                this.endpointConfigurations = model.endpointConfigurations;
                this.endpointGroupRegion = model.endpointGroupRegion;
                this.name = model.name;
            } 

            /**
             * <p>The description of the endpoint group.</p>
             * <p>The description cannot exceed 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most five endpoint group descriptions.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mapping configuration of the endpoint group.</p>
             * <p>You need to specify the backend service ports and protocols for the endpoint group. The ports are mapped to listener ports.</p>
             * <p>You can specify at most 20 mapping configurations for each endpoint group.</p>
             */
            public Builder destinationConfigurations(java.util.List<DestinationConfigurations> destinationConfigurations) {
                this.destinationConfigurations = destinationConfigurations;
                return this;
            }

            /**
             * <p>The information about the endpoints.</p>
             * <p>You can specify at most 10 endpoints for each endpoint group.</p>
             */
            public Builder endpointConfigurations(java.util.List<EndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * <p>The ID of the region in which the endpoint group resides.</p>
             * <p>You can specify at most five region IDs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * <p>The name of the endpoint group.</p>
             * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
             * <p>You can specify at most five endpoint group names.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
