// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoadBalancerRequest</p>
 */
public class UpdateLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdaptiveRouting")
    private AdaptiveRouting adaptiveRouting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultPools")
    private java.util.List<Long> defaultPools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackPool")
    private Long fallbackPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Monitor")
    private Monitor monitor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RandomSteering")
    private RandomSteering randomSteering;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionPools")
    private Object regionPools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionAffinity")
    private String sessionAffinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionAffinityAttributes")
    private SessionAffinityAttributes sessionAffinityAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SteeringPolicy")
    private String steeringPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubRegionPools")
    private Object subRegionPools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private UpdateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.adaptiveRouting = builder.adaptiveRouting;
        this.defaultPools = builder.defaultPools;
        this.description = builder.description;
        this.fallbackPool = builder.fallbackPool;
        this.id = builder.id;
        this.monitor = builder.monitor;
        this.randomSteering = builder.randomSteering;
        this.regionPools = builder.regionPools;
        this.rules = builder.rules;
        this.sessionAffinity = builder.sessionAffinity;
        this.sessionAffinityAttributes = builder.sessionAffinityAttributes;
        this.siteId = builder.siteId;
        this.steeringPolicy = builder.steeringPolicy;
        this.subRegionPools = builder.subRegionPools;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adaptiveRouting
     */
    public AdaptiveRouting getAdaptiveRouting() {
        return this.adaptiveRouting;
    }

    /**
     * @return defaultPools
     */
    public java.util.List<Long> getDefaultPools() {
        return this.defaultPools;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fallbackPool
     */
    public Long getFallbackPool() {
        return this.fallbackPool;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return monitor
     */
    public Monitor getMonitor() {
        return this.monitor;
    }

    /**
     * @return randomSteering
     */
    public RandomSteering getRandomSteering() {
        return this.randomSteering;
    }

    /**
     * @return regionPools
     */
    public Object getRegionPools() {
        return this.regionPools;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return sessionAffinity
     */
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    /**
     * @return sessionAffinityAttributes
     */
    public SessionAffinityAttributes getSessionAffinityAttributes() {
        return this.sessionAffinityAttributes;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return steeringPolicy
     */
    public String getSteeringPolicy() {
        return this.steeringPolicy;
    }

    /**
     * @return subRegionPools
     */
    public Object getSubRegionPools() {
        return this.subRegionPools;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<UpdateLoadBalancerRequest, Builder> {
        private AdaptiveRouting adaptiveRouting; 
        private java.util.List<Long> defaultPools; 
        private String description; 
        private Long fallbackPool; 
        private Long id; 
        private Monitor monitor; 
        private RandomSteering randomSteering; 
        private Object regionPools; 
        private java.util.List<Rules> rules; 
        private String sessionAffinity; 
        private SessionAffinityAttributes sessionAffinityAttributes; 
        private Long siteId; 
        private String steeringPolicy; 
        private Object subRegionPools; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoadBalancerRequest request) {
            super(request);
            this.adaptiveRouting = request.adaptiveRouting;
            this.defaultPools = request.defaultPools;
            this.description = request.description;
            this.fallbackPool = request.fallbackPool;
            this.id = request.id;
            this.monitor = request.monitor;
            this.randomSteering = request.randomSteering;
            this.regionPools = request.regionPools;
            this.rules = request.rules;
            this.sessionAffinity = request.sessionAffinity;
            this.sessionAffinityAttributes = request.sessionAffinityAttributes;
            this.siteId = request.siteId;
            this.steeringPolicy = request.steeringPolicy;
            this.subRegionPools = request.subRegionPools;
            this.ttl = request.ttl;
        } 

        /**
         * AdaptiveRouting.
         */
        public Builder adaptiveRouting(AdaptiveRouting adaptiveRouting) {
            String adaptiveRoutingShrink = shrink(adaptiveRouting, "AdaptiveRouting", "json");
            this.putQueryParameter("AdaptiveRouting", adaptiveRoutingShrink);
            this.adaptiveRouting = adaptiveRouting;
            return this;
        }

        /**
         * DefaultPools.
         */
        public Builder defaultPools(java.util.List<Long> defaultPools) {
            String defaultPoolsShrink = shrink(defaultPools, "DefaultPools", "json");
            this.putQueryParameter("DefaultPools", defaultPoolsShrink);
            this.defaultPools = defaultPools;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FallbackPool.
         */
        public Builder fallbackPool(Long fallbackPool) {
            this.putQueryParameter("FallbackPool", fallbackPool);
            this.fallbackPool = fallbackPool;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95913670174****</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Monitor.
         */
        public Builder monitor(Monitor monitor) {
            String monitorShrink = shrink(monitor, "Monitor", "json");
            this.putQueryParameter("Monitor", monitorShrink);
            this.monitor = monitor;
            return this;
        }

        /**
         * RandomSteering.
         */
        public Builder randomSteering(RandomSteering randomSteering) {
            String randomSteeringShrink = shrink(randomSteering, "RandomSteering", "json");
            this.putQueryParameter("RandomSteering", randomSteeringShrink);
            this.randomSteering = randomSteering;
            return this;
        }

        /**
         * RegionPools.
         */
        public Builder regionPools(Object regionPools) {
            this.putQueryParameter("RegionPools", regionPools);
            this.regionPools = regionPools;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>Session persistence. Valid values:</p>
         * <ul>
         * <li>off:disables session persistence.</li>
         * <li>ip: enables session persistence by IP address.</li>
         * <li>cookie: disables session persistence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder sessionAffinity(String sessionAffinity) {
            this.putQueryParameter("SessionAffinity", sessionAffinity);
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * SessionAffinityAttributes.
         */
        public Builder sessionAffinityAttributes(SessionAffinityAttributes sessionAffinityAttributes) {
            String sessionAffinityAttributesShrink = shrink(sessionAffinityAttributes, "SessionAffinityAttributes", "json");
            this.putQueryParameter("SessionAffinityAttributes", sessionAffinityAttributesShrink);
            this.sessionAffinityAttributes = sessionAffinityAttributes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateLoadBalancer</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SteeringPolicy.
         */
        public Builder steeringPolicy(String steeringPolicy) {
            this.putQueryParameter("SteeringPolicy", steeringPolicy);
            this.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * SubRegionPools.
         */
        public Builder subRegionPools(Object subRegionPools) {
            this.putQueryParameter("SubRegionPools", subRegionPools);
            this.subRegionPools = subRegionPools;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateLoadBalancerRequest build() {
            return new UpdateLoadBalancerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerRequest</p>
     */
    public static class AdaptiveRouting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailoverAcrossPools")
        private Boolean failoverAcrossPools;

        private AdaptiveRouting(Builder builder) {
            this.failoverAcrossPools = builder.failoverAcrossPools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdaptiveRouting create() {
            return builder().build();
        }

        /**
         * @return failoverAcrossPools
         */
        public Boolean getFailoverAcrossPools() {
            return this.failoverAcrossPools;
        }

        public static final class Builder {
            private Boolean failoverAcrossPools; 

            /**
             * FailoverAcrossPools.
             */
            public Builder failoverAcrossPools(Boolean failoverAcrossPools) {
                this.failoverAcrossPools = failoverAcrossPools;
                return this;
            }

            public AdaptiveRouting build() {
                return new AdaptiveRouting(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerRequest</p>
     */
    public static class Monitor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsecutiveDown")
        private Integer consecutiveDown;

        @com.aliyun.core.annotation.NameInMap("ConsecutiveUp")
        private Integer consecutiveUp;

        @com.aliyun.core.annotation.NameInMap("ExpectedCodes")
        private String expectedCodes;

        @com.aliyun.core.annotation.NameInMap("FollowRedirects")
        private Boolean followRedirects;

        @com.aliyun.core.annotation.NameInMap("Header")
        private Object header;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Monitor(Builder builder) {
            this.consecutiveDown = builder.consecutiveDown;
            this.consecutiveUp = builder.consecutiveUp;
            this.expectedCodes = builder.expectedCodes;
            this.followRedirects = builder.followRedirects;
            this.header = builder.header;
            this.interval = builder.interval;
            this.method = builder.method;
            this.path = builder.path;
            this.port = builder.port;
            this.timeout = builder.timeout;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Monitor create() {
            return builder().build();
        }

        /**
         * @return consecutiveDown
         */
        public Integer getConsecutiveDown() {
            return this.consecutiveDown;
        }

        /**
         * @return consecutiveUp
         */
        public Integer getConsecutiveUp() {
            return this.consecutiveUp;
        }

        /**
         * @return expectedCodes
         */
        public String getExpectedCodes() {
            return this.expectedCodes;
        }

        /**
         * @return followRedirects
         */
        public Boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /**
         * @return header
         */
        public Object getHeader() {
            return this.header;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer consecutiveDown; 
            private Integer consecutiveUp; 
            private String expectedCodes; 
            private Boolean followRedirects; 
            private Object header; 
            private Integer interval; 
            private String method; 
            private String path; 
            private Integer port; 
            private Integer timeout; 
            private String type; 

            /**
             * ConsecutiveDown.
             */
            public Builder consecutiveDown(Integer consecutiveDown) {
                this.consecutiveDown = consecutiveDown;
                return this;
            }

            /**
             * ConsecutiveUp.
             */
            public Builder consecutiveUp(Integer consecutiveUp) {
                this.consecutiveUp = consecutiveUp;
                return this;
            }

            /**
             * ExpectedCodes.
             */
            public Builder expectedCodes(String expectedCodes) {
                this.expectedCodes = expectedCodes;
                return this;
            }

            /**
             * FollowRedirects.
             */
            public Builder followRedirects(Boolean followRedirects) {
                this.followRedirects = followRedirects;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(Object header) {
                this.header = header;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
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
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Monitor build() {
                return new Monitor(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerRequest</p>
     */
    public static class RandomSteering extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultWeight")
        private Integer defaultWeight;

        @com.aliyun.core.annotation.NameInMap("PoolWeights")
        private java.util.Map<String, Integer> poolWeights;

        private RandomSteering(Builder builder) {
            this.defaultWeight = builder.defaultWeight;
            this.poolWeights = builder.poolWeights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RandomSteering create() {
            return builder().build();
        }

        /**
         * @return defaultWeight
         */
        public Integer getDefaultWeight() {
            return this.defaultWeight;
        }

        /**
         * @return poolWeights
         */
        public java.util.Map<String, Integer> getPoolWeights() {
            return this.poolWeights;
        }

        public static final class Builder {
            private Integer defaultWeight; 
            private java.util.Map<String, Integer> poolWeights; 

            /**
             * DefaultWeight.
             */
            public Builder defaultWeight(Integer defaultWeight) {
                this.defaultWeight = defaultWeight;
                return this;
            }

            /**
             * PoolWeights.
             */
            public Builder poolWeights(java.util.Map<String, Integer> poolWeights) {
                this.poolWeights = poolWeights;
                return this;
            }

            public RandomSteering build() {
                return new RandomSteering(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerRequest</p>
     */
    public static class FixedResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("MessageBody")
        private String messageBody;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Integer statusCode;

        private FixedResponse(Builder builder) {
            this.contentType = builder.contentType;
            this.location = builder.location;
            this.messageBody = builder.messageBody;
            this.statusCode = builder.statusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixedResponse create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return messageBody
         */
        public String getMessageBody() {
            return this.messageBody;
        }

        /**
         * @return statusCode
         */
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public static final class Builder {
            private String contentType; 
            private String location; 
            private String messageBody; 
            private Integer statusCode; 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * MessageBody.
             */
            public Builder messageBody(String messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(Integer statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            public FixedResponse build() {
                return new FixedResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedResponse")
        private FixedResponse fixedResponse;

        @com.aliyun.core.annotation.NameInMap("Overrides")
        private Object overrides;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("Terminates")
        private Boolean terminates;

        private Rules(Builder builder) {
            this.fixedResponse = builder.fixedResponse;
            this.overrides = builder.overrides;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.terminates = builder.terminates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return fixedResponse
         */
        public FixedResponse getFixedResponse() {
            return this.fixedResponse;
        }

        /**
         * @return overrides
         */
        public Object getOverrides() {
            return this.overrides;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return ruleEnable
         */
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return terminates
         */
        public Boolean getTerminates() {
            return this.terminates;
        }

        public static final class Builder {
            private FixedResponse fixedResponse; 
            private Object overrides; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private Integer sequence; 
            private Boolean terminates; 

            /**
             * FixedResponse.
             */
            public Builder fixedResponse(FixedResponse fixedResponse) {
                this.fixedResponse = fixedResponse;
                return this;
            }

            /**
             * Overrides.
             */
            public Builder overrides(Object overrides) {
                this.overrides = overrides;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * RuleEnable.
             */
            public Builder ruleEnable(String ruleEnable) {
                this.ruleEnable = ruleEnable;
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
             * Sequence.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * Terminates.
             */
            public Builder terminates(Boolean terminates) {
                this.terminates = terminates;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerRequest</p>
     */
    public static class SessionAffinityAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SameSite")
        private String sameSite;

        @com.aliyun.core.annotation.NameInMap("Secure")
        private String secure;

        @com.aliyun.core.annotation.NameInMap("ZeroDowntimeFailover")
        private String zeroDowntimeFailover;

        private SessionAffinityAttributes(Builder builder) {
            this.sameSite = builder.sameSite;
            this.secure = builder.secure;
            this.zeroDowntimeFailover = builder.zeroDowntimeFailover;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionAffinityAttributes create() {
            return builder().build();
        }

        /**
         * @return sameSite
         */
        public String getSameSite() {
            return this.sameSite;
        }

        /**
         * @return secure
         */
        public String getSecure() {
            return this.secure;
        }

        /**
         * @return zeroDowntimeFailover
         */
        public String getZeroDowntimeFailover() {
            return this.zeroDowntimeFailover;
        }

        public static final class Builder {
            private String sameSite; 
            private String secure; 
            private String zeroDowntimeFailover; 

            /**
             * SameSite.
             */
            public Builder sameSite(String sameSite) {
                this.sameSite = sameSite;
                return this;
            }

            /**
             * Secure.
             */
            public Builder secure(String secure) {
                this.secure = secure;
                return this;
            }

            /**
             * ZeroDowntimeFailover.
             */
            public Builder zeroDowntimeFailover(String zeroDowntimeFailover) {
                this.zeroDowntimeFailover = zeroDowntimeFailover;
                return this;
            }

            public SessionAffinityAttributes build() {
                return new SessionAffinityAttributes(this);
            } 

        } 

    }
}
