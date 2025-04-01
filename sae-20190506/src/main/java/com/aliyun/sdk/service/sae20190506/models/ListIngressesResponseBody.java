// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListIngressesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIngressesResponseBody</p>
 */
public class ListIngressesResponseBody extends TeaModel {
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

    private ListIngressesResponseBody(Builder builder) {
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

    public static ListIngressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListIngressesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The request was successful.</li>
         * <li><strong>3xx</strong>: The request was redirected.</li>
         * <li><strong>4xx</strong>: The request failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed. Valid values:</p>
         * <ul>
         * <li><strong>ErrorCode</strong> is not returned if a request is successful.</li>
         * <li><strong>ErrorCode</strong> is returned if a request failed. For more information, see <strong>Error codes</strong>.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned. Valid values:</p>
         * <ul>
         * <li><strong>success</strong> is returned when a request is successful.</li>
         * <li>An error code is returned when a request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the list of Ingresses was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The list were obtained.</li>
         * <li><strong>false</strong>: The list failed to be queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of a trace. The ID is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListIngressesResponseBody build() {
            return new ListIngressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
     */
    public static class CorsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCredentials")
        private String allowCredentials;

        @com.aliyun.core.annotation.NameInMap("AllowHeaders")
        private String allowHeaders;

        @com.aliyun.core.annotation.NameInMap("AllowMethods")
        private String allowMethods;

        @com.aliyun.core.annotation.NameInMap("AllowOrigin")
        private String allowOrigin;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("ExposeHeaders")
        private String exposeHeaders;

        @com.aliyun.core.annotation.NameInMap("MaxAge")
        private String maxAge;

        private CorsConfig(Builder builder) {
            this.allowCredentials = builder.allowCredentials;
            this.allowHeaders = builder.allowHeaders;
            this.allowMethods = builder.allowMethods;
            this.allowOrigin = builder.allowOrigin;
            this.enable = builder.enable;
            this.exposeHeaders = builder.exposeHeaders;
            this.maxAge = builder.maxAge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorsConfig create() {
            return builder().build();
        }

        /**
         * @return allowCredentials
         */
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        /**
         * @return allowHeaders
         */
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        /**
         * @return allowMethods
         */
        public String getAllowMethods() {
            return this.allowMethods;
        }

        /**
         * @return allowOrigin
         */
        public String getAllowOrigin() {
            return this.allowOrigin;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return exposeHeaders
         */
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        /**
         * @return maxAge
         */
        public String getMaxAge() {
            return this.maxAge;
        }

        public static final class Builder {
            private String allowCredentials; 
            private String allowHeaders; 
            private String allowMethods; 
            private String allowOrigin; 
            private String enable; 
            private String exposeHeaders; 
            private String maxAge; 

            private Builder() {
            } 

            private Builder(CorsConfig model) {
                this.allowCredentials = model.allowCredentials;
                this.allowHeaders = model.allowHeaders;
                this.allowMethods = model.allowMethods;
                this.allowOrigin = model.allowOrigin;
                this.enable = model.enable;
                this.exposeHeaders = model.exposeHeaders;
                this.maxAge = model.maxAge;
            } 

            /**
             * AllowCredentials.
             */
            public Builder allowCredentials(String allowCredentials) {
                this.allowCredentials = allowCredentials;
                return this;
            }

            /**
             * AllowHeaders.
             */
            public Builder allowHeaders(String allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * AllowMethods.
             */
            public Builder allowMethods(String allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * AllowOrigin.
             */
            public Builder allowOrigin(String allowOrigin) {
                this.allowOrigin = allowOrigin;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * ExposeHeaders.
             */
            public Builder exposeHeaders(String exposeHeaders) {
                this.exposeHeaders = exposeHeaders;
                return this;
            }

            /**
             * MaxAge.
             */
            public Builder maxAge(String maxAge) {
                this.maxAge = maxAge;
                return this;
            }

            public CorsConfig build() {
                return new CorsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DefaultRule model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.backendProtocol = model.backendProtocol;
                this.containerPort = model.containerPort;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
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
             * ContainerPort.
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
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
     */
    public static class RuleActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionConfig")
        private String actionConfig;

        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        private RuleActions(Builder builder) {
            this.actionConfig = builder.actionConfig;
            this.actionType = builder.actionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActions create() {
            return builder().build();
        }

        /**
         * @return actionConfig
         */
        public String getActionConfig() {
            return this.actionConfig;
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        public static final class Builder {
            private String actionConfig; 
            private String actionType; 

            private Builder() {
            } 

            private Builder(RuleActions model) {
                this.actionConfig = model.actionConfig;
                this.actionType = model.actionType;
            } 

            /**
             * ActionConfig.
             */
            public Builder actionConfig(String actionConfig) {
                this.actionConfig = actionConfig;
                return this;
            }

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            public RuleActions build() {
                return new RuleActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("RuleActions")
        private java.util.List<RuleActions> ruleActions;

        private Rules(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.backendProtocol = builder.backendProtocol;
            this.containerPort = builder.containerPort;
            this.domain = builder.domain;
            this.path = builder.path;
            this.rewritePath = builder.rewritePath;
            this.ruleActions = builder.ruleActions;
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

        /**
         * @return ruleActions
         */
        public java.util.List<RuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String backendProtocol; 
            private Integer containerPort; 
            private String domain; 
            private String path; 
            private String rewritePath; 
            private java.util.List<RuleActions> ruleActions; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.backendProtocol = model.backendProtocol;
                this.containerPort = model.containerPort;
                this.domain = model.domain;
                this.path = model.path;
                this.rewritePath = model.rewritePath;
                this.ruleActions = model.ruleActions;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
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
             * ContainerPort.
             */
            public Builder containerPort(Integer containerPort) {
                this.containerPort = containerPort;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Path.
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

            /**
             * RuleActions.
             */
            public Builder ruleActions(java.util.List<RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
     */
    public static class IngressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertIds")
        private String certIds;

        @com.aliyun.core.annotation.NameInMap("CorsConfig")
        private CorsConfig corsConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultRule")
        private DefaultRule defaultRule;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdleTimeout")
        private Long idleTimeout;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private String listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("LoadBalanceType")
        private String loadBalanceType;

        @com.aliyun.core.annotation.NameInMap("MseGatewayId")
        private String mseGatewayId;

        @com.aliyun.core.annotation.NameInMap("MseGatewayPort")
        private String mseGatewayPort;

        @com.aliyun.core.annotation.NameInMap("MseGatewayProtocol")
        private String mseGatewayProtocol;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("RequestTimeout")
        private Long requestTimeout;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbType")
        private String slbType;

        private IngressList(Builder builder) {
            this.certId = builder.certId;
            this.certIds = builder.certIds;
            this.corsConfig = builder.corsConfig;
            this.createTime = builder.createTime;
            this.defaultRule = builder.defaultRule;
            this.description = builder.description;
            this.id = builder.id;
            this.idleTimeout = builder.idleTimeout;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.loadBalanceType = builder.loadBalanceType;
            this.mseGatewayId = builder.mseGatewayId;
            this.mseGatewayPort = builder.mseGatewayPort;
            this.mseGatewayProtocol = builder.mseGatewayProtocol;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.requestTimeout = builder.requestTimeout;
            this.rules = builder.rules;
            this.slbId = builder.slbId;
            this.slbType = builder.slbType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressList create() {
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
         * @return corsConfig
         */
        public CorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
        public Long getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return listenerPort
         */
        public String getListenerPort() {
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
         * @return mseGatewayId
         */
        public String getMseGatewayId() {
            return this.mseGatewayId;
        }

        /**
         * @return mseGatewayPort
         */
        public String getMseGatewayPort() {
            return this.mseGatewayPort;
        }

        /**
         * @return mseGatewayProtocol
         */
        public String getMseGatewayProtocol() {
            return this.mseGatewayProtocol;
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
        public Long getRequestTimeout() {
            return this.requestTimeout;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
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
            private CorsConfig corsConfig; 
            private Long createTime; 
            private DefaultRule defaultRule; 
            private String description; 
            private Long id; 
            private Long idleTimeout; 
            private String listenerPort; 
            private String listenerProtocol; 
            private String loadBalanceType; 
            private String mseGatewayId; 
            private String mseGatewayPort; 
            private String mseGatewayProtocol; 
            private String name; 
            private String namespaceId; 
            private Long requestTimeout; 
            private java.util.List<Rules> rules; 
            private String slbId; 
            private String slbType; 

            private Builder() {
            } 

            private Builder(IngressList model) {
                this.certId = model.certId;
                this.certIds = model.certIds;
                this.corsConfig = model.corsConfig;
                this.createTime = model.createTime;
                this.defaultRule = model.defaultRule;
                this.description = model.description;
                this.id = model.id;
                this.idleTimeout = model.idleTimeout;
                this.listenerPort = model.listenerPort;
                this.listenerProtocol = model.listenerProtocol;
                this.loadBalanceType = model.loadBalanceType;
                this.mseGatewayId = model.mseGatewayId;
                this.mseGatewayPort = model.mseGatewayPort;
                this.mseGatewayProtocol = model.mseGatewayProtocol;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.requestTimeout = model.requestTimeout;
                this.rules = model.rules;
                this.slbId = model.slbId;
                this.slbType = model.slbType;
            } 

            /**
             * <p>The ID of the certificate that is associated with a Classic Load Balancer (<strong>CLB</strong>) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>13624*<strong><strong>73809_16f8e549a20_1175189789_12</strong></strong>3210</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The ID of the certificate that is associated with an Application Load Balancer <strong>ALB</strong> instance.</p>
             * 
             * <strong>example:</strong>
             * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
             */
            public Builder certIds(String certIds) {
                this.certIds = certIds;
                return this;
            }

            /**
             * CorsConfig.
             */
            public Builder corsConfig(CorsConfig corsConfig) {
                this.corsConfig = corsConfig;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultRule.
             */
            public Builder defaultRule(DefaultRule defaultRule) {
                this.defaultRule = defaultRule;
                return this;
            }

            /**
             * <p>The name of a routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of a routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdleTimeout.
             */
            public Builder idleTimeout(Long idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * <p>The listener ports for an SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(String listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The protocol that is supported by SLB to forward requests. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong>: HTTP is suitable for applications that need to identify the transmitted data.</li>
             * <li><strong>HTTPS</strong>: HTTPS is suitable for applications that require encrypted data transmission.</li>
             * </ul>
             * <p>This parameter is optional in the <strong>CreateIngress</strong> and <strong>UpadateIngress</strong> operations. If you do not configure this parameter when you call the CreateIngress or UpdateIngress operation to create or update a gateway routing rule, this parameter is not returned for the corresponding response.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The type of SLB instances. Valid values:</p>
             * <ul>
             * <li><strong>clb</strong>: Classic Load Balancer (formerly known as SLB).</li>
             * <li><strong>alb</strong>: Application Load Balancer.</li>
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
             * <p>The ID of an MSE cloud-native gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-d5df01a1bae748f1a7c4e325d2fd****</p>
             */
            public Builder mseGatewayId(String mseGatewayId) {
                this.mseGatewayId = mseGatewayId;
                return this;
            }

            /**
             * <p>The port of a service.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder mseGatewayPort(String mseGatewayPort) {
                this.mseGatewayPort = mseGatewayPort;
                return this;
            }

            /**
             * <p>The protocol that is supported by an MSE cloud-native gateway to forward requests. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong>: HTTP is suitable for applications that need to identify transmitted data.</li>
             * <li><strong>HTTPS</strong>: HTTPS is suitable for applications that require encrypted data transmission.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder mseGatewayProtocol(String mseGatewayProtocol) {
                this.mseGatewayProtocol = mseGatewayProtocol;
                return this;
            }

            /**
             * <p>The name of a routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf6jt0nu4z6ior943****-80-f5****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of a namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * RequestTimeout.
             */
            public Builder requestTimeout(Long requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The ID of a Server Load Balancer (SLB) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf62****6d13tq2u5</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The type of SLB instances. Valid values:</p>
             * <ul>
             * <li><strong>internet</strong>: an Internet-facing SLB instance</li>
             * <li><strong>intranet</strong>: an Intranet-facing SLB instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
             */
            public Builder slbType(String slbType) {
                this.slbType = slbType;
                return this;
            }

            public IngressList build() {
                return new IngressList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IngressList")
        private java.util.List<IngressList> ingressList;

        private Data(Builder builder) {
            this.ingressList = builder.ingressList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ingressList
         */
        public java.util.List<IngressList> getIngressList() {
            return this.ingressList;
        }

        public static final class Builder {
            private java.util.List<IngressList> ingressList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ingressList = model.ingressList;
            } 

            /**
             * <p>The list of routing rules.</p>
             */
            public Builder ingressList(java.util.List<IngressList> ingressList) {
                this.ingressList = ingressList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
