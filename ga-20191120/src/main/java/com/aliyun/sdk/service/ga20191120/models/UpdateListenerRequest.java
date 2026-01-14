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
 * {@link UpdateListenerRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerRequest</p>
 */
public class UpdateListenerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendPorts")
    private java.util.List<BackendPorts> backendPorts;

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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpVersion")
    private String httpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRanges")
    private java.util.List<PortRanges> portRanges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyProtocol")
    @Deprecated
    private String proxyProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedForConfig")
    private XForwardedForConfig xForwardedForConfig;

    private UpdateListenerRequest(Builder builder) {
        super(builder);
        this.backendPorts = builder.backendPorts;
        this.certificates = builder.certificates;
        this.clientAffinity = builder.clientAffinity;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.httpVersion = builder.httpVersion;
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
    public java.util.List<BackendPorts> getBackendPorts() {
        return this.backendPorts;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private java.util.List<BackendPorts> backendPorts; 
        private java.util.List<Certificates> certificates; 
        private String clientAffinity; 
        private String clientToken; 
        private String description; 
        private String httpVersion; 
        private Integer idleTimeout; 
        private String listenerId; 
        private String name; 
        private java.util.List<PortRanges> portRanges; 
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
            this.httpVersion = request.httpVersion;
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
         * <p>The range of ports that are used by backend servers to receive requests.</p>
         */
        public Builder backendPorts(java.util.List<BackendPorts> backendPorts) {
            this.putQueryParameter("BackendPorts", backendPorts);
            this.backendPorts = backendPorts;
            return this;
        }

        /**
         * <p>The SSL certificate.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>Indicates whether client affinity is enabled for the listener. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: Client affinity is disabled. Requests from the same client may be forwarded to different endpoints.</li>
         * <li><strong>SOURCE_IP</strong>: Client affinity is enabled. When a client accesses stateful applications, requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.</li>
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
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
         * <p>The maximum version of the HTTP protocol. Valid values:</p>
         * <ul>
         * <li><strong>http3</strong></li>
         * <li><strong>http2</strong></li>
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
         * <p>The timeout period for idle connections. Unit: seconds.</p>
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
         * <p>The ID of the listener.</p>
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
         * <p>The listener ports that are used to receive requests and forward the requests to endpoints.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>.</p>
         * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
         */
        public Builder portRanges(java.util.List<PortRanges> portRanges) {
            this.putQueryParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * <p>The network transmission protocol that is used by the listener. Valid values:</p>
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
         * <p>Specifies whether to preserve source IP addresses of clients.</p>
         * <ul>
         * <li><strong>true</strong> This feature allows you to view client IP addresses on backend servers.</li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> This parameter will be discontinued in the API operations that are used to configure listeners. We recommend that you set this parameter when you call API operations to configure endpoint groups. For more information about the <strong>ProxyProtocol</strong> parameter, see <a href="https://help.aliyun.com/document_detail/153259.html">CreateEndpointGroup</a> and <a href="https://help.aliyun.com/document_detail/153262.html">UpdateEndpointGroup</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder proxyProtocol(String proxyProtocol) {
            this.putQueryParameter("ProxyProtocol", proxyProtocol);
            this.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
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
         * <p>The timeout period for HTTP or HTTPS requests.</p>
         * <p>Valid values: 1 to 180. Default value: 60. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter takes effect only for HTTP or HTTPS listeners. If the backend server does not respond within the timeout period, GA returns an HTTP 504 error code to the client.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
         * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_1</strong></p>
         * <ul>
         * <li>Supported TLS versions: TLS 1.1 and TLS 1.2</li>
         * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2</strong></p>
         * <ul>
         * <li>Supported TLS version: TLS 1.2</li>
         * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</li>
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
         * <p>The <code>XForward</code> headers.</p>
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

    /**
     * 
     * {@link UpdateListenerRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerRequest</p>
     */
    public static class BackendPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
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

            private Builder() {
            } 

            private Builder(BackendPorts model) {
                this.fromPort = model.fromPort;
                this.toPort = model.toPort;
            } 

            /**
             * <p>The first port in the range of ports that are used by backend servers to receive requests.</p>
             * <blockquote>
             * <p>This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.</p>
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
             * <p>The last port in the range of ports that are used by backend servers to receive requests.</p>
             * <blockquote>
             * <p>This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link UpdateListenerRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerRequest</p>
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
             * <p>This parameter is required only when you configure an HTTPS listener.</p>
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
     * {@link UpdateListenerRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerRequest</p>
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
             * <p>The first port of the listener port range that is used to receive and forward requests to endpoints.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
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
             * <p>The last port of the listener port range that is used to receive and forward requests to endpoints.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
             * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
             * <blockquote>
             * <p>You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
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
     * {@link UpdateListenerRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerRequest</p>
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
             * <p>Specifies whether to use the <code>GA-AP</code> header to retrieve information about acceleration regions. Valid values:</p>
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
