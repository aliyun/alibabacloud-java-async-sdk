// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIngressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIngressResponseBody</p>
 */
public class DescribeIngressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeIngressResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIngressResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The port specified for the SLB listener.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>0a981dd515966966104121683d****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeIngressResponseBody build() {
            return new DescribeIngressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIngressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIngressResponseBody</p>
     */
    public static class DefaultRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BackendProtocol")
        private String backendProtocol;

        @com.aliyun.core.annotation.NameInMap("ContainerPort")
        private Integer containerPort;

        private DefaultRule(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.backendProtocol = builder.backendProtocol;
            this.containerPort = builder.containerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultRule create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return backendProtocol
         */
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        /**
         * @return containerPort
         */
        public Integer getContainerPort() {
            return this.containerPort;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String backendProtocol; 
            private Integer containerPort; 

            /**
             * <p>The domain name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>395b60e4-0550-458d-9c54-a265d036****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The container port of the application specified in the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>app1</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BackendProtocol.
             */
            public Builder backendProtocol(String backendProtocol) {
                this.backendProtocol = backendProtocol;
                return this;
            }

            /**
             * <p>The name of the application specified in the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder containerPort(Integer containerPort) {
                this.containerPort = containerPort;
                return this;
            }

            public DefaultRule build() {
                return new DefaultRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIngressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIngressResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BackendProtocol")
        private String backendProtocol;

        @com.aliyun.core.annotation.NameInMap("ContainerPort")
        private Integer containerPort;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("RewritePath")
        private String rewritePath;

        private Rules(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.backendProtocol = builder.backendProtocol;
            this.containerPort = builder.containerPort;
            this.domain = builder.domain;
            this.path = builder.path;
            this.rewritePath = builder.rewritePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return backendProtocol
         */
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        /**
         * @return containerPort
         */
        public Integer getContainerPort() {
            return this.containerPort;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return rewritePath
         */
        public String getRewritePath() {
            return this.rewritePath;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String backendProtocol; 
            private Integer containerPort; 
            private String domain; 
            private String path; 
            private String rewritePath; 

            /**
             * <p>The protocol used to forward requests. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong>: used when the application needs to identify the transmitted data.</li>
             * <li><strong>HTTPS</strong>: used when the application requires encrypted data transmission.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>395b60e4-0550-458d-9c54-a265d036****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The path of the URL.</p>
             * 
             * <strong>example:</strong>
             * <p>app1</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BackendProtocol.
             */
            public Builder backendProtocol(String backendProtocol) {
                this.backendProtocol = backendProtocol;
                return this;
            }

            /**
             * <p>The ID of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder containerPort(Integer containerPort) {
                this.containerPort = containerPort;
                return this;
            }

            /**
             * <p>The type of the SLB instance based on the processing capabilities. Valid values:</p>
             * <ul>
             * <li><strong>clb</strong>: the Classic Load Balancer (CLB) instance.</li>
             * <li><strong>alb</strong>: the Application Load Balancer (ALB) instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>edas.site</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The error code.</p>
             * <ul>
             * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
             * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/path1</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * RewritePath.
             */
            public Builder rewritePath(String rewritePath) {
                this.rewritePath = rewritePath;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIngressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIngressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertIds")
        private String certIds;

        @com.aliyun.core.annotation.NameInMap("DefaultRule")
        private DefaultRule defaultRule;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("LoadBalanceType")
        private String loadBalanceType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("RequestTimeout")
        private Integer requestTimeout;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbType")
        private String slbType;

        private Data(Builder builder) {
            this.certId = builder.certId;
            this.certIds = builder.certIds;
            this.defaultRule = builder.defaultRule;
            this.description = builder.description;
            this.id = builder.id;
            this.idleTimeout = builder.idleTimeout;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.loadBalanceType = builder.loadBalanceType;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.requestTimeout = builder.requestTimeout;
            this.rules = builder.rules;
            this.securityPolicyId = builder.securityPolicyId;
            this.slbId = builder.slbId;
            this.slbType = builder.slbType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certIds
         */
        public String getCertIds() {
            return this.certIds;
        }

        /**
         * @return defaultRule
         */
        public DefaultRule getDefaultRule() {
            return this.defaultRule;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
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
         * @return loadBalanceType
         */
        public String getLoadBalanceType() {
            return this.loadBalanceType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return requestTimeout
         */
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbType
         */
        public String getSlbType() {
            return this.slbType;
        }

        public static final class Builder {
            private String certId; 
            private String certIds; 
            private DefaultRule defaultRule; 
            private String description; 
            private Long id; 
            private Integer idleTimeout; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private String loadBalanceType; 
            private String name; 
            private String namespaceId; 
            private Integer requestTimeout; 
            private java.util.List < Rules> rules; 
            private String securityPolicyId; 
            private String slbId; 
            private String slbType; 

            /**
             * <p>The name of the application specified in the default rule.</p>
             * 
             * <strong>example:</strong>
             * <p>13623****809_16cad216b32_845_-419427029</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * CertIds.
             */
            public Builder certIds(String certIds) {
                this.certIds = certIds;
                return this;
            }

            /**
             * <p>The forwarding rules.</p>
             */
            public Builder defaultRule(DefaultRule defaultRule) {
                this.defaultRule = defaultRule;
                return this;
            }

            /**
             * <p>The name of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ingress-sae-test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The HTTP status code. Valid values:</p>
             * <ul>
             * <li><strong>2xx</strong>: indicates that the request was successful.</li>
             * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
             * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
             * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>87</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdleTimeout.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * <p>The default rule.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * ListenerProtocol.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>Indicates whether the configurations of the routing rule were queried successfully. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: indicates that the query was successful.</li>
             * <li><strong>false</strong>: indicates that the query failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>clb</p>
             */
            public Builder loadBalanceType(String loadBalanceType) {
                this.loadBalanceType = loadBalanceType;
                return this;
            }

            /**
             * <p>The ID of the application specified in the default rule.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf6jt0nu4z6ior943****-80-f5****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:sae-test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * RequestTimeout.
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * <p>The ID of the application specified in the forwarding rule.</p>
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * SecurityPolicyId.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * <p>The type of the SLB instance based on the IP address. Valid values:</p>
             * <ul>
             * <li><strong>internet</strong>: the Internet-facing SLB instance.</li>
             * <li><strong>intranet</strong>: the internal-facing SLB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lb-uf62****6d13tq2u5</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The container port of the application specified in the default rule.</p>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
             */
            public Builder slbType(String slbType) {
                this.slbType = slbType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
