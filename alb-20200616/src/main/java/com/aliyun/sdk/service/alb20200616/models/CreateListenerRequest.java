// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @com.aliyun.core.annotation.NameInMap("CaCertificates")
    private java.util.List<CaCertificates> caCertificates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaEnabled")
    private Boolean caEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List<Certificates> certificates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultActions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DefaultActions> defaultActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GzipEnabled")
    private Boolean gzipEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Http2Enabled")
    private Boolean http2Enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerDescription")
    private String listenerDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuicConfig")
    private QuicConfig quicConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedForConfig")
    private XForwardedForConfig xForwardedForConfig;

    private CreateListenerRequest(Builder builder) {
        super(builder);
        this.caCertificates = builder.caCertificates;
        this.caEnabled = builder.caEnabled;
        this.certificates = builder.certificates;
        this.clientToken = builder.clientToken;
        this.defaultActions = builder.defaultActions;
        this.dryRun = builder.dryRun;
        this.gzipEnabled = builder.gzipEnabled;
        this.http2Enabled = builder.http2Enabled;
        this.idleTimeout = builder.idleTimeout;
        this.listenerDescription = builder.listenerDescription;
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalancerId = builder.loadBalancerId;
        this.quicConfig = builder.quicConfig;
        this.requestTimeout = builder.requestTimeout;
        this.securityPolicyId = builder.securityPolicyId;
        this.tag = builder.tag;
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
     * @return caCertificates
     */
    public java.util.List<CaCertificates> getCaCertificates() {
        return this.caCertificates;
    }

    /**
     * @return caEnabled
     */
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    /**
     * @return certificates
     */
    public java.util.List<Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return defaultActions
     */
    public java.util.List<DefaultActions> getDefaultActions() {
        return this.defaultActions;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return gzipEnabled
     */
    public Boolean getGzipEnabled() {
        return this.gzipEnabled;
    }

    /**
     * @return http2Enabled
     */
    public Boolean getHttp2Enabled() {
        return this.http2Enabled;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return listenerDescription
     */
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return quicConfig
     */
    public QuicConfig getQuicConfig() {
        return this.quicConfig;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return xForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.xForwardedForConfig;
    }

    public static final class Builder extends Request.Builder<CreateListenerRequest, Builder> {
        private java.util.List<CaCertificates> caCertificates; 
        private Boolean caEnabled; 
        private java.util.List<Certificates> certificates; 
        private String clientToken; 
        private java.util.List<DefaultActions> defaultActions; 
        private Boolean dryRun; 
        private Boolean gzipEnabled; 
        private Boolean http2Enabled; 
        private Integer idleTimeout; 
        private String listenerDescription; 
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String loadBalancerId; 
        private QuicConfig quicConfig; 
        private Integer requestTimeout; 
        private String securityPolicyId; 
        private java.util.List<Tag> tag; 
        private XForwardedForConfig xForwardedForConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateListenerRequest request) {
            super(request);
            this.caCertificates = request.caCertificates;
            this.caEnabled = request.caEnabled;
            this.certificates = request.certificates;
            this.clientToken = request.clientToken;
            this.defaultActions = request.defaultActions;
            this.dryRun = request.dryRun;
            this.gzipEnabled = request.gzipEnabled;
            this.http2Enabled = request.http2Enabled;
            this.idleTimeout = request.idleTimeout;
            this.listenerDescription = request.listenerDescription;
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalancerId = request.loadBalancerId;
            this.quicConfig = request.quicConfig;
            this.requestTimeout = request.requestTimeout;
            this.securityPolicyId = request.securityPolicyId;
            this.tag = request.tag;
            this.xForwardedForConfig = request.xForwardedForConfig;
        } 

        /**
         * <p>The certificate authority (CA) certificates. You can specify only one CA certificate.</p>
         */
        public Builder caCertificates(java.util.List<CaCertificates> caCertificates) {
            this.putQueryParameter("CaCertificates", caCertificates);
            this.caCertificates = caCertificates;
            return this;
        }

        /**
         * <p>Specifies whether to enable mutual authentication. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables mutual authentication.</li>
         * <li><strong>false</strong> (default): disables mutual authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.putQueryParameter("CaEnabled", caEnabled);
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * <p>The details about each certificate.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>The actions of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder defaultActions(java.util.List<DefaultActions> defaultActions) {
            this.putQueryParameter("DefaultActions", defaultActions);
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a precheck. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request without creating a listener. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error code is returned based on the cause of the failure. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the system proceeds to create a listener.</li>
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
         * <p>Specifies whether to enable <code>Gzip</code> compression to compress specific types of files. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables Gzip compression.</li>
         * <li><strong>false</strong>: disables Gzip compression.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder gzipEnabled(Boolean gzipEnabled) {
            this.putQueryParameter("GzipEnabled", gzipEnabled);
            this.gzipEnabled = gzipEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable <code>HTTP/2</code>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables HTTP/2.</li>
         * <li><strong>false</strong>: disables HTTP/2.</li>
         * </ul>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            this.putQueryParameter("Http2Enabled", http2Enabled);
            this.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * <p>The timeout period of an idle connection. Unit: seconds.</p>
         * <p>Valid values: <strong>1 to 60</strong>.</p>
         * <p>Default value: <strong>15</strong>.</p>
         * <p>If no requests are received within the specified timeout period, ALB closes the current connection. When a new request is received, ALB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The name of the listener.</p>
         * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_). Regular expressions are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_80</p>
         */
        public Builder listenerDescription(String listenerDescription) {
            this.putQueryParameter("ListenerDescription", listenerDescription);
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * <p>The frontend port that is used by the ALB instance.</p>
         * <p>Valid values: <strong>1 to 65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The listener protocol.</p>
         * <p>Valid values: <strong>HTTP</strong>, <strong>HTTPS</strong>, and <strong>QUIC</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The ID of the ALB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-n5qw04uq8vavfe****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>Select a QUIC listener and associate it with the ALB instance.</p>
         */
        public Builder quicConfig(QuicConfig quicConfig) {
            this.putQueryParameter("QuicConfig", quicConfig);
            this.quicConfig = quicConfig;
            return this;
        }

        /**
         * <p>The timeout period of a request. Unit: seconds.</p>
         * <p>Valid values: <strong>1 to 180</strong>.</p>
         * <p>Default value: <strong>60</strong>.</p>
         * <p>If no response is received from the backend server during the request timeout period, ALB sends an <code>HTTP 504</code> error code to the client.</p>
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
         * <p>The ID of the security policy. System security policies and custom security policies are supported.</p>
         * <p>Default value: <strong>tls_cipher_policy_1_0</strong> (system security policy).</p>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The configuration of the XForward header.</p>
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
    public static class CaCertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        private CaCertificates(Builder builder) {
            this.certificateId = builder.certificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaCertificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        public static final class Builder {
            private String certificateId; 

            /**
             * <p>The ID of the CA certificate.</p>
             * <blockquote>
             * <p> This parameter is required if <strong>CaEnabled</strong> is set to <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>123157*******</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            public CaCertificates build() {
                return new CaCertificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        public static final class Builder {
            private String certificateId; 

            /**
             * <p>The ID of the certificate. Only server certificates are supported. You can specify up to 20 certificate IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>103705*******</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
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
    public static class ServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverGroupId;

        private ServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupTuples create() {
            return builder().build();
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public static final class Builder {
            private String serverGroupId; 

            /**
             * <p>The ID of the server group to which requests are forwarded.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-8ilqs4axp6******</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            public ServerGroupTuples build() {
                return new ServerGroupTuples(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class ForwardGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ServerGroupTuples> serverGroupTuples;

        private ForwardGroupConfig(Builder builder) {
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List<ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List<ServerGroupTuples> serverGroupTuples; 

            /**
             * <p>The destination server group to which requests are forwarded.</p>
             * <p>This parameter is required.</p>
             */
            public Builder serverGroupTuples(java.util.List<ServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public ForwardGroupConfig build() {
                return new ForwardGroupConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class DefaultActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardGroupConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private ForwardGroupConfig forwardGroupConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private DefaultActions(Builder builder) {
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultActions create() {
            return builder().build();
        }

        /**
         * @return forwardGroupConfig
         */
        public ForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ForwardGroupConfig forwardGroupConfig; 
            private String type; 

            /**
             * <p>The configuration of the forwarding action. You can specify at most 20 actions.</p>
             * <p>This parameter is required.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The action type. You can specify only one action type. Valid value:</p>
             * <p><strong>ForwardGroup</strong>: forwards requests to multiple Server groups.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ForwardGroup</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DefaultActions build() {
                return new DefaultActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class QuicConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuicListenerId")
        private String quicListenerId;

        @com.aliyun.core.annotation.NameInMap("QuicUpgradeEnabled")
        private Boolean quicUpgradeEnabled;

        private QuicConfig(Builder builder) {
            this.quicListenerId = builder.quicListenerId;
            this.quicUpgradeEnabled = builder.quicUpgradeEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuicConfig create() {
            return builder().build();
        }

        /**
         * @return quicListenerId
         */
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        /**
         * @return quicUpgradeEnabled
         */
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

        public static final class Builder {
            private String quicListenerId; 
            private Boolean quicUpgradeEnabled; 

            /**
             * <p>The ID of the QUIC listener that you want to associate with the HTTPS listener. Only HTTPS listeners support this parameter. This parameter is required when <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>.</p>
             * <blockquote>
             * <p> The HTTPS listener and the QUIC listener must be added to the same ALB instance. Make sure that the QUIC listener is not associated with any other listeners.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>lsn-o4u54y73wq7b******</p>
             */
            public Builder quicListenerId(String quicListenerId) {
                this.quicListenerId = quicListenerId;
                return this;
            }

            /**
             * <p>Specifies whether to enable QUIC upgrade. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables QUIC upgrade.</li>
             * <li><strong>false</strong> (default): disables QUIC upgrade.</li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder quicUpgradeEnabled(Boolean quicUpgradeEnabled) {
                this.quicUpgradeEnabled = quicUpgradeEnabled;
                return this;
            }

            public QuicConfig build() {
                return new QuicConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
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
        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertClientVerifyAlias")
        private String xForwardedForClientCertClientVerifyAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertClientVerifyEnabled")
        private Boolean xForwardedForClientCertClientVerifyEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertFingerprintAlias")
        private String xForwardedForClientCertFingerprintAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertFingerprintEnabled")
        private Boolean xForwardedForClientCertFingerprintEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertIssuerDNAlias")
        private String xForwardedForClientCertIssuerDNAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertIssuerDNEnabled")
        private Boolean xForwardedForClientCertIssuerDNEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertSubjectDNAlias")
        private String xForwardedForClientCertSubjectDNAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertSubjectDNEnabled")
        private Boolean xForwardedForClientCertSubjectDNEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientSourceIpsEnabled")
        private Boolean xForwardedForClientSourceIpsEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientSourceIpsTrusted")
        private String xForwardedForClientSourceIpsTrusted;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientSrcPortEnabled")
        private Boolean xForwardedForClientSrcPortEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForEnabled")
        private Boolean xForwardedForEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForHostEnabled")
        private Boolean xForwardedForHostEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForProcessingMode")
        private String xForwardedForProcessingMode;

        @com.aliyun.core.annotation.NameInMap("XForwardedForProtoEnabled")
        private Boolean xForwardedForProtoEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForSLBIdEnabled")
        private Boolean xForwardedForSLBIdEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForSLBPortEnabled")
        private Boolean xForwardedForSLBPortEnabled;

        private XForwardedForConfig(Builder builder) {
            this.xForwardedForClientCertClientVerifyAlias = builder.xForwardedForClientCertClientVerifyAlias;
            this.xForwardedForClientCertClientVerifyEnabled = builder.xForwardedForClientCertClientVerifyEnabled;
            this.xForwardedForClientCertFingerprintAlias = builder.xForwardedForClientCertFingerprintAlias;
            this.xForwardedForClientCertFingerprintEnabled = builder.xForwardedForClientCertFingerprintEnabled;
            this.xForwardedForClientCertIssuerDNAlias = builder.xForwardedForClientCertIssuerDNAlias;
            this.xForwardedForClientCertIssuerDNEnabled = builder.xForwardedForClientCertIssuerDNEnabled;
            this.xForwardedForClientCertSubjectDNAlias = builder.xForwardedForClientCertSubjectDNAlias;
            this.xForwardedForClientCertSubjectDNEnabled = builder.xForwardedForClientCertSubjectDNEnabled;
            this.xForwardedForClientSourceIpsEnabled = builder.xForwardedForClientSourceIpsEnabled;
            this.xForwardedForClientSourceIpsTrusted = builder.xForwardedForClientSourceIpsTrusted;
            this.xForwardedForClientSrcPortEnabled = builder.xForwardedForClientSrcPortEnabled;
            this.xForwardedForEnabled = builder.xForwardedForEnabled;
            this.xForwardedForHostEnabled = builder.xForwardedForHostEnabled;
            this.xForwardedForProcessingMode = builder.xForwardedForProcessingMode;
            this.xForwardedForProtoEnabled = builder.xForwardedForProtoEnabled;
            this.xForwardedForSLBIdEnabled = builder.xForwardedForSLBIdEnabled;
            this.xForwardedForSLBPortEnabled = builder.xForwardedForSLBPortEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XForwardedForConfig create() {
            return builder().build();
        }

        /**
         * @return xForwardedForClientCertClientVerifyAlias
         */
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.xForwardedForClientCertClientVerifyAlias;
        }

        /**
         * @return xForwardedForClientCertClientVerifyEnabled
         */
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.xForwardedForClientCertClientVerifyEnabled;
        }

        /**
         * @return xForwardedForClientCertFingerprintAlias
         */
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.xForwardedForClientCertFingerprintAlias;
        }

        /**
         * @return xForwardedForClientCertFingerprintEnabled
         */
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.xForwardedForClientCertFingerprintEnabled;
        }

        /**
         * @return xForwardedForClientCertIssuerDNAlias
         */
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.xForwardedForClientCertIssuerDNAlias;
        }

        /**
         * @return xForwardedForClientCertIssuerDNEnabled
         */
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.xForwardedForClientCertIssuerDNEnabled;
        }

        /**
         * @return xForwardedForClientCertSubjectDNAlias
         */
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.xForwardedForClientCertSubjectDNAlias;
        }

        /**
         * @return xForwardedForClientCertSubjectDNEnabled
         */
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.xForwardedForClientCertSubjectDNEnabled;
        }

        /**
         * @return xForwardedForClientSourceIpsEnabled
         */
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.xForwardedForClientSourceIpsEnabled;
        }

        /**
         * @return xForwardedForClientSourceIpsTrusted
         */
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.xForwardedForClientSourceIpsTrusted;
        }

        /**
         * @return xForwardedForClientSrcPortEnabled
         */
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.xForwardedForClientSrcPortEnabled;
        }

        /**
         * @return xForwardedForEnabled
         */
        public Boolean getXForwardedForEnabled() {
            return this.xForwardedForEnabled;
        }

        /**
         * @return xForwardedForHostEnabled
         */
        public Boolean getXForwardedForHostEnabled() {
            return this.xForwardedForHostEnabled;
        }

        /**
         * @return xForwardedForProcessingMode
         */
        public String getXForwardedForProcessingMode() {
            return this.xForwardedForProcessingMode;
        }

        /**
         * @return xForwardedForProtoEnabled
         */
        public Boolean getXForwardedForProtoEnabled() {
            return this.xForwardedForProtoEnabled;
        }

        /**
         * @return xForwardedForSLBIdEnabled
         */
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.xForwardedForSLBIdEnabled;
        }

        /**
         * @return xForwardedForSLBPortEnabled
         */
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.xForwardedForSLBPortEnabled;
        }

        public static final class Builder {
            private String xForwardedForClientCertClientVerifyAlias; 
            private Boolean xForwardedForClientCertClientVerifyEnabled; 
            private String xForwardedForClientCertFingerprintAlias; 
            private Boolean xForwardedForClientCertFingerprintEnabled; 
            private String xForwardedForClientCertIssuerDNAlias; 
            private Boolean xForwardedForClientCertIssuerDNEnabled; 
            private String xForwardedForClientCertSubjectDNAlias; 
            private Boolean xForwardedForClientCertSubjectDNEnabled; 
            private Boolean xForwardedForClientSourceIpsEnabled; 
            private String xForwardedForClientSourceIpsTrusted; 
            private Boolean xForwardedForClientSrcPortEnabled; 
            private Boolean xForwardedForEnabled; 
            private Boolean xForwardedForHostEnabled; 
            private String xForwardedForProcessingMode; 
            private Boolean xForwardedForProtoEnabled; 
            private Boolean xForwardedForSLBIdEnabled; 
            private Boolean xForwardedForSLBPortEnabled; 

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertClientVerifyEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_client-verify-alias_123456</p>
             */
            public Builder xForwardedForClientCertClientVerifyAlias(String xForwardedForClientCertClientVerifyAlias) {
                this.xForwardedForClientCertClientVerifyAlias = xForwardedForClientCertClientVerifyAlias;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-clientverify</code> header to retrieve the verification result of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the X-Forwarded-Clientcert-clientverify header.</li>
             * <li><strong>false</strong> (default): does not use the X-Forwarded-Clientcert-clientverify header.</li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
                this.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertFingerprintEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_finger-print-alias_123456</p>
             */
            public Builder xForwardedForClientCertFingerprintAlias(String xForwardedForClientCertFingerprintAlias) {
                this.xForwardedForClientCertFingerprintAlias = xForwardedForClientCertFingerprintAlias;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-fingerprint</code> header to retrieve the fingerprint of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the X-Forwarded-Clientcert-fingerprint header.</li>
             * <li><strong>false</strong> (default): does not use the X-Forwarded-Clientcert-fingerprint header.</li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertFingerprintEnabled(Boolean xForwardedForClientCertFingerprintEnabled) {
                this.xForwardedForClientCertFingerprintEnabled = xForwardedForClientCertFingerprintEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertIssuerDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_issue-dn-alias_123456</p>
             */
            public Builder xForwardedForClientCertIssuerDNAlias(String xForwardedForClientCertIssuerDNAlias) {
                this.xForwardedForClientCertIssuerDNAlias = xForwardedForClientCertIssuerDNAlias;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-issuerdn</code> header to retrieve information about the authority that issues the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the X-Forwarded-Clientcert-issuerdn header.</li>
             * <li><strong>false</strong> (default): does not use the X-Forwarded-Clientcert-issuerdn header.</li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertIssuerDNEnabled(Boolean xForwardedForClientCertIssuerDNEnabled) {
                this.xForwardedForClientCertIssuerDNEnabled = xForwardedForClientCertIssuerDNEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertSubjectDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_subject-dn-alias_123456</p>
             */
            public Builder xForwardedForClientCertSubjectDNAlias(String xForwardedForClientCertSubjectDNAlias) {
                this.xForwardedForClientCertSubjectDNAlias = xForwardedForClientCertSubjectDNAlias;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-subjectdn</code> header to retrieve information about the owner of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the X-Forwarded-Clientcert-subjectdn header.</li>
             * <li><strong>false</strong> (default): does not use the X-Forwarded-Clientcert-subjectdn header.</li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertSubjectDNEnabled(Boolean xForwardedForClientCertSubjectDNEnabled) {
                this.xForwardedForClientCertSubjectDNEnabled = xForwardedForClientCertSubjectDNEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to allow the ALB instance to retrieve client IP addresses from the <code>X-Forwarded-For</code> header. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p> HTTP and HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForClientSourceIpsEnabled(Boolean xForwardedForClientSourceIpsEnabled) {
                this.xForwardedForClientSourceIpsEnabled = xForwardedForClientSourceIpsEnabled;
                return this;
            }

            /**
             * <p>The trusted proxy IP address.</p>
             * <p>ALB traverses <code>X-Forwarded-For</code> backwards and selects the first IP address that is not in the trusted IP list as the originating IP address of the client, which will be throttled if source IP address throttling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.0/24</p>
             */
            public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
                this.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Client-srcport</code> header to retrieve the client port. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the X-Forwarded-Client-srcport header.</li>
             * <li><strong>false</strong> (default): does not use the X-Forwarded-Client-srcport header.</li>
             * </ul>
             * <blockquote>
             * <p> HTTP and HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientSrcPortEnabled(Boolean xForwardedForClientSrcPortEnabled) {
                this.xForwardedForClientSrcPortEnabled = xForwardedForClientSrcPortEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> HTTP and HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForEnabled(Boolean xForwardedForEnabled) {
                this.xForwardedForEnabled = xForwardedForEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Host</code> header to retrieve the client domain name. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is available for HTTP, HTTPS, and QUIC listeners.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForHostEnabled(Boolean xForwardedForHostEnabled) {
                this.xForwardedForHostEnabled = xForwardedForHostEnabled;
                return this;
            }

            /**
             * <p>Specifies how the <code>X-Forwarded-For</code> header is processed. This parameter takes effect only when <strong>XForwardedForEnabled</strong> is set to <strong>true</strong>. Valid values:</p>
             * <ul>
             * <li><strong>append</strong> (default)</li>
             * <li><strong>remove</strong></li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If this parameter is set to <strong>append</strong>, ALB appends the IP address of the last hop to the existing <code>X-Forwarded-For</code> header in the request before the request is sent to backend servers.</li>
             * <li>If this parameter is set to <strong>remove</strong>, ALB removes the <code>X-Forwarded-For</code> header in the request before the request is sent to backend servers, no matter whether the request carries the <code>X-Forwarded-For</code> header.</li>
             * <li>This parameter is only available for HTTP and HTTPS listeners.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>append</p>
             */
            public Builder xForwardedForProcessingMode(String xForwardedForProcessingMode) {
                this.xForwardedForProcessingMode = xForwardedForProcessingMode;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to retrieve the listener protocol of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the X-Forwarded-Proto header.</li>
             * <li><strong>false</strong> (default): does not use the X-Forwarded-Proto header.</li>
             * </ul>
             * <blockquote>
             * <p> HTTP, HTTPS, and QUIC listeners support this parameter.</p>
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
             * <p>Specifies whether to use the <code>SLB-ID</code> header to retrieve the ID of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the SLB-ID header.</li>
             * <li><strong>false</strong> (default): does not use the SLB-ID header.</li>
             * </ul>
             * <blockquote>
             * <p> HTTP, HTTPS, and QUIC listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForSLBIdEnabled(Boolean xForwardedForSLBIdEnabled) {
                this.xForwardedForSLBIdEnabled = xForwardedForSLBIdEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header to retrieve the listener port of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: uses the X-Forwarded-Port header.</li>
             * <li><strong>false</strong> (default): does not use the X-Forwarded-Port header.</li>
             * </ul>
             * <blockquote>
             * <p> HTTP, HTTPS, and QUIC listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForSLBPortEnabled(Boolean xForwardedForSLBPortEnabled) {
                this.xForwardedForSLBPortEnabled = xForwardedForSLBPortEnabled;
                return this;
            }

            public XForwardedForConfig build() {
                return new XForwardedForConfig(this);
            } 

        } 

    }
}
