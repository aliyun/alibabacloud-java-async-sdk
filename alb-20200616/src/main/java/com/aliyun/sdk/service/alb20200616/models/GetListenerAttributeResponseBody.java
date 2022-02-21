// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerAttributeResponseBody</p>
 */
public class GetListenerAttributeResponseBody extends TeaModel {
    @NameInMap("AclConfig")
    private AclConfig aclConfig;

    @NameInMap("CaEnabled")
    private Boolean caEnabled;

    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @NameInMap("DefaultActions")
    private java.util.List < DefaultActions> defaultActions;

    @NameInMap("GzipEnabled")
    private Boolean gzipEnabled;

    @NameInMap("Http2Enabled")
    private Boolean http2Enabled;

    @NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @NameInMap("ListenerDescription")
    private String listenerDescription;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("ListenerPort")
    private Integer listenerPort;

    @NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @NameInMap("ListenerStatus")
    private String listenerStatus;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("LogConfig")
    private LogConfig logConfig;

    @NameInMap("QuicConfig")
    private QuicConfig quicConfig;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @NameInMap("XForwardedForConfig")
    private XForwardedForConfig XForwardedForConfig;

    private GetListenerAttributeResponseBody(Builder builder) {
        this.aclConfig = builder.aclConfig;
        this.caEnabled = builder.caEnabled;
        this.certificates = builder.certificates;
        this.defaultActions = builder.defaultActions;
        this.gzipEnabled = builder.gzipEnabled;
        this.http2Enabled = builder.http2Enabled;
        this.idleTimeout = builder.idleTimeout;
        this.listenerDescription = builder.listenerDescription;
        this.listenerId = builder.listenerId;
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.listenerStatus = builder.listenerStatus;
        this.loadBalancerId = builder.loadBalancerId;
        this.logConfig = builder.logConfig;
        this.quicConfig = builder.quicConfig;
        this.requestId = builder.requestId;
        this.requestTimeout = builder.requestTimeout;
        this.securityPolicyId = builder.securityPolicyId;
        this.XForwardedForConfig = builder.XForwardedForConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListenerAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclConfig
     */
    public AclConfig getAclConfig() {
        return this.aclConfig;
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
     * @return defaultActions
     */
    public java.util.List < DefaultActions> getDefaultActions() {
        return this.defaultActions;
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
     * @return listenerStatus
     */
    public String getListenerStatus() {
        return this.listenerStatus;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return logConfig
     */
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return quicConfig
     */
    public QuicConfig getQuicConfig() {
        return this.quicConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private AclConfig aclConfig; 
        private Boolean caEnabled; 
        private java.util.List < Certificates> certificates; 
        private java.util.List < DefaultActions> defaultActions; 
        private Boolean gzipEnabled; 
        private Boolean http2Enabled; 
        private Integer idleTimeout; 
        private String listenerDescription; 
        private String listenerId; 
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String listenerStatus; 
        private String loadBalancerId; 
        private LogConfig logConfig; 
        private QuicConfig quicConfig; 
        private String requestId; 
        private Integer requestTimeout; 
        private String securityPolicyId; 
        private XForwardedForConfig XForwardedForConfig; 

        /**
         * ACL相关配置信息
         */
        public Builder aclConfig(AclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }

        /**
         * 是否开启双向认证
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * 监听默认服务器证书列表，N当前取值范围为1
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * 默认动作
         */
        public Builder defaultActions(java.util.List < DefaultActions> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         * 是否开启Gzip压缩
         */
        public Builder gzipEnabled(Boolean gzipEnabled) {
            this.gzipEnabled = gzipEnabled;
            return this;
        }

        /**
         * 是否开启HTTP/2特性
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * 连接空闲超时时间
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * 监听描述
         */
        public Builder listenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * 监听标识
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * 监听端口
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * 监听协议
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * 监听状态
         */
        public Builder listenerStatus(String listenerStatus) {
            this.listenerStatus = listenerStatus;
            return this;
        }

        /**
         * 负载均衡标识
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * 监听访问日志相关配置
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * HTTPS启用QUIC时相关属性
         */
        public Builder quicConfig(QuicConfig quicConfig) {
            this.quicConfig = quicConfig;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 请求超时时间
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * 安全策略
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * XForward字段相关的配置
         */
        public Builder XForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
            this.XForwardedForConfig = XForwardedForConfig;
            return this;
        }

        public GetListenerAttributeResponseBody build() {
            return new GetListenerAttributeResponseBody(this);
        } 

    } 

    public static class AclRelations extends TeaModel {
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("Status")
        private String status;

        private AclRelations(Builder builder) {
            this.aclId = builder.aclId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclRelations create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aclId; 
            private String status; 

            /**
             * ACL标识
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * ACL与监听关联的状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AclRelations build() {
                return new AclRelations(this);
            } 

        } 

    }
    public static class AclConfig extends TeaModel {
        @NameInMap("AclRelations")
        private java.util.List < AclRelations> aclRelations;

        @NameInMap("AclType")
        private String aclType;

        private AclConfig(Builder builder) {
            this.aclRelations = builder.aclRelations;
            this.aclType = builder.aclType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclConfig create() {
            return builder().build();
        }

        /**
         * @return aclRelations
         */
        public java.util.List < AclRelations> getAclRelations() {
            return this.aclRelations;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        public static final class Builder {
            private java.util.List < AclRelations> aclRelations; 
            private String aclType; 

            /**
             * 监听绑定的访问策略组
             */
            public Builder aclRelations(java.util.List < AclRelations> aclRelations) {
                this.aclRelations = aclRelations;
                return this;
            }

            /**
             * 访问控制类型
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            public AclConfig build() {
                return new AclConfig(this);
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
        private ForwardGroupConfig forwardGroupConfig;

        @NameInMap("Type")
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
             * 转发到服务器组
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * 类型
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
    public static class AccessLogTracingConfig extends TeaModel {
        @NameInMap("TracingEnabled")
        private Boolean tracingEnabled;

        @NameInMap("TracingSample")
        private Integer tracingSample;

        @NameInMap("TracingType")
        private String tracingType;

        private AccessLogTracingConfig(Builder builder) {
            this.tracingEnabled = builder.tracingEnabled;
            this.tracingSample = builder.tracingSample;
            this.tracingType = builder.tracingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogTracingConfig create() {
            return builder().build();
        }

        /**
         * @return tracingEnabled
         */
        public Boolean getTracingEnabled() {
            return this.tracingEnabled;
        }

        /**
         * @return tracingSample
         */
        public Integer getTracingSample() {
            return this.tracingSample;
        }

        /**
         * @return tracingType
         */
        public String getTracingType() {
            return this.tracingType;
        }

        public static final class Builder {
            private Boolean tracingEnabled; 
            private Integer tracingSample; 
            private String tracingType; 

            /**
             * Xtrace功能状态
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * Xtrace功能状态
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * xtrace的类型
             */
            public Builder tracingType(String tracingType) {
                this.tracingType = tracingType;
                return this;
            }

            public AccessLogTracingConfig build() {
                return new AccessLogTracingConfig(this);
            } 

        } 

    }
    public static class LogConfig extends TeaModel {
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        private Boolean accessLogRecordCustomizedHeadersEnabled;

        @NameInMap("AccessLogTracingConfig")
        private AccessLogTracingConfig accessLogTracingConfig;

        private LogConfig(Builder builder) {
            this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
            this.accessLogTracingConfig = builder.accessLogTracingConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return accessLogRecordCustomizedHeadersEnabled
         */
        public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
            return this.accessLogRecordCustomizedHeadersEnabled;
        }

        /**
         * @return accessLogTracingConfig
         */
        public AccessLogTracingConfig getAccessLogTracingConfig() {
            return this.accessLogTracingConfig;
        }

        public static final class Builder {
            private Boolean accessLogRecordCustomizedHeadersEnabled; 
            private AccessLogTracingConfig accessLogTracingConfig; 

            /**
             * 访问日志是否开启携带自定义Header
             */
            public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
                this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
                return this;
            }

            /**
             * 访问日志Xtrace相关的配置
             */
            public Builder accessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
                this.accessLogTracingConfig = accessLogTracingConfig;
                return this;
            }

            public LogConfig build() {
                return new LogConfig(this);
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
