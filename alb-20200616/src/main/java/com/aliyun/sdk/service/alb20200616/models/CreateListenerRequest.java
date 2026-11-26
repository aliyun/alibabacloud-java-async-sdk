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
         * <p>The list of CA certificates configured for the listener. You can add only one CA certificate.</p>
         */
        public Builder caCertificates(java.util.List<CaCertificates> caCertificates) {
            this.putQueryParameter("CaCertificates", caCertificates);
            this.caCertificates = caCertificates;
            return this;
        }

        /**
         * <p>Specifies whether to enable mutual authentication. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong> (default): no.</li>
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
         * <p>The certificate list.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the parameter value from your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
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
         * <p>The list of rule actions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder defaultActions(java.util.List<DefaultActions> defaultActions) {
            this.putQueryParameter("DefaultActions", defaultActions);
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run and does not create the listener. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the <code>DryRunOperation</code> error code.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the system returns an HTTP 2xx status code and creates the listener.</p>
         * </li>
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
         * <p>Specifies whether to enable <code>Gzip</code> compression to compress specific file types. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): yes.</li>
         * <li><strong>false</strong>: no.</li>
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
         * <li><strong>true</strong> (default): yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only by HTTPS listeners.</p>
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
         * <p>The idle connection timeout period. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>600</strong>.</p>
         * <p>Default value: <strong>15</strong>.</p>
         * <p>If there is no access request within the timeout period, load balancing temporarily breaks the current connection and establishes a new connection when the next request arrives.</p>
         * <blockquote>
         * <p>You can apply to increase the quota to extend the maximum idle connection timeout period to 3,600 seconds.</p>
         * </blockquote>
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
         * <p>The custom name of the listener.</p>
         * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, Chinese characters, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
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
         * <p>The frontend port used by the load balancing instance.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
         * <p>The instance ID of the application load balancing instance.</p>
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
         * <p>The configuration of the associated QUIC listener.</p>
         */
        public Builder quicConfig(QuicConfig quicConfig) {
            this.putQueryParameter("QuicConfig", quicConfig);
            this.quicConfig = quicConfig;
            return this;
        }

        /**
         * <p>The request timeout period. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>600</strong>.</p>
         * <p>Default value: <strong>60</strong>.</p>
         * <p>If there is no response from the backend server within the timeout period, load balancing stops waiting and returns an <code>HTTP 504</code> error code to the client.</p>
         * <blockquote>
         * <p>You can apply to increase the quota to extend the maximum request timeout period to 3,600 seconds.</p>
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
         * <p>The ID of the security policy. System security policies and custom security policies are supported.</p>
         * <p>Default value: <strong>tls_cipher_policy_1_0</strong> (system security policy).</p>
         * <blockquote>
         * <p>This parameter is supported only by HTTPS listeners.</p>
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
         * <p>The X-Forwarded-For configuration.</p>
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

            private Builder() {
            } 

            private Builder(CaCertificates model) {
                this.certificateId = model.certificateId;
            } 

            /**
             * <p>The ID of the CA certificate.</p>
             * <blockquote>
             * <p>This parameter is required when the <strong>CaEnabled</strong> parameter is set to <strong>true</strong>.</p>
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

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.certificateId = model.certificateId;
            } 

            /**
             * <p>The ID of the default certificate. You can add only one default server certificate.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is required when the <strong>ListenerProtocol</strong> parameter is set to <strong>HTTPS</strong> or <strong>QUIC</strong>.</li>
             * <li>To add more server certificates, call the <a href="https://help.aliyun.com/document_detail/2254830.html">AssociateAdditionalCertificatesWithListener</a> operation to configure additional certificates after the listener is created.</li>
             * </ul>
             * </blockquote>
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

            private Builder() {
            } 

            private Builder(ServerGroupTuples model) {
                this.serverGroupId = model.serverGroupId;
            } 

            /**
             * <p>The ID of the destination server group to which requests are forwarded.</p>
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

            private Builder() {
            } 

            private Builder(ForwardGroupConfig model) {
                this.serverGroupTuples = model.serverGroupTuples;
            } 

            /**
             * <p>The destination server group tuples for forwarding.</p>
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

            private Builder() {
            } 

            private Builder(DefaultActions model) {
                this.forwardGroupConfig = model.forwardGroupConfig;
                this.type = model.type;
            } 

            /**
             * <p>The configuration for the forward action. You can add up to 20 forward action configurations.</p>
             * <p>This parameter is required.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The action type. You can add only one action type. Valid values: <strong>ForwardGroup</strong>: forwards requests to multiple server groups.</p>
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

            private Builder() {
            } 

            private Builder(QuicConfig model) {
                this.quicListenerId = model.quicListenerId;
                this.quicUpgradeEnabled = model.quicUpgradeEnabled;
            } 

            /**
             * <p>The ID of the QUIC listener to be associated. This parameter is valid for HTTPS listeners and is required when <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>.</p>
             * <blockquote>
             * <p>The original listener and the associated QUIC listener must belong to the same ALB instance, and the QUIC listener must not have been associated before.</p>
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
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
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

            private Builder() {
            } 

            private Builder(XForwardedForConfig model) {
                this.xForwardedForClientCertClientVerifyAlias = model.xForwardedForClientCertClientVerifyAlias;
                this.xForwardedForClientCertClientVerifyEnabled = model.xForwardedForClientCertClientVerifyEnabled;
                this.xForwardedForClientCertFingerprintAlias = model.xForwardedForClientCertFingerprintAlias;
                this.xForwardedForClientCertFingerprintEnabled = model.xForwardedForClientCertFingerprintEnabled;
                this.xForwardedForClientCertIssuerDNAlias = model.xForwardedForClientCertIssuerDNAlias;
                this.xForwardedForClientCertIssuerDNEnabled = model.xForwardedForClientCertIssuerDNEnabled;
                this.xForwardedForClientCertSubjectDNAlias = model.xForwardedForClientCertSubjectDNAlias;
                this.xForwardedForClientCertSubjectDNEnabled = model.xForwardedForClientCertSubjectDNEnabled;
                this.xForwardedForClientSourceIpsEnabled = model.xForwardedForClientSourceIpsEnabled;
                this.xForwardedForClientSourceIpsTrusted = model.xForwardedForClientSourceIpsTrusted;
                this.xForwardedForClientSrcPortEnabled = model.xForwardedForClientSrcPortEnabled;
                this.xForwardedForEnabled = model.xForwardedForEnabled;
                this.xForwardedForHostEnabled = model.xForwardedForHostEnabled;
                this.xForwardedForProcessingMode = model.xForwardedForProcessingMode;
                this.xForwardedForProtoEnabled = model.xForwardedForProtoEnabled;
                this.xForwardedForSLBIdEnabled = model.xForwardedForSLBIdEnabled;
                this.xForwardedForSLBPortEnabled = model.xForwardedForSLBPortEnabled;
            } 

            /**
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertClientVerifyEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-clientverify</code> header to obtain the verification result of the client certificate that is used to access the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertFingerprintEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-fingerprint</code> header to obtain the fingerprint of the client certificate that is used to access the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertIssuerDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-issuerdn</code> header to obtain the issuer information of the client certificate that is used to access the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertSubjectDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-subjectdn</code> header to obtain the subject information of the client certificate that is used to access the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported only by HTTPS listeners.</p>
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
             * <p>Specifies whether to allow ALB to obtain the real IP address of the client from the X-Forwarded-For header. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP and HTTPS listeners.</p>
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
             * <p>The trusted proxy IP addresses.</p>
             * <p>Application Load Balancing (ALB) traverses the <code>X-Forwarded-For</code> header from back to front and selects the first IP address that is not in the trusted IP address list as the real IP address of the client. This IP address is used for source IP address-based throttling.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.0/24</p>
             */
            public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
                this.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Client-srcport</code> header to obtain the port of the client that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP and HTTPS listeners.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to obtain the real IP address of the client. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default): yes.</li>
             * <li><strong>false</strong>: no.</li>
             * </ul>
             * <blockquote>
             * <ol>
             * <li>If you set this parameter to <strong>true</strong>, the default value of <strong>XForwardedForProcessingMode</strong> is <strong>append</strong>. You can change the value to <strong>remove</strong>.</li>
             * <li>If you set this parameter to <strong>false</strong>, ALB retains the <code>X-Forwarded-For</code> header before forwarding the request to the backend server and does not perform additional processing.</li>
             * <li>This parameter is supported by HTTP and HTTPS listeners.</li>
             * </ol>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Host</code> header to obtain the domain name of the client that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
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
             * <p>The processing mode of the <code>X-Forwarded-For</code> header. This parameter takes effect only when <strong>XForwardedForEnabled</strong> is set to <strong>true</strong>. Valid values:</p>
             * <ul>
             * <li><strong>append</strong> (default): appends the IP address.</li>
             * <li><strong>remove</strong>: removes the header.</li>
             * </ul>
             * <blockquote>
             * <ol>
             * <li>If you set this parameter to <strong>append</strong>, ALB adds the IP address of the last hop to the <code>X-Forwarded-For</code> header before forwarding the request to the backend server.</li>
             * <li>If you set this parameter to <strong>remove</strong>, ALB removes the <code>X-Forwarded-For</code> header before forwarding the request to the backend server, regardless of whether the request contains the <code>X-Forwarded-For</code> header.</li>
             * <li>This parameter is supported by HTTP and HTTPS listeners.</li>
             * </ol>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to obtain the listener protocol of the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
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
             * <p>Specifies whether to use the <code>SLB-ID</code> header to obtain the instance ID of the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header to obtain the listener port of the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
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
