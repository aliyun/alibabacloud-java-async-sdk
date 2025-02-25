// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The forwarding rules.</p>
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        public DescribeRulesResponseBody build() {
            return new DescribeRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRulesResponseBody</p>
     */
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
             * <p>The cookie that is configured on the backend server.</p>
             * <p>The value must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces. It cannot start with a dollar sign ($).</p>
             * <blockquote>
             * <p> If you set the <strong>StickySession</strong> parameter to <strong>on</strong> and the <strong>StickySessionType</strong> parameter to <strong>server</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The timeout period of a cookie. Valid values: <strong>1 to 86400</strong>. Unit: seconds.</p>
             * <blockquote>
             * <p> If you set the <strong>StickySession</strong> parameter to <strong>on</strong> and the <strong>StickySessionType</strong> parameter to <strong>insert</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>The requested domain name specified in the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether health checks are enabled.</p>
             * <p>Valid values: <strong>on</strong> and <strong>off</strong>.</p>
             * <blockquote>
             * <p> If you set the <strong>ListenerSync</strong> parameter to <strong>off</strong>, this parameter is required. If you set the parameter to <strong>on</strong>, the configuration of the listener is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The backend port that is used for health checks.</p>
             * <p>Valid values: <strong>1 to 65535</strong>.</p>
             * <blockquote>
             * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required. If this parameter is empty but <strong>HealthCheck</strong> is set to <strong>on</strong>, the listener port is used for health checks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks. Valid values:</p>
             * <ul>
             * <li><p><strong>$_ip</strong>: The private IP address of the backend server.</p>
             * <p>If you do not set this parameter or set the parameter to $_ip, the SLB instance uses the private IP address of each backend server as the domain name for health checks.</p>
             * </li>
             * <li><p><strong>domain</strong>: The domain name must be 1 to 80 characters in length. The domain name can contain only letters, digits, periods (.),and hyphens (-).</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.domain.com">www.domain.com</a></p>
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * <p>The HTTP status code that indicates a successful health check. Multiple HTTP status codes are separated by commas (,). Default value: <strong>http_2xx</strong>.</p>
             * <p>Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
             * <blockquote>
             * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>http_3xx</p>
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * <p>The time interval between two consecutive health checks.</p>
             * <p>Valid values: <strong>1 to 50</strong>. Unit: seconds.</p>
             * <blockquote>
             * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The timeout period of a health check response. If a backend ECS instance does not respond within the specified timeout period, the ECS instance fails the health check. Unit: seconds</p>
             * <p>Valid values: <strong>1 to 300</strong>.</p>
             * <blockquote>
             * <p> When you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter takes effect.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The URI that is used for health checks.</p>
             * <blockquote>
             * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/example</p>
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * <p>Specifies the number of successful health checks that must be consecutively performed before a backend server can be declared healthy (from <strong>fail</strong> to <strong>success</strong>).</p>
             * <p>Valid values: <strong>2 to 10</strong>.</p>
             * <blockquote>
             * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>Indicates whether the forwarding rule uses the scheduling algorithm, session persistence, and health check configurations of the listener.</p>
             * <p>Valid values: <strong>on</strong> and <strong>off</strong>.</p>
             * <ul>
             * <li><strong>off</strong>: does not use the configurations of the listener. You can customize health check and session persistence configurations for the forwarding rule.</li>
             * <li><strong>on</strong>: uses the configurations of the listener.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder listenerSync(String listenerSync) {
                this.listenerSync = listenerSync;
                return this;
            }

            /**
             * <p>The ID of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-tybqi6****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the forwarding rule. The name must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (_).</p>
             * <blockquote>
             * <p> The name of each forwarding rule must be unique within a listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Rule2</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The scheduling algorithm. Valid values:</p>
             * <ul>
             * <li><strong>wrr</strong> (default): Backend servers that have higher weights receive more requests than backend servers that have lower weights.</li>
             * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
             * </ul>
             * <blockquote>
             * <p> If you set the <strong>ListenerSync</strong> parameter to <strong>off</strong>, this parameter is required. If you set the parameter to <strong>on</strong>, the configuration of the listener is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>wrr</p>
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * <p>Specifies whether to enable session persistence.</p>
             * <p>Valid values: <strong>on</strong> and <strong>off</strong>.</p>
             * <blockquote>
             * <p> If you set the <strong>ListenerSync</strong> parameter to <strong>off</strong>, this parameter is required. If you set the parameter to <strong>on</strong>, the configuration of the listener is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder stickySession(String stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * <p>The method that is used to handle a cookie. Valid values:</p>
             * <ul>
             * <li><strong>insert</strong>: inserts a cookie into the response. SLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</li>
             * <li><strong>server</strong>: rewrites a cookie. When SLB detects a user-defined cookie, SLB overwrites the original cookie with the user-defined cookie. The next request from the client contains the user-defined cookie, and the listener distributes the request to the recorded backend server.</li>
             * </ul>
             * <blockquote>
             * <p> If you set the <strong>StickySession</strong> parameter to <strong>on</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>insert</p>
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * <p>Specifies the number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy (from <strong>success</strong> to <strong>fail</strong>).</p>
             * <p>Valid values: <strong>2 to 10</strong></p>
             * <blockquote>
             * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * <p>The requested path specified in the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>/cache</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The ID of the destination vServer group specified in the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-6cejjzl****</p>
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
    /**
     * 
     * {@link DescribeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

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
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
