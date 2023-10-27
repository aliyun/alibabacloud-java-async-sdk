// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateListenerRequest</p>
 */
public class CreateListenerRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @Query
    @NameInMap("ClientAffinity")
    private String clientAffinity;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CustomRoutingEndpointGroupConfigurations")
    private java.util.List < CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndpointGroupConfigurations")
    private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PortRanges")
    @Validation(required = true)
    private java.util.List < PortRanges> portRanges;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("ProxyProtocol")
    private Boolean proxyProtocol;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("XForwardedForConfig")
    private XForwardedForConfig xForwardedForConfig;

    private CreateListenerRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.certificates = builder.certificates;
        this.clientAffinity = builder.clientAffinity;
        this.clientToken = builder.clientToken;
        this.customRoutingEndpointGroupConfigurations = builder.customRoutingEndpointGroupConfigurations;
        this.description = builder.description;
        this.endpointGroupConfigurations = builder.endpointGroupConfigurations;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.proxyProtocol = builder.proxyProtocol;
        this.regionId = builder.regionId;
        this.securityPolicyId = builder.securityPolicyId;
        this.type = builder.type;
        this.xForwardedForConfig = builder.xForwardedForConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateListenerRequest create() {
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
     * @return certificates
     */
    public java.util.List < Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return clientAffinity
     */
    public String getClientAffinity() {
        return this.clientAffinity;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return customRoutingEndpointGroupConfigurations
     */
    public java.util.List < CustomRoutingEndpointGroupConfigurations> getCustomRoutingEndpointGroupConfigurations() {
        return this.customRoutingEndpointGroupConfigurations;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpointGroupConfigurations
     */
    public java.util.List < EndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return portRanges
     */
    public java.util.List < PortRanges> getPortRanges() {
        return this.portRanges;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return proxyProtocol
     */
    public Boolean getProxyProtocol() {
        return this.proxyProtocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return xForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.xForwardedForConfig;
    }

    public static final class Builder extends Request.Builder<CreateListenerRequest, Builder> {
        private String acceleratorId; 
        private java.util.List < Certificates> certificates; 
        private String clientAffinity; 
        private String clientToken; 
        private java.util.List < CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations; 
        private String description; 
        private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations; 
        private String name; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private Boolean proxyProtocol; 
        private String regionId; 
        private String securityPolicyId; 
        private String type; 
        private XForwardedForConfig xForwardedForConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateListenerRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.certificates = request.certificates;
            this.clientAffinity = request.clientAffinity;
            this.clientToken = request.clientToken;
            this.customRoutingEndpointGroupConfigurations = request.customRoutingEndpointGroupConfigurations;
            this.description = request.description;
            this.endpointGroupConfigurations = request.endpointGroupConfigurations;
            this.name = request.name;
            this.portRanges = request.portRanges;
            this.protocol = request.protocol;
            this.proxyProtocol = request.proxyProtocol;
            this.regionId = request.regionId;
            this.securityPolicyId = request.securityPolicyId;
            this.type = request.type;
            this.xForwardedForConfig = request.xForwardedForConfig;
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
         * The SSL certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * Specifies whether to enable client affinity for the listener.
         * <p>
         * 
         * *   If this parameter is left empty, client affinity is disabled. After client affinity is disabled, requests from a specific client IP address may be forwarded to different endpoints.
         * *   To enable client affinity, set this parameter to **SOURCE_IP**. In this case, when a client accesses stateful applications, requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.
         */
        public Builder clientAffinity(String clientAffinity) {
            this.putQueryParameter("ClientAffinity", clientAffinity);
            this.clientAffinity = clientAffinity;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** is different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The endpoint group that is associated with the custom routing listener.
         * <p>
         * 
         * You can configure at most five endpoint groups for a custom routing listener.
         * 
         * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
         */
        public Builder customRoutingEndpointGroupConfigurations(java.util.List < CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations) {
            this.putQueryParameter("CustomRoutingEndpointGroupConfigurations", customRoutingEndpointGroupConfigurations);
            this.customRoutingEndpointGroupConfigurations = customRoutingEndpointGroupConfigurations;
            return this;
        }

        /**
         * The description of the listener. The description can be at most 200 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The endpoint group that is associated with the intelligent routing listener.
         * <p>
         * 
         * You can configure at most 10 endpoint groups for an intelligent routing listener.
         * 
         * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
         */
        public Builder endpointGroupConfigurations(java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations) {
            this.putQueryParameter("EndpointGroupConfigurations", endpointGroupConfigurations);
            this.endpointGroupConfigurations = endpointGroupConfigurations;
            return this;
        }

        /**
         * The name of the listener.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The listener ports. Valid values: **1** to **65499**. The maximum number of ports that can be configured depends on the routing type and protocol of the listener. For more information, see [Listener overview](~~153216~~).
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.putQueryParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * The network transmission protocol that you want to use for the listener. Valid values:
         * <p>
         * 
         * *   **tcp**: TCP
         * *   **udp**: UDP
         * *   **http**: HTTP
         * *   **https**: HTTPS
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * Specifies whether to preserve client IP addresses. Valid values:
         * <p>
         * 
         * *   **true**: enables the feature. After client IP addresses are preserved, you can view client IP addresses on the endpoints.
         * *   **false** (default): disables the feature.
         * 
         * > This parameter will be deprecated in the API operations that are used to configure listeners. We recommend that you set this parameter when you call API operations to configure endpoint groups. For more information about the **ProxyProtocol** parameter, see [CreateEndpointGroup](~~153259~~) and [UpdateEndpointGroup](~~153262~~).
         */
        public Builder proxyProtocol(Boolean proxyProtocol) {
            this.putQueryParameter("ProxyProtocol", proxyProtocol);
            this.proxyProtocol = proxyProtocol;
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

        /**
         * The ID of the security policy. Valid values:
         * <p>
         * 
         * *   **tls_cipher_policy\_1\_0**
         * 
         *     *   Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.
         * 
         * *   **tls_cipher_policy\_1\_1**
         * 
         *     *   Supported TLS versions: TLS 1.1 and TLS 1.2
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.
         * 
         * *   **tls_cipher_policy\_1\_2**
         * 
         *     *   Supported TLS version: TLS 1.2
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.
         * 
         * *   **tls_cipher_policy\_1\_2\_strict**
         * 
         *     *   Supported TLS version: TLS 1.2
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
         * 
         * *   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**
         * 
         *     *   Supported TLS versions: TLS 1.2 and TLS 1.3
         *     *   Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
         * 
         * > This parameter is available only when you create an HTTPS listener.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * The routing type of the listener. Valid values:
         * <p>
         * 
         * *   **Standard** (default): intelligent routing
         * *   **CustomRouting**: custom routing
         * 
         * > 
         * 
         * *   Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager.
         * 
         * *   You can create only listeners of the same routing type for a standard GA instance. You cannot change the routing types of listeners. For more information, see [Listener overview](~~153216~~).
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The `XForward` headers.
         */
        public Builder xForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
            this.putQueryParameter("XForwardedForConfig", xForwardedForConfig);
            this.xForwardedForConfig = xForwardedForConfig;
            return this;
        }

        @Override
        public CreateListenerRequest build() {
            return new CreateListenerRequest(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @NameInMap("Id")
        private String id;

        private Certificates(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * The ID of the SSL certificate.
             * <p>
             * 
             * > This parameter is required only when you create an HTTPS listener.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

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
             * The first port used by the endpoint group that is associated with the custom routing listener.
             * <p>
             * 
             * Valid values: **1** to **65499**. The value of **FromPort** must be equal to or smaller than the value of **ToPort**.
             * 
             * You can specify up to 20 first ports for an endpoint group of a custom routing listener.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The protocol used by the endpoint group that is associated with the custom routing listener.
             * <p>
             * 
             * You can specify up to four protocols in each mapping configuration for an endpoint group of a custom routing listener.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder protocols(java.util.List < String > protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * The last port used by the endpoint group that is associated with the custom routing listener.
             * <p>
             * 
             * Valid values: **1** to **65499**. The value of **FromPort** must be equal to or smaller than the value of **ToPort**.
             * 
             * You can specify up to 20 last ports for an endpoint group of a custom routing listener.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
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
    public static class PolicyConfigurationsPortRanges extends TeaModel {
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ToPort")
        private Integer toPort;

        private PolicyConfigurationsPortRanges(Builder builder) {
            this.fromPort = builder.fromPort;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyConfigurationsPortRanges create() {
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
             * The first port of the destination port range. The value of this parameter must be in the port range of the endpoint group.
             * <p>
             * 
             * This parameter takes effect only if **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five first ports for each destination.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port of the destination port range. The value of this parameter must be in the port range of the endpoint group.
             * <p>
             * 
             * This parameter takes effect only if **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five end ports for each destination.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public PolicyConfigurationsPortRanges build() {
                return new PolicyConfigurationsPortRanges(this);
            } 

        } 

    }
    public static class PolicyConfigurations extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("PortRanges")
        private java.util.List < PolicyConfigurationsPortRanges> portRanges;

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
        public java.util.List < PolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public static final class Builder {
            private String address; 
            private java.util.List < PolicyConfigurationsPortRanges> portRanges; 

            /**
             * The IP address of the destination to which traffic is forwarded.
             * <p>
             * 
             * This parameter takes effect only if **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify up to 20 destination IP addresses for each endpoint of a custom routing listener.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.
             * <p>
             * 
             * If you leave this parameter empty, traffic is distributed to all destination ports.
             * 
             * This parameter takes effect only if **TrafficToEndpointPolicy** is set to **AllowCustom**.
             * 
             * You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five port ranges for each destination.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder portRanges(java.util.List < PolicyConfigurationsPortRanges> portRanges) {
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
             * <p>
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The destination in the endpoint that is associated with the custom routing listener.
             * <p>
             * 
             * You can specify at most 20 destinations in each endpoint of a custom routing listener.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder policyConfigurations(java.util.List < PolicyConfigurations> policyConfigurations) {
                this.policyConfigurations = policyConfigurations;
                return this;
            }

            /**
             * The traffic policy for the endpoint that is associated with the custom routing listener. Valid values:
             * <p>
             * 
             * *   **DenyAll** (default): denies all traffic to the endpoint.
             * *   **AllowAll**: allows all traffic to the endpoint.
             * *   **AllowCustom**: allows traffic only to specified destinations in the endpoint.
             * 
             * If you set this parameter to AllowCustom, you must specify IP addresses and port ranges as the destinations to which traffic is distributed. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to the specified IP addresses over all destination ports.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * The service type of the endpoint that is associated with the custom routing listener.
             * <p>
             * 
             * Set the value to **PrivateSubNet**, which specifies a private CIDR block.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
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
    public static class CustomRoutingEndpointGroupConfigurations extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationConfigurations")
        private java.util.List < DestinationConfigurations> destinationConfigurations;

        @NameInMap("EndpointConfigurations")
        private java.util.List < EndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @NameInMap("Name")
        private String name;

        private CustomRoutingEndpointGroupConfigurations(Builder builder) {
            this.description = builder.description;
            this.destinationConfigurations = builder.destinationConfigurations;
            this.endpointConfigurations = builder.endpointConfigurations;
            this.endpointGroupRegion = builder.endpointGroupRegion;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomRoutingEndpointGroupConfigurations create() {
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
             * The description of the endpoint group that is associated with the custom routing listener.
             * <p>
             * 
             * The description cannot exceed 256 characters in length and cannot contain `http://` or `https://`.
             * 
             * You can specify at most five endpoint group descriptions.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The mapping configurations of the endpoint group that is associated with the custom routing listener.
             * <p>
             * 
             * You need to specify the port ranges and protocols used by the endpoint group. The ports are mapped to listener ports.
             * 
             * You can specify at most 20 mapping configurations for an endpoint group of a custom routing listener.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder destinationConfigurations(java.util.List < DestinationConfigurations> destinationConfigurations) {
                this.destinationConfigurations = destinationConfigurations;
                return this;
            }

            /**
             * The endpoint that is associated with the custom routing listener.
             * <p>
             * 
             * You can configure at most 10 endpoints for an endpoint group of a custom routing listener.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * The region ID of the endpoint group that is associated with the custom routing listener.
             * <p>
             * 
             * You can enter the region IDs of up to five endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * The name of the endpoint group that is associated with the custom routing listener.
             * <p>
             * 
             * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
             * 
             * You can specify at most five endpoint group names.
             * 
             * > You can configure endpoint groups and endpoints for a custom routing listener only if the **Type** parameter is set to **CustomRouting**.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CustomRoutingEndpointGroupConfigurations build() {
                return new CustomRoutingEndpointGroupConfigurations(this);
            } 

        } 

    }
    public static class EndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("SubAddress")
        private String subAddress;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Long weight;

        private EndpointGroupConfigurationsEndpointConfigurations(Builder builder) {
            this.endpoint = builder.endpoint;
            this.subAddress = builder.subAddress;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroupConfigurationsEndpointConfigurations create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return subAddress
         */
        public String getSubAddress() {
            return this.subAddress;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String endpoint; 
            private String subAddress; 
            private String type; 
            private Long weight; 

            /**
             * The IP address or domain name of the endpoint that is associated with the intelligent routing listener.
             * <p>
             * 
             * You can specify up to 100 endpoint IP addresses or domain names for an endpoint group of an intelligent routing listener.
             * 
             * > If the **Type** parameter is set to **Standard**, you can configure endpoint groups and endpoints for an intelligent routing listener, and this parameter is required.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * SubAddress.
             */
            public Builder subAddress(String subAddress) {
                this.subAddress = subAddress;
                return this;
            }

            /**
             * The endpoint type of the intelligent routing listener. Valid values:
             * <p>
             * 
             * *   **Domain**: a custom domain name
             * *   **Ip**: a custom IP address
             * *   **PublicIp**: a public IP address provided by Alibaba Cloud
             * *   **ECS**: an Elastic Compute Service (ECS) instance
             * *   **SLB**: a Server Load Balancer (SLB) instance
             * *   **ALB**: an Application Load Balancer (ALB) instance
             * *   **OSS**: an Object Storage Service (OSS) bucket
             * 
             * You can specify up to 100 endpoint types for an endpoint group of an intelligent routing listener.
             * 
             * > 
             * 
             * *   If the **Type** parameter is set to **Standard**, you can configure endpoint groups and endpoints for an intelligent routing listener, and this parameter is required.
             * 
             * *   If you set this parameter to **ECS** or **SLB** and the service-linked role AliyunServiceRoleForGaVpcEndpoint does not exist, the system creates the service-linked role.
             * *   If you set this parameter to **ALB** and the service-linked role AliyunServiceRoleForGaAlb does not exist, the system automatically creates the service-linked role.
             * *   If you set this parameter to **OSS** and the service-linked role AliyunServiceRoleForGaOss does not exist, the system automatically creates the service-linked role.
             * 
             * For more information, see [Service-linked roles](~~178360~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the endpoint that is associated with the intelligent routing listener.
             * <p>
             * 
             * Valid values: **0** to **255**.
             * 
             * You can set the weights of up to 100 endpoints for an endpoint group of an intelligent routing listener.
             * 
             * > 
             * 
             * *   If the **Type** parameter is set to **Standard**, you can configure endpoint groups and endpoints for an intelligent routing listener, and this parameter is required.
             * 
             * *   If the weight of an endpoint is set to 0, GA stops distributing network traffic to the endpoint. Proceed with caution.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public EndpointGroupConfigurationsEndpointConfigurations build() {
                return new EndpointGroupConfigurationsEndpointConfigurations(this);
            } 

        } 

    }
    public static class PortOverrides extends TeaModel {
        @NameInMap("EndpointPort")
        private Long endpointPort;

        @NameInMap("ListenerPort")
        private Long listenerPort;

        private PortOverrides(Builder builder) {
            this.endpointPort = builder.endpointPort;
            this.listenerPort = builder.listenerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortOverrides create() {
            return builder().build();
        }

        /**
         * @return endpointPort
         */
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        /**
         * @return listenerPort
         */
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private Long endpointPort; 
            private Long listenerPort; 

            /**
             * The endpoint port that is mapped to the listener port.
             * <p>
             * 
             * You can specify up to five endpoint ports.
             * 
             * > 
             * 
             * *   You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             * 
             * *   Only HTTP intelligent routing listeners and HTTPS intelligent routing listeners support port mappings.
             */
            public Builder endpointPort(Long endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * The listener port that is mapped to the endpoint port.
             * <p>
             * 
             * You can specify up to five listener ports.
             * 
             * > 
             * 
             * *   You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             * 
             * *   Only HTTP intelligent routing listeners and HTTPS intelligent routing listeners support port mappings.
             * *   The listener port in a port mapping must be the port that is used by the current listener.
             */
            public Builder listenerPort(Long listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public PortOverrides build() {
                return new PortOverrides(this);
            } 

        } 

    }
    public static class EndpointGroupConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        private Boolean enableClientIPPreservationProxyProtocol;

        @NameInMap("EnableClientIPPreservationToa")
        private Boolean enableClientIPPreservationToa;

        @NameInMap("EndpointConfigurations")
        private java.util.List < EndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointGroupDescription")
        private String endpointGroupDescription;

        @NameInMap("EndpointGroupName")
        private String endpointGroupName;

        @NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @NameInMap("EndpointGroupType")
        private String endpointGroupType;

        @NameInMap("EndpointRequestProtocol")
        private String endpointRequestProtocol;

        @NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @NameInMap("HealthCheckIntervalSeconds")
        private Long healthCheckIntervalSeconds;

        @NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @NameInMap("HealthCheckPort")
        private Long healthCheckPort;

        @NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @NameInMap("PortOverrides")
        private java.util.List < PortOverrides> portOverrides;

        @NameInMap("ThresholdCount")
        private Long thresholdCount;

        @NameInMap("TrafficPercentage")
        private Long trafficPercentage;

        private EndpointGroupConfigurations(Builder builder) {
            this.enableClientIPPreservationProxyProtocol = builder.enableClientIPPreservationProxyProtocol;
            this.enableClientIPPreservationToa = builder.enableClientIPPreservationToa;
            this.endpointConfigurations = builder.endpointConfigurations;
            this.endpointGroupDescription = builder.endpointGroupDescription;
            this.endpointGroupName = builder.endpointGroupName;
            this.endpointGroupRegion = builder.endpointGroupRegion;
            this.endpointGroupType = builder.endpointGroupType;
            this.endpointRequestProtocol = builder.endpointRequestProtocol;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckIntervalSeconds = builder.healthCheckIntervalSeconds;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckPort = builder.healthCheckPort;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.portOverrides = builder.portOverrides;
            this.thresholdCount = builder.thresholdCount;
            this.trafficPercentage = builder.trafficPercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroupConfigurations create() {
            return builder().build();
        }

        /**
         * @return enableClientIPPreservationProxyProtocol
         */
        public Boolean getEnableClientIPPreservationProxyProtocol() {
            return this.enableClientIPPreservationProxyProtocol;
        }

        /**
         * @return enableClientIPPreservationToa
         */
        public Boolean getEnableClientIPPreservationToa() {
            return this.enableClientIPPreservationToa;
        }

        /**
         * @return endpointConfigurations
         */
        public java.util.List < EndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        /**
         * @return endpointGroupDescription
         */
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        /**
         * @return endpointGroupName
         */
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        /**
         * @return endpointGroupRegion
         */
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        /**
         * @return endpointGroupType
         */
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        /**
         * @return endpointRequestProtocol
         */
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        /**
         * @return healthCheckEnabled
         */
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        /**
         * @return healthCheckIntervalSeconds
         */
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        /**
         * @return healthCheckPath
         */
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        /**
         * @return healthCheckPort
         */
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        /**
         * @return healthCheckProtocol
         */
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        /**
         * @return portOverrides
         */
        public java.util.List < PortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        /**
         * @return thresholdCount
         */
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        /**
         * @return trafficPercentage
         */
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

        public static final class Builder {
            private Boolean enableClientIPPreservationProxyProtocol; 
            private Boolean enableClientIPPreservationToa; 
            private java.util.List < EndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations; 
            private String endpointGroupDescription; 
            private String endpointGroupName; 
            private String endpointGroupRegion; 
            private String endpointGroupType; 
            private String endpointRequestProtocol; 
            private Boolean healthCheckEnabled; 
            private Long healthCheckIntervalSeconds; 
            private String healthCheckPath; 
            private Long healthCheckPort; 
            private String healthCheckProtocol; 
            private java.util.List < PortOverrides> portOverrides; 
            private Long thresholdCount; 
            private Long trafficPercentage; 

            /**
             * Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:
             * <p>
             * 
             * *   **true**: uses the proxy protocol to preserve client IP addresses.
             * *   **false** (default): does not use the proxy protocol to preserve client IP addresses.
             * 
             * You can set this parameter for up to 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder enableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
                this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
                return this;
            }

            /**
             * Specifies whether to obtain and preserve the IP addresses of clients that access the endpoint by using the TCP Option Address (TOA) module. Valid values:
             * <p>
             * 
             * *   **true**: preserves client IP addresses by using the TOA module.
             * *   **false** (default): does not preserve client IP addresses by using the TOA module.
             * 
             * You can set this parameter for up to 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder enableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
                this.enableClientIPPreservationToa = enableClientIPPreservationToa;
                return this;
            }

            /**
             * The endpoint that is associated with the intelligent routing listener.
             */
            public Builder endpointConfigurations(java.util.List < EndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * The description of the endpoint group that is associated with the intelligent routing listener.
             * <p>
             * 
             * The description cannot exceed 256 characters in length and cannot contain `http://` or `https://`.
             * 
             * You can enter the descriptions of up to 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder endpointGroupDescription(String endpointGroupDescription) {
                this.endpointGroupDescription = endpointGroupDescription;
                return this;
            }

            /**
             * The name of the endpoint group that is associated with the intelligent routing listener.
             * <p>
             * 
             * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
             * 
             * You can enter the names of up to 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder endpointGroupName(String endpointGroupName) {
                this.endpointGroupName = endpointGroupName;
                return this;
            }

            /**
             * The region ID of the endpoint group that is associated with the intelligent routing listener.
             * <p>
             * 
             * You can enter the region IDs of up to 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * The endpoint group type of the intelligent routing listener. Valid values:
             * <p>
             * 
             * *   **default** (default): a default endpoint group.
             * *   **virtual**: a virtual endpoint group.
             * 
             * You can specify the types of up to 10 endpoint groups.
             * 
             * > 
             * 
             * *   You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             * 
             * *   Only HTTP intelligent routing listeners and HTTPS intelligent routing listeners support virtual endpoint groups.
             */
            public Builder endpointGroupType(String endpointGroupType) {
                this.endpointGroupType = endpointGroupType;
                return this;
            }

            /**
             * The protocol used by the endpoint that is associated with the intelligent routing listener. Valid values:
             * <p>
             * 
             * *   **HTTP** (default): HTTP
             * *   **HTTPS**: HTTPS
             * 
             * You can specify at most 10 protocols.
             * 
             * > 
             * 
             * *   You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             * 
             * *   You can set this parameter only for HTTP intelligent routing listeners and HTTPS intelligent routing listeners.
             * *   For an HTTP listener, the protocol must be **HTTP**.
             */
            public Builder endpointRequestProtocol(String endpointRequestProtocol) {
                this.endpointRequestProtocol = endpointRequestProtocol;
                return this;
            }

            /**
             * Specifies whether to enable health checks for the endpoint group that is associated with the intelligent routing listener. Valid values:
             * <p>
             * 
             * *   **true**: enables the health check feature.
             * *   **false** (default): disables the health check feature.
             * 
             * You can enable the health check feature for up to 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * The interval at which you want to perform health checks. Unit: seconds.
             * <p>
             * 
             * You can specify up to 10 health check intervals.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder healthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
                this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
                return this;
            }

            /**
             * The path to which health check requests are sent.
             * <p>
             * 
             * You can specify up to 10 health check paths.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * The port that is used for health checks. Valid values: **1** to **65535**.
             * <p>
             * 
             * You can specify up to 10 ports for health checks.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder healthCheckPort(Long healthCheckPort) {
                this.healthCheckPort = healthCheckPort;
                return this;
            }

            /**
             * The protocol over which health check requests are sent. Valid values:
             * <p>
             * 
             * *   **tcp**: TCP
             * *   **http**: HTTP
             * *   **https**: HTTPS
             * 
             * You can specify up to 10 health check protocols.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * The mappings between ports.
             */
            public Builder portOverrides(java.util.List < PortOverrides> portOverrides) {
                this.portOverrides = portOverrides;
                return this;
            }

            /**
             * The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy. Valid values: **2** to **10**. Default value: **3**.
             * <p>
             * 
             * You can specify the number of consecutive health check successes or failures for at most 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder thresholdCount(Long thresholdCount) {
                this.thresholdCount = thresholdCount;
                return this;
            }

            /**
             * The traffic distribution ratio. If an intelligent routing listener is associated with multiple endpoint groups, you can use this parameter to specify the ratio of traffic that you want to distribute to each endpoint group.
             * <p>
             * 
             * Valid values: **1** to **100**. Default value: **100**.
             * 
             * You can specify the traffic distribution ratios for up to 10 endpoint groups.
             * 
             * > You can configure endpoint groups and endpoints for an intelligent routing listener only if the **Type** parameter is set to **Standard**.
             */
            public Builder trafficPercentage(Long trafficPercentage) {
                this.trafficPercentage = trafficPercentage;
                return this;
            }

            public EndpointGroupConfigurations build() {
                return new EndpointGroupConfigurations(this);
            } 

        } 

    }
    public static class PortRanges extends TeaModel {
        @NameInMap("FromPort")
        @Validation(required = true)
        private Integer fromPort;

        @NameInMap("ToPort")
        @Validation(required = true)
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
             * The first port of the listener port range that you want to use to receive and forward requests to endpoints.
             * <p>
             * 
             * Valid values: **1** to **65499**. The value of **FromPort** must be smaller than or equal to the value of **ToPort**.
             * 
             * The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see [Listener overview](~~153216~~).
             * 
             * > You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port of the listener port range that you want to use to receive and forward requests to endpoints.
             * <p>
             * 
             * Valid values: **1** to **65499**. The value of **FromPort** must be smaller than or equal to the value of **ToPort**.
             * 
             * The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see [Listener overview](~~153216~~).
             * 
             * > You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.
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
    public static class XForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForGaApEnabled")
        private Boolean xForwardedForGaApEnabled;

        @NameInMap("XForwardedForGaIdEnabled")
        private Boolean xForwardedForGaIdEnabled;

        @NameInMap("XForwardedForPortEnabled")
        private Boolean xForwardedForPortEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        private Boolean xForwardedForProtoEnabled;

        @NameInMap("XRealIpEnabled")
        private Boolean xRealIpEnabled;

        private XForwardedForConfig(Builder builder) {
            this.xForwardedForGaApEnabled = builder.xForwardedForGaApEnabled;
            this.xForwardedForGaIdEnabled = builder.xForwardedForGaIdEnabled;
            this.xForwardedForPortEnabled = builder.xForwardedForPortEnabled;
            this.xForwardedForProtoEnabled = builder.xForwardedForProtoEnabled;
            this.xRealIpEnabled = builder.xRealIpEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XForwardedForConfig create() {
            return builder().build();
        }

        /**
         * @return xForwardedForGaApEnabled
         */
        public Boolean getXForwardedForGaApEnabled() {
            return this.xForwardedForGaApEnabled;
        }

        /**
         * @return xForwardedForGaIdEnabled
         */
        public Boolean getXForwardedForGaIdEnabled() {
            return this.xForwardedForGaIdEnabled;
        }

        /**
         * @return xForwardedForPortEnabled
         */
        public Boolean getXForwardedForPortEnabled() {
            return this.xForwardedForPortEnabled;
        }

        /**
         * @return xForwardedForProtoEnabled
         */
        public Boolean getXForwardedForProtoEnabled() {
            return this.xForwardedForProtoEnabled;
        }

        /**
         * @return xRealIpEnabled
         */
        public Boolean getXRealIpEnabled() {
            return this.xRealIpEnabled;
        }

        public static final class Builder {
            private Boolean xForwardedForGaApEnabled; 
            private Boolean xForwardedForGaIdEnabled; 
            private Boolean xForwardedForPortEnabled; 
            private Boolean xForwardedForProtoEnabled; 
            private Boolean xRealIpEnabled; 

            /**
             * Specifies whether to use the `GA-AP` header to retrieve the information about acceleration regions. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false** (default): no
             * 
             * > This parameter is available only when you create an HTTPS or HTTP listener.
             */
            public Builder xForwardedForGaApEnabled(Boolean xForwardedForGaApEnabled) {
                this.xForwardedForGaApEnabled = xForwardedForGaApEnabled;
                return this;
            }

            /**
             * Specifies whether to use the `GA-ID` header to retrieve the ID of the GA instance. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false** (default): no
             * 
             * > This parameter is available only when you create an HTTPS or HTTP listener.
             */
            public Builder xForwardedForGaIdEnabled(Boolean xForwardedForGaIdEnabled) {
                this.xForwardedForGaIdEnabled = xForwardedForGaIdEnabled;
                return this;
            }

            /**
             * Specifies whether to use the `GA-X-Forward-Port` header to retrieve the listener ports of the GA instance. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false** (default): no
             * 
             * > This parameter is available only when you create an HTTPS or HTTP listener.
             */
            public Builder xForwardedForPortEnabled(Boolean xForwardedForPortEnabled) {
                this.xForwardedForPortEnabled = xForwardedForPortEnabled;
                return this;
            }

            /**
             * Specifies whether to use the `GA-X-Forward-Proto` header to retrieve the listener protocol of the GA instance. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false** (default): no
             * 
             * > This parameter is available only when you create an HTTPS or HTTP listener.
             */
            public Builder xForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
                this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
                return this;
            }

            /**
             * Specifies whether to use the `X-Real-IP` header to retrieve client IP addresses. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false** (default): no
             * 
             * > This parameter is available only when you create an HTTPS or HTTP listener.
             */
            public Builder xRealIpEnabled(Boolean xRealIpEnabled) {
                this.xRealIpEnabled = xRealIpEnabled;
                return this;
            }

            public XForwardedForConfig build() {
                return new XForwardedForConfig(this);
            } 

        } 

    }
}
