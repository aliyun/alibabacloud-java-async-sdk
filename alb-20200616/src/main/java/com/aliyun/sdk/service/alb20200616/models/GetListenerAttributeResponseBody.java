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
 * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerAttributeResponseBody</p>
 */
public class GetListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclConfig")
    private AclConfig aclConfig;

    @com.aliyun.core.annotation.NameInMap("CaCertificates")
    private java.util.List<CaCertificates> caCertificates;

    @com.aliyun.core.annotation.NameInMap("CaEnabled")
    private Boolean caEnabled;

    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List<Certificates> certificates;

    @com.aliyun.core.annotation.NameInMap("DefaultActions")
    private java.util.List<DefaultActions> defaultActions;

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
    private java.util.List<Tags> tags;

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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return defaultActions
     */
    public java.util.List<DefaultActions> getDefaultActions() {
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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<CaCertificates> caCertificates; 
        private Boolean caEnabled; 
        private java.util.List<Certificates> certificates; 
        private java.util.List<DefaultActions> defaultActions; 
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
        private java.util.List<Tags> tags; 
        private XForwardedForConfig xForwardedForConfig; 

        private Builder() {
        } 

        private Builder(GetListenerAttributeResponseBody model) {
            this.aclConfig = model.aclConfig;
            this.caCertificates = model.caCertificates;
            this.caEnabled = model.caEnabled;
            this.certificates = model.certificates;
            this.defaultActions = model.defaultActions;
            this.gzipEnabled = model.gzipEnabled;
            this.http2Enabled = model.http2Enabled;
            this.idleTimeout = model.idleTimeout;
            this.listenerDescription = model.listenerDescription;
            this.listenerId = model.listenerId;
            this.listenerPort = model.listenerPort;
            this.listenerProtocol = model.listenerProtocol;
            this.listenerStatus = model.listenerStatus;
            this.loadBalancerId = model.loadBalancerId;
            this.logConfig = model.logConfig;
            this.quicConfig = model.quicConfig;
            this.requestId = model.requestId;
            this.requestTimeout = model.requestTimeout;
            this.securityPolicyId = model.securityPolicyId;
            this.tags = model.tags;
            this.xForwardedForConfig = model.xForwardedForConfig;
        } 

        /**
         * <p>The ACL configuration structure.</p>
         */
        public Builder aclConfig(AclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }

        /**
         * <p>The list of CA certificates.</p>
         */
        public Builder caCertificates(java.util.List<CaCertificates> caCertificates) {
            this.caCertificates = caCertificates;
            return this;
        }

        /**
         * <p>Specifies whether mutual authentication is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
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
         * <p>The list of certificates.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>The list of default rule actions.</p>
         */
        public Builder defaultActions(java.util.List<DefaultActions> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }

        /**
         * <p>Specifies whether Gzip compression is enabled to compress specific file types. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
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
         * <p>Specifies whether HTTP/2 is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only by HTTPS listeners.</p>
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
         * <p>Specifies the idle connection timeout period. Unit: seconds.</p>
         * <p>If no request is received within the timeout period, the load balancer temporarily closes the current connection and establishes a new connection when the next request arrives.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The custom name of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_80</p>
         */
        public Builder listenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-o4u54y73wq7b******</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The frontend port used by the load balancer.</p>
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
         * <p>The current status of the listener. Valid values:</p>
         * <ul>
         * <li><p><strong>Provisioning</strong>: The listener is being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: The listener is running.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The listener is being configured.</p>
         * </li>
         * <li><p><strong>Stopped</strong>: The listener is stopped.</p>
         * </li>
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
         * <p>The ID of the ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-bd6oylbckp6k9x****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The log configuration information.</p>
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>The configuration information for associating a QUIC listener.</p>
         */
        public Builder quicConfig(QuicConfig quicConfig) {
            this.quicConfig = quicConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies the request timeout period. Unit: seconds.</p>
         * <p>If a backend server does not send a response within the timeout period, the load balancer stops waiting and returns an <code>HTTP 504</code> error code to the client.</p>
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
         * <p>This parameter is supported only by HTTPS listeners.</p>
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
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The X-Forwarded-For field configuration.</p>
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

            private Builder() {
            } 

            private Builder(AclRelations model) {
                this.aclId = model.aclId;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the access control policy associated with the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-doc****</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The association status between the ACL and the listener. Valid values:</p>
             * <ul>
             * <li><p><strong>Associating</strong>: The ACL is being associated.</p>
             * </li>
             * <li><p><strong>Associated</strong>: The ACL is associated.</p>
             * </li>
             * <li><p><strong>Dissociating</strong>: The ACL is being dissociated.</p>
             * </li>
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
        private java.util.List<AclRelations> aclRelations;

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
        public java.util.List<AclRelations> getAclRelations() {
            return this.aclRelations;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        public static final class Builder {
            private java.util.List<AclRelations> aclRelations; 
            private String aclType; 

            private Builder() {
            } 

            private Builder(AclConfig model) {
                this.aclRelations = model.aclRelations;
                this.aclType = model.aclType;
            } 

            /**
             * <p>The IDs of the access control policies associated with the listener.</p>
             */
            public Builder aclRelations(java.util.List<AclRelations> aclRelations) {
                this.aclRelations = aclRelations;
                return this;
            }

            /**
             * <p>The access control type. Valid values:</p>
             * <ul>
             * <li><p><strong>White</strong>: Only requests from the IP addresses or CIDR blocks configured in the selected ACL are forwarded. A whitelist is applicable to scenarios where an application allows access only from specific IP addresses. Configuring a whitelist poses business risks. After a whitelist is configured, only requests from the IP addresses in the whitelist can access the load balancing listener. If you enable whitelist access but do not add any IP addresses to the ACL, the load balancing listener forwards all requests.</p>
             * </li>
             * <li><p><strong>Black</strong>: No requests from the IP addresses or CIDR blocks configured in the selected ACL are forwarded. A blacklist is applicable to scenarios where an application blocks access from specific IP addresses. If you enable blacklist access but do not add any IP addresses to the ACL, the load balancing listener forwards all requests.</p>
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

            private Builder() {
            } 

            private Builder(CaCertificates model) {
                this.certificateId = model.certificateId;
                this.isDefault = model.isDefault;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>139a00*****</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>Specifies whether the certificate is the default certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Yes.</p>
             * </li>
             * <li><p><strong>false</strong>: No.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.certificateId = model.certificateId;
            } 

            /**
             * <p>The ID of the certificate. Only server certificates are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>123157*******</p>
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

            private Builder() {
            } 

            private Builder(ServerGroupTuples model) {
                this.serverGroupId = model.serverGroupId;
            } 

            /**
             * <p>The ID of the destination server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-i5qt20******</p>
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
             * <p>The destination server groups for forwarding.</p>
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

            private Builder() {
            } 

            private Builder(DefaultActions model) {
                this.forwardGroupConfig = model.forwardGroupConfig;
                this.type = model.type;
            } 

            /**
             * <p>The configuration of the forwarding action. This parameter takes effect only when the action type is <strong>ForwardGroup</strong>.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The action type. Valid value: <strong>ForwardGroup</strong>, which indicates that requests are forwarded to multiple server groups.</p>
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

            private Builder() {
            } 

            private Builder(AccessLogTracingConfig model) {
                this.tracingEnabled = model.tracingEnabled;
                this.tracingSample = model.tracingSample;
                this.tracingType = model.tracingType;
            } 

            /**
             * <p>The status of the Xtrace feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>You can set this parameter to <strong>true</strong> only when the access log feature (AccessLogEnabled) is enabled for the instance.</p>
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
             * <p>The sampling rate for Xtrace. Valid values: 1 to 10000.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
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
             * <p>The Xtrace type. Valid value: <strong>Zipkin</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
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

            private Builder() {
            } 

            private Builder(LogConfig model) {
                this.accessLogRecordCustomizedHeadersEnabled = model.accessLogRecordCustomizedHeadersEnabled;
                this.accessLogTracingConfig = model.accessLogTracingConfig;
            } 

            /**
             * <p>Specifies whether custom header fields are included in access logs. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
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
             * <p>The Xtrace configuration information for access logs.</p>
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

            private Builder() {
            } 

            private Builder(QuicConfig model) {
                this.quicListenerId = model.quicListenerId;
                this.quicUpgradeEnabled = model.quicUpgradeEnabled;
            } 

            /**
             * <p>The ID of the QUIC listener to be associated. This parameter is required when <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>. This parameter takes effect only for HTTPS listeners.</p>
             * <blockquote>
             * <p>The original listener and the associated QUIC listener must belong to the same ALB instance, and the QUIC listener must not have been associated before.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>lsn-ek6ad66t****</p>
             */
            public Builder quicListenerId(String quicListenerId) {
                this.quicListenerId = quicListenerId;
                return this;
            }

            /**
             * <p>Specifies whether QUIC upgrade is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only for HTTPS listeners.</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. It can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. It can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertClientVerifyEnabled</strong> is set to <strong>true</strong>. The name must be 1 to 40 characters in length and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-clientverify</code> header field to retrieve the verification result of the client certificate that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
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
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertFingerprintEnabled</strong> is set to <strong>true</strong>. The name must be 1 to 40 characters in length and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-fingerprint</code> header field to retrieve the fingerprint of the client certificate that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
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
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertIssuerDNEnabled</strong> is set to <strong>true</strong>. The name must be 1 to 40 characters in length and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-issuerdn</code> header field to retrieve the issuer information of the client certificate that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
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
             * <p>The custom header name. This parameter takes effect only when <strong>XForwardedForClientCertSubjectDNEnabled</strong> is set to <strong>true</strong>. The name must be 1 to 40 characters in length and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-subjectdn</code> header field to retrieve the subject information of the client certificate that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
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
             * <p>Specifies whether to allow Application Load Balancer (ALB) to retrieve the actual client IP address from the <code>X-Forwarded-For</code> header field. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
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
             * <p>Application Load Balancing (ALB) traverses the <code>X-Forwarded-For</code> header field from back to front and selects the first IP address that is not in the trusted IP address list as the actual client IP address. This IP address is used for source IP address-based rate limiting.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.0/24</p>
             */
            public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
                this.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Client-Port</code> header field to retrieve the port of the client that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
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
             * <p>Specifies whether to use the <code>X-Forwarded-For</code> header field to retrieve the actual IP address of the client. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default): Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <ol>
             * <li>If you set this parameter to <strong>true</strong>, the default value of <strong>XForwardedForProcessingMode</strong> is <strong>append</strong>, and you can change it to <strong>remove</strong>.</li>
             * <li>If you set this parameter to <strong>false</strong>, the <code>X-Forwarded-For</code> header field is retained without additional processing before the request is forwarded to the backend server.</li>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Host</code> header field to retrieve the domain name of the client that accesses the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong> (default): No.</li>
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
             * <p>The processing mode for the <code>X-Forwarded-For</code> header field. This parameter takes effect only when <strong>XForwardedForEnabled</strong> is set to <strong>true</strong>. Valid values:</p>
             * <ul>
             * <li><strong>append</strong> (default): Appends the IP address of the last hop to the <code>X-Forwarded-For</code> header field before the request is forwarded to the backend server.</li>
             * <li><strong>remove</strong>: Deletes the <code>X-Forwarded-For</code> header field before the request is forwarded to the backend server, regardless of whether the request contains the <code>X-Forwarded-For</code> header field.</li>
             * </ul>
             * <blockquote>
             * <ol>
             * <li>If you set this parameter to <strong>append</strong>, the IP address of the last hop is added to the <code>X-Forwarded-For</code> header field before the request is forwarded to the backend server.</li>
             * <li>If you set this parameter to <strong>remove</strong>, the <code>X-Forwarded-For</code> header field is deleted before the request is forwarded to the backend server, regardless of whether the request contains the <code>X-Forwarded-For</code> header field.</li>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header field to retrieve the listener protocol of the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
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
             * <p>Specifies whether to use the <code>SLB-ID</code> header field to retrieve the load balancing instance ID. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
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
             * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header field to retrieve the listener port of the load balancing instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
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
