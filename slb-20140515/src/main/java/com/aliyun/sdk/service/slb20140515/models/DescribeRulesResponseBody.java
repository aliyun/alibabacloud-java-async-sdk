// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRulesResponseBody</p>
 */
public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rules.
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
        @NameInMap("Cookie")
        private String cookie;

        @NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("HealthCheck")
        private String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("ListenerSync")
        private String listenerSync;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Scheduler")
        private String scheduler;

        @NameInMap("StickySession")
        private String stickySession;

        @NameInMap("StickySessionType")
        private String stickySessionType;

        @NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        @NameInMap("Url")
        private String url;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

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
            this.VServerGroupId = builder.VServerGroupId;
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
         * @return VServerGroupId
         */
        public String getVServerGroupId() {
            return this.VServerGroupId;
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
            private String VServerGroupId; 

            /**
             * Cookie.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * CookieTimeout.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
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
             * HealthCheck.
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * HealthCheckConnectPort.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * HealthCheckDomain.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * HealthCheckHttpCode.
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * HealthCheckInterval.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * HealthCheckTimeout.
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * HealthCheckURI.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * HealthyThreshold.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * ListenerSync.
             */
            public Builder listenerSync(String listenerSync) {
                this.listenerSync = listenerSync;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Scheduler.
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * StickySession.
             */
            public Builder stickySession(String stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * StickySessionType.
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * UnhealthyThreshold.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder VServerGroupId(String VServerGroupId) {
                this.VServerGroupId = VServerGroupId;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Rule")
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
