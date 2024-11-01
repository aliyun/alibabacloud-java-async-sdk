// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerAttributeRequest</p>
 */
public class UpdateListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaCertificates")
    private java.util.List < CaCertificates> caCertificates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaEnabled")
    private Boolean caEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultActions")
    private java.util.List < DefaultActions> defaultActions;

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
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

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
    @com.aliyun.core.annotation.NameInMap("XForwardedForConfig")
    private XForwardedForConfig xForwardedForConfig;

    private UpdateListenerAttributeRequest(Builder builder) {
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
        this.listenerId = builder.listenerId;
        this.quicConfig = builder.quicConfig;
        this.requestTimeout = builder.requestTimeout;
        this.securityPolicyId = builder.securityPolicyId;
        this.xForwardedForConfig = builder.xForwardedForConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListenerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertificates
     */
    public java.util.List < CaCertificates> getCaCertificates() {
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
    public java.util.List < Certificates> getCertificates() {
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
    public java.util.List < DefaultActions> getDefaultActions() {
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
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
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
     * @return xForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.xForwardedForConfig;
    }

    public static final class Builder extends Request.Builder<UpdateListenerAttributeRequest, Builder> {
        private java.util.List < CaCertificates> caCertificates; 
        private Boolean caEnabled; 
        private java.util.List < Certificates> certificates; 
        private String clientToken; 
        private java.util.List < DefaultActions> defaultActions; 
        private Boolean dryRun; 
        private Boolean gzipEnabled; 
        private Boolean http2Enabled; 
        private Integer idleTimeout; 
        private String listenerDescription; 
        private String listenerId; 
        private QuicConfig quicConfig; 
        private Integer requestTimeout; 
        private String securityPolicyId; 
        private XForwardedForConfig xForwardedForConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateListenerAttributeRequest request) {
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
            this.listenerId = request.listenerId;
            this.quicConfig = request.quicConfig;
            this.requestTimeout = request.requestTimeout;
            this.securityPolicyId = request.securityPolicyId;
            this.xForwardedForConfig = request.xForwardedForConfig;
        } 

        /**
         * <p>The CA certificate. You can specify only one CA certificate.</p>
         */
        public Builder caCertificates(java.util.List < CaCertificates> caCertificates) {
            this.putQueryParameter("CaCertificates", caCertificates);
            this.caCertificates = caCertificates;
            return this;
        }

        /**
         * <p>Specifies whether to enable mutual authentication. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The certificates. You can add at most 20 certificates.</p>
         * <blockquote>
         * <p> Only server certificates are supported.</p>
         * </blockquote>
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The actions of the default forwarding rule.</p>
         */
        public Builder defaultActions(java.util.List < DefaultActions> defaultActions) {
            this.putQueryParameter("DefaultActions", defaultActions);
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <code>2xx HTTP</code> status code is returned and the operation is performed.</li>
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
         * <p>Specifies whether to enable GZIP compression for specific types of files. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Specifies whether to enable HTTP/2. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS listener.</p>
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
         * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1 to 60</strong>.</p>
         * <p>If no request is received within the specified timeout period, ALB closes the current connection. When another request is received, ALB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The name of the listener.</p>
         * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
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
         * <p>The ID of the Application Load Balancer (ALB) instance.</p>
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
         * <p>The configuration information when the listener is associated with a QUIC listener.</p>
         */
        public Builder quicConfig(QuicConfig quicConfig) {
            this.putQueryParameter("QuicConfig", quicConfig);
            this.quicConfig = quicConfig;
            return this;
        }

        /**
         * <p>The timeout period of a request. Unit: seconds. Valid values: <strong>1 to 180</strong>.</p>
         * <p>If no response is received from the backend server within the specified timeout period, ALB returns an <code>HTTP 504</code> error code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.putQueryParameter("RequestTimeout", requestTimeout);
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The security policy ID. System security policies and custom security policies are supported.</p>
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
         * <p>The configurations of the X-Forwarded-For header.</p>
         */
        public Builder xForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
            this.putQueryParameter("XForwardedForConfig", xForwardedForConfig);
            this.xForwardedForConfig = xForwardedForConfig;
            return this;
        }

        @Override
        public UpdateListenerAttributeRequest build() {
            return new UpdateListenerAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
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
             * <p>123359******</p>
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
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
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
             * <p>The certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12315790212_166f8204689_1714763408_70998****</p>
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
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
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
             * <p>rsp-cige6j5e7p****</p>
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
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
     */
    public static class ForwardGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < ServerGroupTuples> serverGroupTuples;

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
        public java.util.List < ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List < ServerGroupTuples> serverGroupTuples; 

            /**
             * <p>The server groups to which requests are forwarded.</p>
             * <p>This parameter is required.</p>
             */
            public Builder serverGroupTuples(java.util.List < ServerGroupTuples> serverGroupTuples) {
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
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
     */
    public static class DefaultActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardGroupConfig")
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
             * <p>The forwarding action. This parameter takes effect only when you set <strong>Type</strong> to <strong>ForwardGroup</strong>. You can specify at most 20 actions.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The action type. You can specify only one type.</p>
             * <p>Set the value to <strong>ForwardGroup</strong>, which specifies that requests are forwarded to multiple server groups.</p>
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
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
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
             * <p>The QUIC listener ID. This parameter is required if <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>. Only HTTPS listeners support this parameter.</p>
             * <blockquote>
             * <p>You must add the HTTPS listener and the QUIC listener to the same ALB instance. In addition, make sure that the QUIC listener has never been associated with another listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>lsn-333</p>
             */
            public Builder quicListenerId(String quicListenerId) {
                this.quicListenerId = quicListenerId;
                return this;
            }

            /**
             * <p>Specifies whether to enable QUIC upgrade. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>Only HTTPS listeners support this parameter.</p>
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
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
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
            private Boolean xForwardedForProtoEnabled; 
            private Boolean xForwardedForSLBIdEnabled; 
            private Boolean xForwardedForSLBPortEnabled; 

            /**
             * <p>The name of the custom header. The header takes effect only when you set <strong>XForwardedForClientCertClientVerifyEnabled</strong> to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length. The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
                this.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. The header takes effect only when you set <strong>XForwardedForClientCertFingerprintEnabled</strong> to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length. The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForClientCertFingerprintEnabled(Boolean xForwardedForClientCertFingerprintEnabled) {
                this.xForwardedForClientCertFingerprintEnabled = xForwardedForClientCertFingerprintEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. The header takes effect only when you set <strong>XForwardedForClientCertIssuerDNEnabled</strong> to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length. The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForClientCertIssuerDNEnabled(Boolean xForwardedForClientCertIssuerDNEnabled) {
                this.xForwardedForClientCertIssuerDNEnabled = xForwardedForClientCertIssuerDNEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter is valid only if the <strong>XForwardedForClientCertSubjectDNEnabled</strong> parameter is set to true.****</p>
             * <p>The name must be 1 to 40 characters in length, The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForClientCertSubjectDNEnabled(Boolean xForwardedForClientCertSubjectDNEnabled) {
                this.xForwardedForClientCertSubjectDNEnabled = xForwardedForClientCertSubjectDNEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the X-Forwarded-For header to preserve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>ALB instances traverse the IP addresses in the <code>X-Forwarded-For</code> header from the rightmost IP address to the leftmost IP address. The first IP address that is not on the trusted IP address list is considered the client IP address. Requests from the client IP address are throttled.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.0/24</p>
             */
            public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
                this.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>XForwardedFor_ClientSrcPort</code> header to retrieve the client port. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> HTTP and HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForClientSrcPortEnabled(Boolean xForwardedForClientSrcPortEnabled) {
                this.xForwardedForClientSrcPortEnabled = xForwardedForClientSrcPortEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to retrieve the listener protocol. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
