// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerAttributeResponseBody</p>
 */
public class GetListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclConfig")
    private AclConfig aclConfig;

    @com.aliyun.core.annotation.NameInMap("CaCertificates")
    private java.util.List < CaCertificates> caCertificates;

    @com.aliyun.core.annotation.NameInMap("CaEnabled")
    private Boolean caEnabled;

    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @com.aliyun.core.annotation.NameInMap("DefaultActions")
    private java.util.List < DefaultActions> defaultActions;

    @com.aliyun.core.annotation.NameInMap("GzipEnabled")
    private Boolean gzipEnabled;

    @com.aliyun.core.annotation.NameInMap("Http2Enabled")
    private Boolean http2Enabled;

    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("ListenerDescription")
    private String listenerDescription;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @com.aliyun.core.annotation.NameInMap("ListenerStatus")
    private String listenerStatus;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LogConfig")
    private LogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("QuicConfig")
    private QuicConfig quicConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.NameInMap("XForwardedForConfig")
    private XForwardedForConfig xForwardedForConfig;

    private GetListenerAttributeResponseBody(Builder builder) {
        this.aclConfig = builder.aclConfig;
        this.caCertificates = builder.caCertificates;
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
        this.tags = builder.tags;
        this.xForwardedForConfig = builder.xForwardedForConfig;
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
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return xForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.xForwardedForConfig;
    }

    public static final class Builder {
        private AclConfig aclConfig; 
        private java.util.List < CaCertificates> caCertificates; 
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
        private java.util.List < Tags> tags; 
        private XForwardedForConfig xForwardedForConfig; 

        /**
         * <p>The configurations of the access control lists (ACLs).</p>
         */
        public Builder aclConfig(AclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }

        /**
         * <p>A list of default CA certificates.</p>
         */
        public Builder caCertificates(java.util.List < CaCertificates> caCertificates) {
            this.caCertificates = caCertificates;
            return this;
        }

        /**
         * <p>Indicates whether mutual authentication is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * <p>A list of certificates.</p>
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>The actions of the default forwarding rule.</p>
         */
        public Builder defaultActions(java.util.List < DefaultActions> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         * <p>Indicates whether GZIP compression is enabled to compress specific types of files. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder gzipEnabled(Boolean gzipEnabled) {
            this.gzipEnabled = gzipEnabled;
            return this;
        }

        /**
         * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
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
            this.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * <p>The timeout period of an idle connection. Unit: seconds.</p>
         * <p>If no requests are received within the specified timeout period, Application Load Balancer (ALB) closes the current connection. When a request is received, ALB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The name of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder listenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The frontend port that is used by the ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The listener protocol. Valid values: <strong>HTTP</strong>, <strong>HTTPS</strong>, and <strong>QUIC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The status of the listener. Valid values:</p>
         * <ul>
         * <li><strong>Provisioning</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Configuring</strong></li>
         * <li><strong>Stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder listenerStatus(String listenerStatus) {
            this.listenerStatus = listenerStatus;
            return this;
        }

        /**
         * <p>The ALB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1o94dp5i6ea****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The logging configuration.</p>
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>The configuration information when the listener is associated with a QUIC listener.</p>
         */
        public Builder quicConfig(QuicConfig quicConfig) {
            this.quicConfig = quicConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timeout period of a request. Unit: seconds.</p>
         * <p>If no responses are received from the backend server within the specified timeout period, ALB returns an <code>HTTP 504</code> error code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The security policy.</p>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tls_cipher_policy_1_1</p>
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The configuration of the XForward headers.</p>
         */
        public Builder xForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
            this.xForwardedForConfig = xForwardedForConfig;
            return this;
        }

        public GetListenerAttributeResponseBody build() {
            return new GetListenerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class AclRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The ID of the ACL that is associated with the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-doc****</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>Indicates whether the ACL is associated with the listener. Valid values:</p>
             * <ul>
             * <li><strong>Associating</strong></li>
             * <li><strong>Associated</strong></li>
             * <li><strong>Dissociating</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Associating</p>
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
    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class AclConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclRelations")
        private java.util.List < AclRelations> aclRelations;

        @com.aliyun.core.annotation.NameInMap("AclType")
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
             * <p>The IDs of the ACLs that are associated with the listener.</p>
             */
            public Builder aclRelations(java.util.List < AclRelations> aclRelations) {
                this.aclRelations = aclRelations;
                return this;
            }

            /**
             * <p>The type of the ACL. Valid values:</p>
             * <ul>
             * <li><p><strong>White</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists are applicable to scenarios in which you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. If a whitelist is configured for a listener, only requests from IP addresses that are on the whitelist are forwarded by the listener.</p>
             * <p>If you enable a whitelist but do not add an IP address to the whitelist, the listener forwards all requests.</p>
             * </li>
             * <li><p><strong>Black</strong>: a blacklist. Requests from the IP addresses or CIDR blocks in the network ACL are denied. Blacklists are suitable for scenarios in which you want to deny access from specific IP addresses or CIDR blocks to an application.</p>
             * <p>If a blacklist is configured for a listener but no IP addresses are added to the blacklist, the listener forwards all requests.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>White</p>
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
    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class CaCertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CaCertificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.isDefault = builder.isDefault;
            this.status = builder.status;
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

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certificateId; 
            private Boolean isDefault; 
            private String status; 

            /**
             * <p>The ID of the default CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>139a00604bd-cn-east-hangzho****</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is a default certificate: Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The status of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Associated</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CaCertificates build() {
                return new CaCertificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
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
             * <p>The ID of the certificate. Only server certificates are supported.</p>
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
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class ServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
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
             * 
             * <strong>example:</strong>
             * <p>rsp-cige6j****</p>
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
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class ForwardGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
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
             * <p>The server group to which requests are forwarded.</p>
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
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class DefaultActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The configuration of the ForwardGroup action. This parameter is returned and takes effect when Type is set to <strong>ForwardGroup</strong>.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The type of the action.</p>
             * <p>If <strong>ForwardGroup</strong> is returned, requests are forwarded to multiple vServer groups.</p>
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
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class AccessLogTracingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TracingEnabled")
        private Boolean tracingEnabled;

        @com.aliyun.core.annotation.NameInMap("TracingSample")
        private Integer tracingSample;

        @com.aliyun.core.annotation.NameInMap("TracingType")
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
             * <p>Indicates whether Xtrace is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>You can set this parameter to <strong>true</strong> only if the AccessLogEnabled parameter is set to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * <p>The sampling rate of Xtrace. Valid values: 1 to 10000.</p>
             * <blockquote>
             * <p>If <strong>TracingEnabled</strong> is set to <strong>true</strong>, this parameter is valid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * <p>The Xtrace type. Supported Xtrace type: <strong>Zipkin</strong>.</p>
             * <blockquote>
             * <p>If <strong>TracingEnabled</strong> is set to <strong>true</strong>, this parameter is valid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Zipkin</p>
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
    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class LogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        private Boolean accessLogRecordCustomizedHeadersEnabled;

        @com.aliyun.core.annotation.NameInMap("AccessLogTracingConfig")
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
             * <p>Indicates whether custom headers are recorded in the access log. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
                this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
                return this;
            }

            /**
             * <p>The configuration of Xtrace. Xtrace is used to record requests sent to ALB.</p>
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
    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
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
             * <p>The ID of the QUIC listener. This parameter is returned when <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>. Only HTTPS listeners support this parameter.</p>
             * <blockquote>
             * <p>You must associate the HTTPS listener and the QUIC listener with the same ALB instance. In addition, make sure that the QUIC listener has never been associated with another listener.</p>
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
             * <p>Indicates whether QUIC upgrade is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
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
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertClientVerifyEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS listener.</p>
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
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-clientverify</code> header is used to retrieve the verification result of the client certificate. Valid values:</p>
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
            public Builder xForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
                this.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertFingerprintEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS listener.</p>
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
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-fingerprint</code> header is used to retrieve the fingerprint of the client certificate. Valid values:</p>
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
            public Builder xForwardedForClientCertFingerprintEnabled(Boolean xForwardedForClientCertFingerprintEnabled) {
                this.xForwardedForClientCertFingerprintEnabled = xForwardedForClientCertFingerprintEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertIssuerDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS listener.</p>
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
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-issuerdn</code> header is used to retrieve information about the authority that issues the client certificate. Valid values:</p>
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
            public Builder xForwardedForClientCertIssuerDNEnabled(Boolean xForwardedForClientCertIssuerDNEnabled) {
                this.xForwardedForClientCertIssuerDNEnabled = xForwardedForClientCertIssuerDNEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertSubjectDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTPS listener.</p>
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
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-subjectdn</code> header is used to retrieve information about the owner of the client certificate. Valid values:</p>
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
            public Builder xForwardedForClientCertSubjectDNEnabled(Boolean xForwardedForClientCertSubjectDNEnabled) {
                this.xForwardedForClientCertSubjectDNEnabled = xForwardedForClientCertSubjectDNEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Client-Ip</code> header is used to retrieve the source port of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
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
             * <p>ALB traverses <code>X-Forwarded-For</code> backward and selects the first IP address that is not on the trusted IP address list as the real IP address of the client. The IP address is used in source IP address throttling.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.0/24</p>
             */
            public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
                this.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Client-Port</code> header is used to retrieve the client port. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTP or HTTPS listener.</p>
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
             * <p>Indicates whether the <code>X-Forwarded-For</code> header is used to retrieve the client IP address. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTP or HTTPS listener.</p>
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
             * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to retrieve the listening protocol. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
                this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForSLBIdEnabled(Boolean xForwardedForSLBIdEnabled) {
                this.xForwardedForSLBIdEnabled = xForwardedForSLBIdEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Port</code> header is used to retrieve the listening port of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
