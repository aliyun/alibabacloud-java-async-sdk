// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateListenerRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerRequest</p>
 */
public class UpdateListenerRequest extends Request {
    @Query
    @NameInMap("BackendPorts")
    private java.util.List < BackendPorts> backendPorts;

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
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PortRanges")
    private java.util.List < PortRanges> portRanges;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("ProxyProtocol")
    private String proxyProtocol;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @Query
    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @Query
    @NameInMap("XForwardedForConfig")
    private XForwardedForConfig xForwardedForConfig;

    private UpdateListenerRequest(Builder builder) {
        super(builder);
        this.backendPorts = builder.backendPorts;
        this.certificates = builder.certificates;
        this.clientAffinity = builder.clientAffinity;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.idleTimeout = builder.idleTimeout;
        this.listenerId = builder.listenerId;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.proxyProtocol = builder.proxyProtocol;
        this.regionId = builder.regionId;
        this.requestTimeout = builder.requestTimeout;
        this.securityPolicyId = builder.securityPolicyId;
        this.xForwardedForConfig = builder.xForwardedForConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendPorts
     */
    public java.util.List < BackendPorts> getBackendPorts() {
        return this.backendPorts;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
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
    public String getProxyProtocol() {
        return this.proxyProtocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * @return xForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.xForwardedForConfig;
    }

    public static final class Builder extends Request.Builder<UpdateListenerRequest, Builder> {
        private java.util.List < BackendPorts> backendPorts; 
        private java.util.List < Certificates> certificates; 
        private String clientAffinity; 
        private String clientToken; 
        private String description; 
        private Integer idleTimeout; 
        private String listenerId; 
        private String name; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private String proxyProtocol; 
        private String regionId; 
        private Integer requestTimeout; 
        private String securityPolicyId; 
        private XForwardedForConfig xForwardedForConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateListenerRequest request) {
            super(request);
            this.backendPorts = request.backendPorts;
            this.certificates = request.certificates;
            this.clientAffinity = request.clientAffinity;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.idleTimeout = request.idleTimeout;
            this.listenerId = request.listenerId;
            this.name = request.name;
            this.portRanges = request.portRanges;
            this.protocol = request.protocol;
            this.proxyProtocol = request.proxyProtocol;
            this.regionId = request.regionId;
            this.requestTimeout = request.requestTimeout;
            this.securityPolicyId = request.securityPolicyId;
            this.xForwardedForConfig = request.xForwardedForConfig;
        } 

        /**
         * The range of ports that are used by backend servers to receive requests.
         */
        public Builder backendPorts(java.util.List < BackendPorts> backendPorts) {
            this.putQueryParameter("BackendPorts", backendPorts);
            this.backendPorts = backendPorts;
            return this;
        }

        /**
         * The SSL certificate.
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
         * *   To enable client affinity, set this parameter to **SOURCE_IP**. In this case, when a client accesses stateful applications, requests from the same client are always forwarded to the same endpoint regardless of the source port or protocol.
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
         * You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * IdleTimeout.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
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
         * The listener ports that are used to receive requests and forward the requests to endpoints.
         * <p>
         * 
         * Valid values: **1** to **65499**.
         * 
         * The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see [Listener overview](~~153216~~).
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.putQueryParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * The network transmission protocol that is used by the listener. Valid values:
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
         * Specifies whether to reserve client IP addresses. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: enables client IP preservation. After client IP addresses are reserved, you can view client IP addresses on the endpoints.
         * *   **false** (default): disables client IP preservation.
         * 
         * > This parameter will be deprecated in the API operations that are used to configure listeners. We recommend that you set this parameter when you call API operations to configure endpoint groups. For more information about the **ProxyProtocol** parameter, see [CreateEndpointGroup](~~153259~~) and [UpdateEndpointGroup](~~153262~~).
         */
        public Builder proxyProtocol(String proxyProtocol) {
            this.putQueryParameter("ProxyProtocol", proxyProtocol);
            this.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestTimeout.
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.putQueryParameter("RequestTimeout", requestTimeout);
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * The ID of the security policy. Valid values:
         * <p>
         * 
         * *   **tls_cipher_policy\_1\_0**
         * 
         *     *   Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
         * 
         * *   **tls_cipher_policy\_1\_1**
         * 
         *     *   Supported TLS versions: TLS 1.1 and TLS 1.2
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
         * 
         * *   **tls_cipher_policy\_1\_2**
         * 
         *     *   Supported TLS version: TLS 1.2
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
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
         * The `XForward` headers.
         */
        public Builder xForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
            this.putQueryParameter("XForwardedForConfig", xForwardedForConfig);
            this.xForwardedForConfig = xForwardedForConfig;
            return this;
        }

        @Override
        public UpdateListenerRequest build() {
            return new UpdateListenerRequest(this);
        } 

    } 

    public static class BackendPorts extends TeaModel {
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ToPort")
        private Integer toPort;

        private BackendPorts(Builder builder) {
            this.fromPort = builder.fromPort;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendPorts create() {
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
             * The first port in the range of ports that are used by backend servers to receive requests.
             * <p>
             * 
             * > This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port in the range of ports that are used by backend servers to receive requests.
             * <p>
             * 
             * > This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public BackendPorts build() {
                return new BackendPorts(this);
            } 

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
             * > This parameter is required only when you configure an HTTPS listener.
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
             * The first port of the listener port range that is used to receive and forward requests to endpoints.
             * <p>
             * 
             * Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.
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
             * The last port of the listener port range that is used to receive and forward requests to endpoints.
             * <p>
             * 
             * Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.
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
             * Specifies whether to use the `GA-AP` header to retrieve information about acceleration regions. Valid values:
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
