// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @NameInMap("CaCertificates")
    private java.util.List < CaCertificates> caCertificates;

    @Query
    @NameInMap("CaEnabled")
    private Boolean caEnabled;

    @Query
    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DefaultActions")
    @Validation(required = true)
    private java.util.List < DefaultActions> defaultActions;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("GzipEnabled")
    private Boolean gzipEnabled;

    @Query
    @NameInMap("Http2Enabled")
    private Boolean http2Enabled;

    @Query
    @NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @Query
    @NameInMap("ListenerDescription")
    private String listenerDescription;

    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true)
    private Integer listenerPort;

    @Query
    @NameInMap("ListenerProtocol")
    @Validation(required = true)
    private String listenerProtocol;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("QuicConfig")
    private QuicConfig quicConfig;

    @Query
    @NameInMap("RequestTimeout")
    @Validation(maximum = 180, minimum = 1)
    private Integer requestTimeout;

    @Query
    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @Query
    @NameInMap("XForwardedForConfig")
    private XForwardedForConfig XForwardedForConfig;

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
        this.XForwardedForConfig = builder.XForwardedForConfig;
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
     * @return XForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static final class Builder extends Request.Builder<CreateListenerRequest, Builder> {
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
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String loadBalancerId; 
        private QuicConfig quicConfig; 
        private Integer requestTimeout; 
        private String securityPolicyId; 
        private XForwardedForConfig XForwardedForConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateListenerRequest response) {
            super(response);
            this.caCertificates = response.caCertificates;
            this.caEnabled = response.caEnabled;
            this.certificates = response.certificates;
            this.clientToken = response.clientToken;
            this.defaultActions = response.defaultActions;
            this.dryRun = response.dryRun;
            this.gzipEnabled = response.gzipEnabled;
            this.http2Enabled = response.http2Enabled;
            this.idleTimeout = response.idleTimeout;
            this.listenerDescription = response.listenerDescription;
            this.listenerPort = response.listenerPort;
            this.listenerProtocol = response.listenerProtocol;
            this.loadBalancerId = response.loadBalancerId;
            this.quicConfig = response.quicConfig;
            this.requestTimeout = response.requestTimeout;
            this.securityPolicyId = response.securityPolicyId;
            this.XForwardedForConfig = response.XForwardedForConfig;
        } 

        /**
         * 监听默认CA证书列表，N当前取值范围为1
         */
        public Builder caCertificates(java.util.List < CaCertificates> caCertificates) {
            this.putQueryParameter("CaCertificates", caCertificates);
            this.caCertificates = caCertificates;
            return this;
        }

        /**
         * 是否开启双向认证
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.putQueryParameter("CaEnabled", caEnabled);
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * 监听默认服务器证书列表，N当前取值范围为1
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 监听默认动作
         */
        public Builder defaultActions(java.util.List < DefaultActions> defaultActions) {
            this.putQueryParameter("DefaultActions", defaultActions);
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 是否开启Gzip压缩
         */
        public Builder gzipEnabled(Boolean gzipEnabled) {
            this.putQueryParameter("GzipEnabled", gzipEnabled);
            this.gzipEnabled = gzipEnabled;
            return this;
        }

        /**
         * 是否开启HTTP/2特性
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            this.putQueryParameter("Http2Enabled", http2Enabled);
            this.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * 连接空闲超时时间
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * 监听描述
         */
        public Builder listenerDescription(String listenerDescription) {
            this.putQueryParameter("ListenerDescription", listenerDescription);
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * 监听端口
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * 监听协议
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * 负载均衡标识
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * HTTPS启用QUIC时相关属性
         */
        public Builder quicConfig(QuicConfig quicConfig) {
            this.putQueryParameter("QuicConfig", quicConfig);
            this.quicConfig = quicConfig;
            return this;
        }

        /**
         * 请求超时时间
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.putQueryParameter("RequestTimeout", requestTimeout);
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * 安全策略
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * XForward字段相关的配置
         */
        public Builder XForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
            this.putQueryParameter("XForwardedForConfig", XForwardedForConfig);
            this.XForwardedForConfig = XForwardedForConfig;
            return this;
        }

        @Override
        public CreateListenerRequest build() {
            return new CreateListenerRequest(this);
        } 

    } 

    public static class CaCertificates extends TeaModel {
        private CaCertificates(Builder builder) {
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaCertificates create() {
            return builder().build();
        }

        public static final class Builder {

            public CaCertificates build() {
                return new CaCertificates(this);
            } 

        } 

    }
    public static class Certificates extends TeaModel {
        @NameInMap("CertificateId")
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
             * 正式标识
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
    public static class ServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        @Validation(required = true)
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
             * 服务器组ID
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
    public static class ForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        @Validation(required = true)
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
             * 服务器组列表
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
    public static class DefaultActions extends TeaModel {
        @NameInMap("ForwardGroupConfig")
        @Validation(required = true)
        private ForwardGroupConfig forwardGroupConfig;

        @NameInMap("Type")
        @Validation(required = true)
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
             * 转发组
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * 动作类型
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
    public static class QuicConfig extends TeaModel {
        @NameInMap("QuicListenerId")
        private String quicListenerId;

        @NameInMap("QuicUpgradeEnabled")
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
             * 需要关联的QUIC监听ID，HTTPS监听时有效，QuicUpgradeEnabled为true时必选
             */
            public Builder quicListenerId(String quicListenerId) {
                this.quicListenerId = quicListenerId;
                return this;
            }

            /**
             * 是否开启quic升级，HTTPS监听时有效
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
    public static class XForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        private String XForwardedForClientCertClientVerifyAlias;

        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        private Boolean XForwardedForClientCertClientVerifyEnabled;

        @NameInMap("XForwardedForClientCertFingerprintAlias")
        private String XForwardedForClientCertFingerprintAlias;

        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        private Boolean XForwardedForClientCertFingerprintEnabled;

        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        private String XForwardedForClientCertIssuerDNAlias;

        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        private Boolean XForwardedForClientCertIssuerDNEnabled;

        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        private String XForwardedForClientCertSubjectDNAlias;

        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        private Boolean XForwardedForClientCertSubjectDNEnabled;

        @NameInMap("XForwardedForClientSrcPortEnabled")
        private Boolean XForwardedForClientSrcPortEnabled;

        @NameInMap("XForwardedForEnabled")
        private Boolean XForwardedForEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        private Boolean XForwardedForProtoEnabled;

        @NameInMap("XForwardedForSLBIdEnabled")
        private Boolean XForwardedForSLBIdEnabled;

        @NameInMap("XForwardedForSLBPortEnabled")
        private Boolean XForwardedForSLBPortEnabled;

        private XForwardedForConfig(Builder builder) {
            this.XForwardedForClientCertClientVerifyAlias = builder.XForwardedForClientCertClientVerifyAlias;
            this.XForwardedForClientCertClientVerifyEnabled = builder.XForwardedForClientCertClientVerifyEnabled;
            this.XForwardedForClientCertFingerprintAlias = builder.XForwardedForClientCertFingerprintAlias;
            this.XForwardedForClientCertFingerprintEnabled = builder.XForwardedForClientCertFingerprintEnabled;
            this.XForwardedForClientCertIssuerDNAlias = builder.XForwardedForClientCertIssuerDNAlias;
            this.XForwardedForClientCertIssuerDNEnabled = builder.XForwardedForClientCertIssuerDNEnabled;
            this.XForwardedForClientCertSubjectDNAlias = builder.XForwardedForClientCertSubjectDNAlias;
            this.XForwardedForClientCertSubjectDNEnabled = builder.XForwardedForClientCertSubjectDNEnabled;
            this.XForwardedForClientSrcPortEnabled = builder.XForwardedForClientSrcPortEnabled;
            this.XForwardedForEnabled = builder.XForwardedForEnabled;
            this.XForwardedForProtoEnabled = builder.XForwardedForProtoEnabled;
            this.XForwardedForSLBIdEnabled = builder.XForwardedForSLBIdEnabled;
            this.XForwardedForSLBPortEnabled = builder.XForwardedForSLBPortEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XForwardedForConfig create() {
            return builder().build();
        }

        /**
         * @return XForwardedForClientCertClientVerifyAlias
         */
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.XForwardedForClientCertClientVerifyAlias;
        }

        /**
         * @return XForwardedForClientCertClientVerifyEnabled
         */
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.XForwardedForClientCertClientVerifyEnabled;
        }

        /**
         * @return XForwardedForClientCertFingerprintAlias
         */
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.XForwardedForClientCertFingerprintAlias;
        }

        /**
         * @return XForwardedForClientCertFingerprintEnabled
         */
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.XForwardedForClientCertFingerprintEnabled;
        }

        /**
         * @return XForwardedForClientCertIssuerDNAlias
         */
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.XForwardedForClientCertIssuerDNAlias;
        }

        /**
         * @return XForwardedForClientCertIssuerDNEnabled
         */
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.XForwardedForClientCertIssuerDNEnabled;
        }

        /**
         * @return XForwardedForClientCertSubjectDNAlias
         */
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.XForwardedForClientCertSubjectDNAlias;
        }

        /**
         * @return XForwardedForClientCertSubjectDNEnabled
         */
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.XForwardedForClientCertSubjectDNEnabled;
        }

        /**
         * @return XForwardedForClientSrcPortEnabled
         */
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.XForwardedForClientSrcPortEnabled;
        }

        /**
         * @return XForwardedForEnabled
         */
        public Boolean getXForwardedForEnabled() {
            return this.XForwardedForEnabled;
        }

        /**
         * @return XForwardedForProtoEnabled
         */
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        /**
         * @return XForwardedForSLBIdEnabled
         */
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.XForwardedForSLBIdEnabled;
        }

        /**
         * @return XForwardedForSLBPortEnabled
         */
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.XForwardedForSLBPortEnabled;
        }

        public static final class Builder {
            private String XForwardedForClientCertClientVerifyAlias; 
            private Boolean XForwardedForClientCertClientVerifyEnabled; 
            private String XForwardedForClientCertFingerprintAlias; 
            private Boolean XForwardedForClientCertFingerprintEnabled; 
            private String XForwardedForClientCertIssuerDNAlias; 
            private Boolean XForwardedForClientCertIssuerDNEnabled; 
            private String XForwardedForClientCertSubjectDNAlias; 
            private Boolean XForwardedForClientCertSubjectDNEnabled; 
            private Boolean XForwardedForClientSrcPortEnabled; 
            private Boolean XForwardedForEnabled; 
            private Boolean XForwardedForProtoEnabled; 
            private Boolean XForwardedForSLBIdEnabled; 
            private Boolean XForwardedForSLBPortEnabled; 

            /**
             * 自定义HEADER头名称，只有当XForwardedForClientCertClientVerifyEnabled的值为true的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
             */
            public Builder XForwardedForClientCertClientVerifyAlias(String XForwardedForClientCertClientVerifyAlias) {
                this.XForwardedForClientCertClientVerifyAlias = XForwardedForClientCertClientVerifyAlias;
                return this;
            }

            /**
             * 是否通过X-Forwarded-Clientcert-clientverify  头字段获取对访问负载均衡实例客户端证书的校验结果。HTTPS监听有效。
             */
            public Builder XForwardedForClientCertClientVerifyEnabled(Boolean XForwardedForClientCertClientVerifyEnabled) {
                this.XForwardedForClientCertClientVerifyEnabled = XForwardedForClientCertClientVerifyEnabled;
                return this;
            }

            /**
             * 自定义HEADER头名称，只有当XForwardedForClientCertFingerprintEnabled的值为true的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
             */
            public Builder XForwardedForClientCertFingerprintAlias(String XForwardedForClientCertFingerprintAlias) {
                this.XForwardedForClientCertFingerprintAlias = XForwardedForClientCertFingerprintAlias;
                return this;
            }

            /**
             * 是否通过X-Forwarded-Clientcert-fingerprint 头字段获取访问负载均衡实例客户端证书的指纹取值，HTTPS监听有效。
             */
            public Builder XForwardedForClientCertFingerprintEnabled(Boolean XForwardedForClientCertFingerprintEnabled) {
                this.XForwardedForClientCertFingerprintEnabled = XForwardedForClientCertFingerprintEnabled;
                return this;
            }

            /**
             * 自定义HEADER头名称，只有当XForwardedForClientCertIssuerDNEnabled的值为‘On’的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
             */
            public Builder XForwardedForClientCertIssuerDNAlias(String XForwardedForClientCertIssuerDNAlias) {
                this.XForwardedForClientCertIssuerDNAlias = XForwardedForClientCertIssuerDNAlias;
                return this;
            }

            /**
             * 是否通过 X-Forwarded-Clientcert-issuerdn 头字段获取访问负载均衡实例客户端证书的发行者信息。HTTPS监听有效。
             */
            public Builder XForwardedForClientCertIssuerDNEnabled(Boolean XForwardedForClientCertIssuerDNEnabled) {
                this.XForwardedForClientCertIssuerDNEnabled = XForwardedForClientCertIssuerDNEnabled;
                return this;
            }

            /**
             * 自定义HEADER头名称，只有当XForwardedForClientCertSubjectDNEnabled的值为true的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
             */
            public Builder XForwardedForClientCertSubjectDNAlias(String XForwardedForClientCertSubjectDNAlias) {
                this.XForwardedForClientCertSubjectDNAlias = XForwardedForClientCertSubjectDNAlias;
                return this;
            }

            /**
             * 是否通过X-Forwarded-Clientcert-subjectdn  头字段获取访问负载均衡实例客户端证书的所有者信息。HTTPS监听有效。
             */
            public Builder XForwardedForClientCertSubjectDNEnabled(Boolean XForwardedForClientCertSubjectDNEnabled) {
                this.XForwardedForClientCertSubjectDNEnabled = XForwardedForClientCertSubjectDNEnabled;
                return this;
            }

            /**
             * 是否通过X-Forwarded-Client-Port 头字段获取访问负载均衡实例客户端的端口。HTTPS监听有效。
             */
            public Builder XForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
                this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
                return this;
            }

            /**
             * 是否开启通过X-Forwarded-For头字段获取来访者真实 IP
             */
            public Builder XForwardedForEnabled(Boolean XForwardedForEnabled) {
                this.XForwardedForEnabled = XForwardedForEnabled;
                return this;
            }

            /**
             * 是否通过X-Forwarded-Proto头字段获取负载均衡实例的监听协议。
             */
            public Builder XForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
                this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
                return this;
            }

            /**
             * 是否通过SLB-ID头字段获取负载均衡实例ID。
             */
            public Builder XForwardedForSLBIdEnabled(Boolean XForwardedForSLBIdEnabled) {
                this.XForwardedForSLBIdEnabled = XForwardedForSLBIdEnabled;
                return this;
            }

            /**
             * 是否通过X-Forwarded-Port 头字段获取负载均衡实例的监听端口。HTTPS监听有效。
             */
            public Builder XForwardedForSLBPortEnabled(Boolean XForwardedForSLBPortEnabled) {
                this.XForwardedForSLBPortEnabled = XForwardedForSLBPortEnabled;
                return this;
            }

            public XForwardedForConfig build() {
                return new XForwardedForConfig(this);
            } 

        } 

    }
}
