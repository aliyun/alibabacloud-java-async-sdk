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
 * {@link CreateListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateListenerRequest</p>
 */
public class CreateListenerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List<Certificates> certificates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientAffinity")
    private String clientAffinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomRoutingEndpointGroupConfigurations")
    private java.util.List<CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupConfigurations")
    private java.util.List<EndpointGroupConfigurations> endpointGroupConfigurations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpVersion")
    private String httpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRanges")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PortRanges> portRanges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedForConfig")
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
        this.httpVersion = builder.httpVersion;
        this.idleTimeout = builder.idleTimeout;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.requestTimeout = builder.requestTimeout;
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
    public java.util.List<Certificates> getCertificates() {
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
    public java.util.List<CustomRoutingEndpointGroupConfigurations> getCustomRoutingEndpointGroupConfigurations() {
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
    public java.util.List<EndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    /**
     * @return httpVersion
     */
    public String getHttpVersion() {
        return this.httpVersion;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
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
    public java.util.List<PortRanges> getPortRanges() {
        return this.portRanges;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
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
        private java.util.List<Certificates> certificates; 
        private String clientAffinity; 
        private String clientToken; 
        private java.util.List<CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations; 
        private String description; 
        private java.util.List<EndpointGroupConfigurations> endpointGroupConfigurations; 
        private String httpVersion; 
        private Integer idleTimeout; 
        private String name; 
        private java.util.List<PortRanges> portRanges; 
        private String protocol; 
        private String regionId; 
        private Integer requestTimeout; 
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
            this.httpVersion = request.httpVersion;
            this.idleTimeout = request.idleTimeout;
            this.name = request.name;
            this.portRanges = request.portRanges;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.requestTimeout = request.requestTimeout;
            this.securityPolicyId = request.securityPolicyId;
            this.type = request.type;
            this.xForwardedForConfig = request.xForwardedForConfig;
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
         * <p>The SSL certificates.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>Specifies whether to enable client affinity for the listener.</p>
         * <ul>
         * <li>If this parameter is left empty, client affinity is disabled. After client affinity is disabled, requests from a specific client IP address may be forwarded to different endpoints.</li>
         * <li>To enable client affinity, set this parameter to <strong>SOURCE_IP</strong>. In this case, when a client accesses stateful applications, requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SOURCE_IP</p>
         */
        public Builder clientAffinity(String clientAffinity) {
            this.putQueryParameter("ClientAffinity", clientAffinity);
            this.clientAffinity = clientAffinity;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> is different for each API request.</p>
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
         * <p>The endpoint group that is associated with the custom routing listener.</p>
         * <p>The endpoint groups that are associated with the custom routing listener.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        public Builder customRoutingEndpointGroupConfigurations(java.util.List<CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations) {
            this.putQueryParameter("CustomRoutingEndpointGroupConfigurations", customRoutingEndpointGroupConfigurations);
            this.customRoutingEndpointGroupConfigurations = customRoutingEndpointGroupConfigurations;
            return this;
        }

        /**
         * <p>The description of the listener.</p>
         * <p>The description can be up to 200 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The endpoint groups that are associated with the intelligent routing listener.</p>
         * <p>You can configure up to 10 endpoint groups for an intelligent routing listener.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         */
        public Builder endpointGroupConfigurations(java.util.List<EndpointGroupConfigurations> endpointGroupConfigurations) {
            this.putQueryParameter("EndpointGroupConfigurations", endpointGroupConfigurations);
            this.endpointGroupConfigurations = endpointGroupConfigurations;
            return this;
        }

        /**
         * <p>The maximum version of the HTTP protocol. Valid values:</p>
         * <ul>
         * <li><strong>http3</strong></li>
         * <li><strong>http2</strong> (default)</li>
         * <li><strong>http1.1</strong></li>
         * </ul>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http2</p>
         */
        public Builder httpVersion(String httpVersion) {
            this.putQueryParameter("HttpVersion", httpVersion);
            this.httpVersion = httpVersion;
            return this;
        }

        /**
         * <p>The timeout period of idle connections. Unit: seconds.</p>
         * <ul>
         * <li>TCP: 10-900. Default value: 900. Unit: seconds.</li>
         * <li>UDP: 10-20. Default value: 20. Unit: seconds.</li>
         * <li>HTTP/HTTPS: 1-60. Default value: 15. Unit: seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The name of the listener.</p>
         * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The listener ports. Valid values: <strong>1</strong> to <strong>65499</strong>. The maximum number of ports that can be configured depends on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder portRanges(java.util.List<PortRanges> portRanges) {
            this.putQueryParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * <p>The network transmission protocol that you want to use for the listener. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: TCP</li>
         * <li><strong>udp</strong>: UDP</li>
         * <li><strong>http</strong>: HTTP</li>
         * <li><strong>https</strong>: HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
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

        /**
         * <p>The timeout period for HTTP or HTTPS requests. Unit: seconds.</p>
         * <p>Valid values: 1 to 180. Default value: 60. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter takes effect only for HTTP or HTTPS listeners. If the backend server does not respond within the timeout period, GA returns an HTTP 504 error code to the client.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.putQueryParameter("RequestTimeout", requestTimeout);
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The ID of the security policy. Valid values:</p>
         * <ul>
         * <li><p><strong>tls_cipher_policy_1_0</strong></p>
         * <ul>
         * <li>Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2</li>
         * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_1</strong></p>
         * <ul>
         * <li>Supported TLS versions: TLS 1.1 and TLS 1.2</li>
         * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2</strong></p>
         * <ul>
         * <li>Supported TLS version: TLS 1.2</li>
         * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
         * <ul>
         * <li>Supported TLS version: TLS 1.2</li>
         * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
         * <ul>
         * <li>Supported TLS versions: TLS 1.2 and TLS 1.3</li>
         * <li>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tls_cipher_policy_1_0</p>
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * <p>The routing type of the listener. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong> (default): intelligent routing</li>
         * <li><strong>CustomRouting</strong>: custom routing</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager.</li>
         * <li>You can create only listeners of the same routing type for a standard GA instance. You cannot change the routing types of listeners. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The <code>XForward</code> headers.</p>
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

    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
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

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.id = model.id;
            } 

            /**
             * <p>The ID of the SSL certificate.</p>
             * <blockquote>
             * <p>This parameter is required only when you create an HTTPS listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>449****-cn-hangzhou</p>
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
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
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
             * <p>The start port used by the endpoint group that is associated with the custom routing listener.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be equal to or smaller than the value of <strong>ToPort</strong>.</p>
             * <p>You can specify up to 20 start ports for an endpoint group of a custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The protocol used by the endpoint group that is associated with the custom routing listener.</p>
             * <p>You can specify up to four protocol types for an endpoint group of a custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The end port used by the endpoint group that is associated with the custom routing listener.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be equal to or smaller than the value of <strong>ToPort</strong>.</p>
             * <p>You can specify up to 20 end ports for an endpoint group of a custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
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
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class PolicyConfigurationsPortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
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

            private Builder() {
            } 

            private Builder(PolicyConfigurationsPortRanges model) {
                this.fromPort = model.fromPort;
                this.toPort = model.toPort;
            } 

            /**
             * <p>The start port of the port range. The value of this parameter must fall within the port range of the backend service.</p>
             * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five start ports for each destination.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The end port of the destination port range. The value of this parameter must fall within the port range of the backend service.</p>
             * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five end ports for each destination.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class PolicyConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("PortRanges")
        private java.util.List<PolicyConfigurationsPortRanges> portRanges;

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
        public java.util.List<PolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public static final class Builder {
            private String address; 
            private java.util.List<PolicyConfigurationsPortRanges> portRanges; 

            private Builder() {
            } 

            private Builder(PolicyConfigurations model) {
                this.address = model.address;
                this.portRanges = model.portRanges;
            } 

            /**
             * <p>The IP address of the destination.</p>
             * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify up to 20 destination IP addresses for each endpoint of a custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
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
             * <p>The port ranges of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.</p>
             * <p>If you do not specify this parameter, traffic is forwarded over all ports.</p>
             * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
             * <p>You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five port ranges for each destination.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             */
            public Builder portRanges(java.util.List<PolicyConfigurationsPortRanges> portRanges) {
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
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
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
             * <p>The name of the vSwitch attached to the endpoint of the custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-test01</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The destinations in the endpoint that is associated with the custom routing listener.</p>
             * <p>You can specify up to 20 traffic destinations for each endpoint of a custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             */
            public Builder policyConfigurations(java.util.List<PolicyConfigurations> policyConfigurations) {
                this.policyConfigurations = policyConfigurations;
                return this;
            }

            /**
             * <p>The traffic policy for the endpoint that is associated with the custom routing listener. Default value: DenyAll. Valid values:</p>
             * <ul>
             * <li><strong>DenyAll</strong> (default): denies all traffic to the specified backend service.</li>
             * <li><strong>AllowAll</strong>: allows all traffic to the specified backend service.</li>
             * <li><strong>AllowCustom</strong>: allows traffic only to specified destinations in the endpoint. If you set this parameter to AllowCustom, you must specify IP addresses and port ranges as the destinations to which you want to distribute traffic. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to the specified IP addresses over all destination ports.</li>
             * </ul>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>DenyAll</p>
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * <p>The service type of the endpoint that is associated with the custom routing listener. Default value: PrivateSubNet. Set the value to</p>
             * <p><strong>PrivateSubNet</strong>, which specifies a private CIDR block.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
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
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class CustomRoutingEndpointGroupConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationConfigurations")
        private java.util.List<DestinationConfigurations> destinationConfigurations;

        @com.aliyun.core.annotation.NameInMap("EndpointConfigurations")
        private java.util.List<EndpointConfigurations> endpointConfigurations;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder(CustomRoutingEndpointGroupConfigurations model) {
                this.description = model.description;
                this.destinationConfigurations = model.destinationConfigurations;
                this.endpointConfigurations = model.endpointConfigurations;
                this.endpointGroupRegion = model.endpointGroupRegion;
                this.name = model.name;
            } 

            /**
             * <p>The description of the endpoint group that is associated with the custom routing listener.</p>
             * <p>The description can be up to 200 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify up to five endpoint group descriptions.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mapping configurations of the endpoint group that is associated with the custom routing listener.</p>
             * <p>You need to specify the port ranges and protocols used by the endpoint group. The ports are mapped to listener ports.</p>
             * <p>You can specify up to 20 mapping configurations for an endpoint group of a custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             */
            public Builder destinationConfigurations(java.util.List<DestinationConfigurations> destinationConfigurations) {
                this.destinationConfigurations = destinationConfigurations;
                return this;
            }

            /**
             * <p>The endpoints that are associated with the custom routing listener.</p>
             * <p>You can configure up to 10 endpoints for an endpoint group of a custom routing listener.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             */
            public Builder endpointConfigurations(java.util.List<EndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * <p>The region ID of the endpoint group that is associated with the custom routing listener.</p>
             * <p>You can enter the region IDs of up to five endpoint groups.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * <p>The name of the endpoint group that is associated with the custom routing listener.</p>
             * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
             * <p>You can specify up to five endpoint group names.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints for a custom routing listener only if <strong>Type</strong> is set to <strong>CustomRouting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class EndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableClientIPPreservation")
        private Boolean enableClientIPPreservation;

        @com.aliyun.core.annotation.NameInMap("EnableProxyProtocol")
        private Boolean enableProxyProtocol;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("SubAddress")
        private String subAddress;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        private EndpointGroupConfigurationsEndpointConfigurations(Builder builder) {
            this.enableClientIPPreservation = builder.enableClientIPPreservation;
            this.enableProxyProtocol = builder.enableProxyProtocol;
            this.endpoint = builder.endpoint;
            this.subAddress = builder.subAddress;
            this.type = builder.type;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroupConfigurationsEndpointConfigurations create() {
            return builder().build();
        }

        /**
         * @return enableClientIPPreservation
         */
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        /**
         * @return enableProxyProtocol
         */
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
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
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Boolean enableClientIPPreservation; 
            private Boolean enableProxyProtocol; 
            private String endpoint; 
            private String subAddress; 
            private String type; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(EndpointGroupConfigurationsEndpointConfigurations model) {
                this.enableClientIPPreservation = model.enableClientIPPreservation;
                this.enableProxyProtocol = model.enableProxyProtocol;
                this.endpoint = model.endpoint;
                this.subAddress = model.subAddress;
                this.type = model.type;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
                this.weight = model.weight;
            } 

            /**
             * <p>Specifies whether to automatically preserve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>By default, client IP address preservation is disabled for an endpoint group that is associated with a UDP or TCP listener. You can configure this parameter based on your business requirements.</li>
             * <li>By default, client IP address preservation is enabled for an endpoint group that is associated with a HTTP or HTTPS listener. Client IP addresses are obtained by using the X-Forwarded-For header. You cannot disable the feature.</li>
             * <li>EnableClientIPPreservation and EnableProxyProtocol cannot be set to true at the same time.<blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client IP addresses</a>.</p>
             * </blockquote>
             * </li>
             * </ul>
             * </blockquote>
             */
            public Builder enableClientIPPreservation(Boolean enableClientIPPreservation) {
                this.enableClientIPPreservation = enableClientIPPreservation;
                return this;
            }

            /**
             * <p>Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only by endpoint groups associated with TCP listeners.</li>
             * <li>EnableClientIPPreservation and EnableProxyProtocol cannot be set to true at the same time.<blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client IP addresses</a>.</p>
             * </blockquote>
             * </li>
             * </ul>
             * </blockquote>
             */
            public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
                this.enableProxyProtocol = enableProxyProtocol;
                return this;
            }

            /**
             * <p>The IP address or domain name of the endpoint that is associated with the intelligent routing listener.</p>
             * <p>You can enter the IP addresses or domain names of up to 100 endpoints in an endpoint group that is associated with the intelligent routing listener.</p>
             * <blockquote>
             * <p> If you set <strong>Type</strong> to <strong>Standard</strong>, you can configure endpoint groups and endpoints, and this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>47.0.XX.XX</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The private IP address of the ENI.</p>
             * <blockquote>
             * <p> This parameter is available only when you set the endpoint type to <strong>ENI</strong>. If you leave this parameter empty, the primary private IP address of the ENI is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.168.XX.XX</p>
             */
            public Builder subAddress(String subAddress) {
                this.subAddress = subAddress;
                return this;
            }

            /**
             * <p>The type of the endpoint that is associated with the intelligent routing listener. Valid values:</p>
             * <ul>
             * <li><strong>Domain</strong>: a custom domain name.</li>
             * <li><strong>Ip</strong>: a custom IP address.</li>
             * <li><strong>PublicIp</strong>: a public IP address provided by Alibaba Cloud.</li>
             * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance.</li>
             * <li><strong>SLB</strong>: a Server Load Balancer (SLB) instance.</li>
             * <li><strong>ALB</strong>: an Application Load Balancer (ALB) instance.</li>
             * <li><strong>OSS</strong>: an Object Storage Service (OSS) bucket.</li>
             * <li><strong>ENI</strong>: an elastic network interface (ENI).</li>
             * <li><strong>NLB</strong>: a Network Load Balancer (NLB) instance.</li>
             * <li><strong>IpTarget</strong>: a custom private IP address.</li>
             * </ul>
             * <p>You can specify up to 100 endpoint types in the endpoint group that is associated with the intelligent routing listener.</p>
             * <blockquote>
             * <ul>
             * <li>If you set <strong>Type</strong> to <strong>Standard</strong>, you can configure the endpoint group and endpoint that are associated with the intelligent routing listener. In addition, this parameter is required.</li>
             * <li>If you set this parameter to <strong>ECS</strong>, <strong>ENI</strong>, <strong>SLB</strong>, <strong>ALB</strong>, <strong>NLB</strong>, or <strong>IpTarget</strong> and the AliyunServiceRoleForGaVpcEndpoint service-linked role does not exist, the system automatically creates the role.</li>
             * <li>If you set this parameter to <strong>ALB</strong> and the AliyunServiceRoleForGaAlb service-linked role does not exist, the system automatically creates the role.</li>
             * <li>If you set this parameter to <strong>OSS</strong> and the AliyunServiceRoleForGaOss service-linked role does not exist, the system automatically creates the role.</li>
             * <li>If you set this parameter to <strong>NLB</strong> and the AliyunServiceRoleForGaNlb service-linked role does not exist, the system automatically creates the role.<blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178360.html">Service-linked roles</a>.</p>
             * </blockquote>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Ip</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The IDs of vSwitches that are deployed in the VPC.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * <p>You can specify one VPC ID for an endpoint group of an intelligent routing listener.</p>
             * <blockquote>
             * <p> This parameter is valid and required only if Type is set to <strong>IpTarget</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp13r1kpr2lel****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The weight of the endpoint that is associated with the intelligent routing listener.</p>
             * <p>Valid values: <strong>0</strong> to <strong>255</strong>.</p>
             * <p>You can specify the weights of up to 100 endpoints for an endpoint group of an intelligent routing listener.</p>
             * <blockquote>
             * <ul>
             * <li>If you set <strong>Type</strong> to <strong>Standard</strong>, you can configure the endpoint group and endpoint that are associated with the intelligent routing listener. In addition, this parameter is required.</li>
             * <li>If the weight of an endpoint is set to 0, GA stops distributing network traffic to the endpoint. Proceed with caution.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class PortOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointPort")
        private Long endpointPort;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
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

            private Builder() {
            } 

            private Builder(PortOverrides model) {
                this.endpointPort = model.endpointPort;
                this.listenerPort = model.listenerPort;
            } 

            /**
             * <p>The endpoint port that is mapped to the listener port.</p>
             * <p>You can specify endpoint ports in up to five port mappings.</p>
             * <blockquote>
             * <ul>
             * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
             * <li>You cannot configure port mappings for virtual endpoint groups of TCP listeners. If a virtual endpoint group already exists on the listener, you cannot configure port mappings for the default endpoint group. If port mappings are configured for the default endpoint group, you cannot add a virtual endpoint group.</li>
             * <li>If you configure port mappings for a listener, you cannot modify the listener protocol. You can only switch between HTTP and HTTPS.</li>
             * <li>Listener port: When you modify the listener port range, make sure that the port range includes the ports configured in port mappings. For example, if you set the listener port range to 80 to 82 and map the listener ports to endpoint ports 100 to 102, you cannot change the listener port range to 80 to 81.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder endpointPort(Long endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * <p>The listener port that is mapped to the endpoint port.</p>
             * <p>You can specify listener ports in up to five port mappings.</p>
             * <blockquote>
             * <ul>
             * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
             * <li>You cannot configure port mappings for virtual endpoint groups of TCP listeners. If a virtual endpoint group already exists on the listener, you cannot configure port mappings for the default endpoint group. If port mappings are configured for the default endpoint group, you cannot add a virtual endpoint group.</li>
             * <li>If you configure port mappings for a listener, you cannot modify the listener protocol. You can only switch between HTTP and HTTPS.</li>
             * <li>Listener port: When you modify the listener port range, make sure that the port range includes the ports configured in port mappings. For example, if you set the listener port range to 80 to 82 and map the listener ports to endpoint ports 100 to 102, you cannot change the listener port range to 80 to 81.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>443</p>
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
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class EndpointGroupConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointConfigurations")
        private java.util.List<EndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupDescription")
        private String endpointGroupDescription;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupName")
        private String endpointGroupName;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupType")
        private String endpointGroupType;

        @com.aliyun.core.annotation.NameInMap("EndpointIpVersion")
        private String endpointIpVersion;

        @com.aliyun.core.annotation.NameInMap("EndpointProtocolVersion")
        private String endpointProtocolVersion;

        @com.aliyun.core.annotation.NameInMap("EndpointRequestProtocol")
        private String endpointRequestProtocol;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @com.aliyun.core.annotation.NameInMap("HealthCheckIntervalSeconds")
        private Long healthCheckIntervalSeconds;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
        private Long healthCheckPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @com.aliyun.core.annotation.NameInMap("PortOverrides")
        private java.util.List<PortOverrides> portOverrides;

        @com.aliyun.core.annotation.NameInMap("ThresholdCount")
        private Long thresholdCount;

        @com.aliyun.core.annotation.NameInMap("TrafficPercentage")
        private Long trafficPercentage;

        private EndpointGroupConfigurations(Builder builder) {
            this.endpointConfigurations = builder.endpointConfigurations;
            this.endpointGroupDescription = builder.endpointGroupDescription;
            this.endpointGroupName = builder.endpointGroupName;
            this.endpointGroupRegion = builder.endpointGroupRegion;
            this.endpointGroupType = builder.endpointGroupType;
            this.endpointIpVersion = builder.endpointIpVersion;
            this.endpointProtocolVersion = builder.endpointProtocolVersion;
            this.endpointRequestProtocol = builder.endpointRequestProtocol;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckHost = builder.healthCheckHost;
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
         * @return endpointConfigurations
         */
        public java.util.List<EndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
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
         * @return endpointIpVersion
         */
        public String getEndpointIpVersion() {
            return this.endpointIpVersion;
        }

        /**
         * @return endpointProtocolVersion
         */
        public String getEndpointProtocolVersion() {
            return this.endpointProtocolVersion;
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
         * @return healthCheckHost
         */
        public String getHealthCheckHost() {
            return this.healthCheckHost;
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
        public java.util.List<PortOverrides> getPortOverrides() {
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
            private java.util.List<EndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations; 
            private String endpointGroupDescription; 
            private String endpointGroupName; 
            private String endpointGroupRegion; 
            private String endpointGroupType; 
            private String endpointIpVersion; 
            private String endpointProtocolVersion; 
            private String endpointRequestProtocol; 
            private Boolean healthCheckEnabled; 
            private String healthCheckHost; 
            private Long healthCheckIntervalSeconds; 
            private String healthCheckPath; 
            private Long healthCheckPort; 
            private String healthCheckProtocol; 
            private java.util.List<PortOverrides> portOverrides; 
            private Long thresholdCount; 
            private Long trafficPercentage; 

            private Builder() {
            } 

            private Builder(EndpointGroupConfigurations model) {
                this.endpointConfigurations = model.endpointConfigurations;
                this.endpointGroupDescription = model.endpointGroupDescription;
                this.endpointGroupName = model.endpointGroupName;
                this.endpointGroupRegion = model.endpointGroupRegion;
                this.endpointGroupType = model.endpointGroupType;
                this.endpointIpVersion = model.endpointIpVersion;
                this.endpointProtocolVersion = model.endpointProtocolVersion;
                this.endpointRequestProtocol = model.endpointRequestProtocol;
                this.healthCheckEnabled = model.healthCheckEnabled;
                this.healthCheckHost = model.healthCheckHost;
                this.healthCheckIntervalSeconds = model.healthCheckIntervalSeconds;
                this.healthCheckPath = model.healthCheckPath;
                this.healthCheckPort = model.healthCheckPort;
                this.healthCheckProtocol = model.healthCheckProtocol;
                this.portOverrides = model.portOverrides;
                this.thresholdCount = model.thresholdCount;
                this.trafficPercentage = model.trafficPercentage;
            } 

            /**
             * <p>The endpoints that are associated with the intelligent routing listener.</p>
             */
            public Builder endpointConfigurations(java.util.List<EndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * <p>The description of the endpoint group that is associated with the intelligent routing listener.</p>
             * <p>The description can be up to 200 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can enter the descriptions of up to 10 endpoint groups.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endpointGroupDescription(String endpointGroupDescription) {
                this.endpointGroupDescription = endpointGroupDescription;
                return this;
            }

            /**
             * <p>The name of the endpoint group that is associated with the intelligent routing listener.</p>
             * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
             * <p>You can enter the names of up to 10 endpoint groups.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endpointGroupName(String endpointGroupName) {
                this.endpointGroupName = endpointGroupName;
                return this;
            }

            /**
             * <p>The region ID of the endpoint group that is associated with the intelligent routing listener.</p>
             * <p>You can enter the IDs of up to 10 regions.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * <p>The type of the endpoint group associated with the intelligent routing listener. Valid values:</p>
             * <ul>
             * <li><strong>default</strong> (default): a default endpoint group.</li>
             * <li><strong>virtual</strong>: a virtual endpoint group.</li>
             * </ul>
             * <p>You can specify up to 10 endpoint group types.</p>
             * <blockquote>
             * <ul>
             * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
             * <li>Only HTTP and HTTPS intelligent routing listeners support virtual endpoint groups.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder endpointGroupType(String endpointGroupType) {
                this.endpointGroupType = endpointGroupType;
                return this;
            }

            /**
             * EndpointIpVersion.
             */
            public Builder endpointIpVersion(String endpointIpVersion) {
                this.endpointIpVersion = endpointIpVersion;
                return this;
            }

            /**
             * <p>The backend service protocol version of the endpoint that is associated with the intelligent routing listener. Valid values:</p>
             * <ul>
             * <li><strong>HTTP1.1</strong> (default)</li>
             * <li><strong>HTTP2</strong></li>
             * </ul>
             * <blockquote>
             * <p> You can specify this parameter only if EndpointRequestProtocol is set to HTTPS.</p>
             * </blockquote>
             */
            public Builder endpointProtocolVersion(String endpointProtocolVersion) {
                this.endpointProtocolVersion = endpointProtocolVersion;
                return this;
            }

            /**
             * <p>The backend service protocol of the endpoint that is associated with the intelligent routing listener. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong> (default)</li>
             * <li><strong>HTTPS</strong></li>
             * </ul>
             * <p>You can specify up to 10 backend service protocols.</p>
             * <blockquote>
             * <ul>
             * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
             * <li>You can specify this parameter only for HTTP and HTTPS intelligent routing listeners.</li>
             * <li>For an HTTP listener, the backend service protocol must be <strong>HTTP</strong>.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder endpointRequestProtocol(String endpointRequestProtocol) {
                this.endpointRequestProtocol = endpointRequestProtocol;
                return this;
            }

            /**
             * <p>Specifies whether to enable health checks for the endpoint group. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables the health check feature.</li>
             * <li><strong>false</strong> (default): disables the health check feature.</li>
             * </ul>
             * <p>You can enable the health check feature for up to 10 endpoint groups.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * HealthCheckHost.
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed. Unit: seconds.</p>
             * <p>You can specify up to 10 health check intervals.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
                this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
                return this;
            }

            /**
             * <p>The health check path.</p>
             * <p>You can specify up to 10 health check paths.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/healthcheck</p>
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * <p>The port that you want to use for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>You can specify up to 10 ports for health checks.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder healthCheckPort(Long healthCheckPort) {
                this.healthCheckPort = healthCheckPort;
                return this;
            }

            /**
             * <p>The protocol over which health check requests are sent. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong> or <strong>TCP</strong></li>
             * <li><strong>http</strong> or <strong>HTTP</strong></li>
             * <li><strong>https</strong> or <strong>HTTPS</strong></li>
             * </ul>
             * <p>You can specify up to 10 health check protocols.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * <p>The port mappings.</p>
             */
            public Builder portOverrides(java.util.List<PortOverrides> portOverrides) {
                this.portOverrides = portOverrides;
                return this;
            }

            /**
             * <p>The number of failed consecutive health checks that must occur before a healthy endpoint group is considered unhealthy or the number of successful consecutive health checks that must occur before an unhealthy endpoint group is considered healthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
             * <p>You can specify up to 10 values (the number of consecutive health check successes or consecutive health check failures).</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder thresholdCount(Long thresholdCount) {
                this.thresholdCount = thresholdCount;
                return this;
            }

            /**
             * <p>The traffic distribution ratio. If an intelligent routing listener is associated with multiple endpoint groups, you can configure this parameter to specify the ratio of traffic distributed to each endpoint group.</p>
             * <p>Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>.</p>
             * <p>You can specify traffic distribution ratios for up to 10 endpoint groups.</p>
             * <blockquote>
             * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The first port of the listener port range that you want to use to receive and forward requests to endpoints.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be smaller than or equal to the value of <strong>ToPort</strong>.</p>
             * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
             * <blockquote>
             * <p>You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The last port of the listener port range that you want to use to receive and forward requests to endpoints.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be smaller than or equal to the value of <strong>ToPort</strong>.</p>
             * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
             * <blockquote>
             * <p>You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class XForwardedForConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("XForwardedForGaApEnabled")
        private Boolean xForwardedForGaApEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForGaIdEnabled")
        private Boolean xForwardedForGaIdEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForPortEnabled")
        private Boolean xForwardedForPortEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForProtoEnabled")
        private Boolean xForwardedForProtoEnabled;

        @com.aliyun.core.annotation.NameInMap("XRealIpEnabled")
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

            private Builder() {
            } 

            private Builder(XForwardedForConfig model) {
                this.xForwardedForGaApEnabled = model.xForwardedForGaApEnabled;
                this.xForwardedForGaIdEnabled = model.xForwardedForGaIdEnabled;
                this.xForwardedForPortEnabled = model.xForwardedForPortEnabled;
                this.xForwardedForProtoEnabled = model.xForwardedForProtoEnabled;
                this.xRealIpEnabled = model.xRealIpEnabled;
            } 

            /**
             * <p>Specifies whether to use the <code>GA-AP</code> header to retrieve the information about acceleration regions. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong> (default): no</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForGaApEnabled(Boolean xForwardedForGaApEnabled) {
                this.xForwardedForGaApEnabled = xForwardedForGaApEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>GA-ID</code> header to retrieve the ID of the GA instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong> (default): no</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForGaIdEnabled(Boolean xForwardedForGaIdEnabled) {
                this.xForwardedForGaIdEnabled = xForwardedForGaIdEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>GA-X-Forward-Port</code> header to retrieve the listener ports of the GA instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong> (default): no</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForPortEnabled(Boolean xForwardedForPortEnabled) {
                this.xForwardedForPortEnabled = xForwardedForPortEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>GA-X-Forward-Proto</code> header to retrieve the listener protocol of the GA instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong> (default): no</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
                this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Real-IP</code> header to retrieve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong> (default): no</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
