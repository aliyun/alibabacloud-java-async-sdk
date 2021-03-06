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
         * ACL??????????????????
         */
        public Builder aclConfig(AclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * ????????????????????????????????????N?????????????????????1
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * ????????????
         */
        public Builder defaultActions(java.util.List < DefaultActions> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         * ????????????Gzip??????
         */
        public Builder gzipEnabled(Boolean gzipEnabled) {
            this.gzipEnabled = gzipEnabled;
            return this;
        }

        /**
         * ????????????HTTP/2??????
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * ????????????
         */
        public Builder listenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * ????????????
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * ????????????
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * ????????????
         */
        public Builder listenerStatus(String listenerStatus) {
            this.listenerStatus = listenerStatus;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * HTTPS??????QUIC???????????????
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
         * ??????????????????
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * ????????????
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * XForward?????????????????????
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
             * ACL??????
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * ACL????????????????????????
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
             * ??????????????????????????????
             */
            public Builder aclRelations(java.util.List < AclRelations> aclRelations) {
                this.aclRelations = aclRelations;
                return this;
            }

            /**
             * ??????????????????
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
             * ????????????
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
             * ????????????ID
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
             * ??????????????????
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
             * ?????????????????????
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * ??????
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
             * Xtrace????????????
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * Xtrace????????????
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * xtrace?????????
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
             * ???????????????????????????????????????Header
             */
            public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
                this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
                return this;
            }

            /**
             * ????????????Xtrace???????????????
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
             * ???????????????QUIC??????ID???HTTPS??????????????????QuicUpgradeEnabled???true?????????
             */
            public Builder quicListenerId(String quicListenerId) {
                this.quicListenerId = quicListenerId;
                return this;
            }

            /**
             * ????????????quic?????????HTTPS???????????????
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
             * ?????????HEADER?????????????????????XForwardedForClientCertClientVerifyEnabled?????????true????????????????????????????????????????????????????????????HTTPS????????????
             */
            public Builder XForwardedForClientCertClientVerifyAlias(String XForwardedForClientCertClientVerifyAlias) {
                this.XForwardedForClientCertClientVerifyAlias = XForwardedForClientCertClientVerifyAlias;
                return this;
            }

            /**
             * ????????????X-Forwarded-Clientcert-clientverify  ???????????????????????????????????????????????????????????????????????????HTTPS???????????????
             */
            public Builder XForwardedForClientCertClientVerifyEnabled(Boolean XForwardedForClientCertClientVerifyEnabled) {
                this.XForwardedForClientCertClientVerifyEnabled = XForwardedForClientCertClientVerifyEnabled;
                return this;
            }

            /**
             * ?????????HEADER?????????????????????XForwardedForClientCertFingerprintEnabled?????????true????????????????????????????????????????????????????????????HTTPS????????????
             */
            public Builder XForwardedForClientCertFingerprintAlias(String XForwardedForClientCertFingerprintAlias) {
                this.XForwardedForClientCertFingerprintAlias = XForwardedForClientCertFingerprintAlias;
                return this;
            }

            /**
             * ????????????X-Forwarded-Clientcert-fingerprint ????????????????????????????????????????????????????????????????????????HTTPS???????????????
             */
            public Builder XForwardedForClientCertFingerprintEnabled(Boolean XForwardedForClientCertFingerprintEnabled) {
                this.XForwardedForClientCertFingerprintEnabled = XForwardedForClientCertFingerprintEnabled;
                return this;
            }

            /**
             * ?????????HEADER?????????????????????XForwardedForClientCertIssuerDNEnabled????????????On???????????????????????????????????????????????????????????????HTTPS????????????
             */
            public Builder XForwardedForClientCertIssuerDNAlias(String XForwardedForClientCertIssuerDNAlias) {
                this.XForwardedForClientCertIssuerDNAlias = XForwardedForClientCertIssuerDNAlias;
                return this;
            }

            /**
             * ???????????? X-Forwarded-Clientcert-issuerdn ???????????????????????????????????????????????????????????????????????????HTTPS???????????????
             */
            public Builder XForwardedForClientCertIssuerDNEnabled(Boolean XForwardedForClientCertIssuerDNEnabled) {
                this.XForwardedForClientCertIssuerDNEnabled = XForwardedForClientCertIssuerDNEnabled;
                return this;
            }

            /**
             * ?????????HEADER?????????????????????XForwardedForClientCertSubjectDNEnabled?????????true????????????????????????????????????????????????????????????HTTPS????????????
             */
            public Builder XForwardedForClientCertSubjectDNAlias(String XForwardedForClientCertSubjectDNAlias) {
                this.XForwardedForClientCertSubjectDNAlias = XForwardedForClientCertSubjectDNAlias;
                return this;
            }

            /**
             * ????????????X-Forwarded-Clientcert-subjectdn  ???????????????????????????????????????????????????????????????????????????HTTPS???????????????
             */
            public Builder XForwardedForClientCertSubjectDNEnabled(Boolean XForwardedForClientCertSubjectDNEnabled) {
                this.XForwardedForClientCertSubjectDNEnabled = XForwardedForClientCertSubjectDNEnabled;
                return this;
            }

            /**
             * ????????????X-Forwarded-Client-Port ????????????????????????????????????????????????????????????HTTPS???????????????
             */
            public Builder XForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
                this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
                return this;
            }

            /**
             * ??????????????????X-Forwarded-For?????????????????????????????? IP
             */
            public Builder XForwardedForEnabled(Boolean XForwardedForEnabled) {
                this.XForwardedForEnabled = XForwardedForEnabled;
                return this;
            }

            /**
             * ????????????X-Forwarded-Proto???????????????????????????????????????????????????
             */
            public Builder XForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
                this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
                return this;
            }

            /**
             * ????????????SLB-ID?????????????????????????????????ID???
             */
            public Builder XForwardedForSLBIdEnabled(Boolean XForwardedForSLBIdEnabled) {
                this.XForwardedForSLBIdEnabled = XForwardedForSLBIdEnabled;
                return this;
            }

            /**
             * ????????????X-Forwarded-Port ???????????????????????????????????????????????????HTTPS???????????????
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
