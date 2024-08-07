// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRulesResponseBody</p>
 */
public class DescribeRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    private DescribeRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public Rules getRules() {
        return this.rules;
    }

    public static final class Builder {
        private String requestId; 
        private Rules rules; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of forwarding rules.
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        public DescribeRulesResponseBody build() {
            return new DescribeRulesResponseBody(this);
        } 

    } 

    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private String healthCheck;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("ListenerSync")
        private String listenerSync;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private String scheduler;

        @com.aliyun.core.annotation.NameInMap("StickySession")
        private String stickySession;

        @com.aliyun.core.annotation.NameInMap("StickySessionType")
        private String stickySessionType;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Rule(Builder builder) {
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.domain = builder.domain;
            this.healthCheck = builder.healthCheck;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckTimeout = builder.healthCheckTimeout;
            this.healthCheckURI = builder.healthCheckURI;
            this.healthyThreshold = builder.healthyThreshold;
            this.listenerSync = builder.listenerSync;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.scheduler = builder.scheduler;
            this.stickySession = builder.stickySession;
            this.stickySessionType = builder.stickySessionType;
            this.unhealthyThreshold = builder.unhealthyThreshold;
            this.url = builder.url;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return cookie
         */
        public String getCookie() {
            return this.cookie;
        }

        /**
         * @return cookieTimeout
         */
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return healthCheck
         */
        public String getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return healthCheckConnectPort
         */
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        /**
         * @return healthCheckDomain
         */
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        /**
         * @return healthCheckHttpCode
         */
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckTimeout
         */
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        /**
         * @return healthCheckURI
         */
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return listenerSync
         */
        public String getListenerSync() {
            return this.listenerSync;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return scheduler
         */
        public String getScheduler() {
            return this.scheduler;
        }

        /**
         * @return stickySession
         */
        public String getStickySession() {
            return this.stickySession;
        }

        /**
         * @return stickySessionType
         */
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private String cookie; 
            private Integer cookieTimeout; 
            private String domain; 
            private String healthCheck; 
            private Integer healthCheckConnectPort; 
            private String healthCheckDomain; 
            private String healthCheckHttpCode; 
            private Integer healthCheckInterval; 
            private Integer healthCheckTimeout; 
            private String healthCheckURI; 
            private Integer healthyThreshold; 
            private String listenerSync; 
            private String ruleId; 
            private String ruleName; 
            private String scheduler; 
            private String stickySession; 
            private String stickySessionType; 
            private Integer unhealthyThreshold; 
            private String url; 
            private String vServerGroupId; 

            /**
             * The cookie that is configured on the backend server.
             * <p>
             * 
             * The value must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces. It cannot start with a dollar sign ($).
             * 
             * >  If you set the **StickySession** parameter to **on** and the **StickySessionType** parameter to **server**, this parameter is required.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * The timeout period of a cookie. Valid values: **1 to 86400**. Unit: seconds.
             * <p>
             * 
             * >  If you set the **StickySession** parameter to **on** and the **StickySessionType** parameter to **insert**, this parameter is required.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * The requested domain name specified in the forwarding rule.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether health checks are enabled.
             * <p>
             * 
             * Valid values: **on** and **off**.
             * 
             * >  If you set the **ListenerSync** parameter to **off**, this parameter is required. If you set the parameter to **on**, the configuration of the listener is used.
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * The port of the backend server that is used for health check.
             * <p>
             * 
             * Valid values: **1 to 65535**.
             * 
             * >  If you set the **HealthCheck** parameter to **on**, this parameter is required. If you left this parameter empty and the **HealthCheck** parameter is set to **on**, the backend port configuration of the listener is used by default.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * The domain name that is used for health checks. Valid values:
             * <p>
             * 
             * *   **$\_ip**: The private IP address of the backend server.
             * 
             *     If you do not set this parameter or set the parameter to $\_ip, the SLB instance uses the private IP address of each backend server as the domain name for health checks.
             * 
             * *   **domain**: The domain name must be 1 to 80 characters in length. The domain name can contain only letters, digits, periods (.),and hyphens (-).
             * 
             * >  If you set the **HealthCheck** parameter to **on**, this parameter is required.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * The HTTP status code that indicates a successful health check. Multiple HTTP status codes are separated by commas (,). Default value: **http\_2xx**.
             * <p>
             * 
             * Valid values: **http\_2xx**, **http\_3xx**, **http\_4xx**, and **http\_5xx**.
             * 
             * >  If you set the **HealthCheck** parameter to **on**, this parameter is required.
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * The time interval between two consecutive health checks.
             * <p>
             * 
             * Valid values: **1 to 50**. Unit: seconds.
             * 
             * >  If you set the **HealthCheck** parameter to **on**, this parameter is required.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The timeout period for a health check response. If the backend Elastic Compute Service (ECS) instance does not send an expected response within the specified period of time, the health check fails.
             * <p>
             * 
             * Valid values: **1 to 300**. Unit: seconds.
             * 
             * >  If the value of the **HealthCHeckTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the value of the **HealthCHeckTimeout** parameter is ignored and the value of the **HealthCheckInterval** parameter is regarded as the waiting period. If you set the **HealthCheck** parameter to **on**, this parameter is required.
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * The URI that is used for health checks.
             * <p>
             * 
             * >  If you set the **HealthCheck** parameter to **on**, this parameter is required.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * Specifies the number of successful health checks that must be consecutively performed before a backend server can be declared healthy (from **fail** to **success**).
             * <p>
             * 
             * Valid values: **2 to 10**.
             * 
             * >  If you set the **HealthCheck** parameter to **on**, this parameter is required.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * Indicates whether the forwarding rule uses the scheduling algorithm, session persistence, and health check configurations of the listener.
             * <p>
             * 
             * Valid values: **on** and **off**.
             * 
             * *   **off**: does not use the configurations of the listener. You can customize health check and session persistence configurations for the forwarding rule.
             * *   **on**: uses the configurations of the listener.
             */
            public Builder listenerSync(String listenerSync) {
                this.listenerSync = listenerSync;
                return this;
            }

            /**
             * The ID of the forwarding rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the forwarding rule. The name must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_).
             * <p>
             * 
             * >  The name of each forwarding rule must be unique within a listener.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The scheduling algorithm. Valid values:
             * <p>
             * 
             * *   **wrr** (default): Backend servers that have higher weights receive more requests than backend servers that have lower weights.
             * *   **rr**: Requests are distributed to backend servers in sequence.
             * 
             * >  If you set the **ListenerSync** parameter to **off**, this parameter is required. If you set the parameter to **on**, the configuration of the listener is used.
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * Specifies whether to enable session persistence.
             * <p>
             * 
             * Valid values: **on** and **off**.
             * 
             * >  If you set the **ListenerSync** parameter to **off**, this parameter is required. If you set the parameter to **on**, the configuration of the listener is used.
             */
            public Builder stickySession(String stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * The method that is used to handle a cookie. Valid values:
             * <p>
             * 
             * *   **insert**: inserts a cookie into the response. SLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.
             * *   **server**: rewrites a cookie. When SLB detects a user-defined cookie, SLB overwrites the original cookie with the user-defined cookie. The next request from the client contains the user-defined cookie, and the listener distributes the request to the recorded backend server.
             * 
             * >  If you set the **StickySession** parameter to **on**, this parameter is required.
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * Specifies the number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy (from **success** to **fail**).
             * <p>
             * 
             * Valid values: **2 to 10**
             * 
             * >  If you set the **HealthCheck** parameter to **on**, this parameter is required.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * The requested path specified in the forwarding rule.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The ID of the destination vServer group specified in the forwarding rule.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List < Rule> rule;

        private Rules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List < Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
