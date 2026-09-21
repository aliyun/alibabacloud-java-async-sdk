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
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

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
        this.enabled = builder.enabled;
        this.fallbackPool = builder.fallbackPool;
        this.id = builder.id;
        this.monitor = builder.monitor;
        this.randomSteering = builder.randomSteering;
        this.regionPools = builder.regionPools;
        this.rules = builder.rules;
        this.sessionAffinity = builder.sessionAffinity;
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
        private Boolean enabled; 
        private Long fallbackPool; 
        private Long id; 
        private Monitor monitor; 
        private RandomSteering randomSteering; 
        private Object regionPools; 
        private java.util.List<Rules> rules; 
        private String sessionAffinity; 
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
            this.enabled = request.enabled;
            this.fallbackPool = request.fallbackPool;
            this.id = request.id;
            this.monitor = request.monitor;
            this.randomSteering = request.randomSteering;
            this.regionPools = request.regionPools;
            this.rules = request.rules;
            this.sessionAffinity = request.sessionAffinity;
            this.siteId = request.siteId;
            this.steeringPolicy = request.steeringPolicy;
            this.subRegionPools = request.subRegionPools;
            this.ttl = request.ttl;
        } 

        /**
         * <p>Configures origin-pull behavior across address pools.</p>
         */
        public Builder adaptiveRouting(AdaptiveRouting adaptiveRouting) {
            String adaptiveRoutingShrink = shrink(adaptiveRouting, "AdaptiveRouting", "json");
            this.putQueryParameter("AdaptiveRouting", adaptiveRoutingShrink);
            this.adaptiveRouting = adaptiveRouting;
            return this;
        }

        /**
         * <p>A list of default address pool IDs.</p>
         */
        public Builder defaultPools(java.util.List<Long> defaultPools) {
            String defaultPoolsShrink = shrink(defaultPools, "DefaultPools", "json");
            this.putQueryParameter("DefaultPools", defaultPoolsShrink);
            this.defaultPools = defaultPools;
            return this;
        }

        /**
         * <p>An optional description of the load balancer for easier identification and management.</p>
         * 
         * <strong>example:</strong>
         * <p>Load balancer description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the load balancer is enabled.</p>
         * <ul>
         * <li><p><code>true</code>: The load balancer is enabled.</p>
         * </li>
         * <li><p><code>false</code>: The load balancer is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The ID of the fallback address pool. Traffic is routed to this pool when all other address pools are unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>96228666776****</p>
         */
        public Builder fallbackPool(Long fallbackPool) {
            this.putQueryParameter("FallbackPool", fallbackPool);
            this.fallbackPool = fallbackPool;
            return this;
        }

        /**
         * <p>The ID of the load balancer. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2868897.html">ListLoadBalancers</a> API operation.</p>
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
         * <p>The health check monitor configuration.</p>
         */
        public Builder monitor(Monitor monitor) {
            String monitorShrink = shrink(monitor, "Monitor", "json");
            this.putQueryParameter("Monitor", monitorShrink);
            this.monitor = monitor;
            return this;
        }

        /**
         * <p>The configuration for weighted round-robin. This setting controls the weight of traffic distributed to different address pools.</p>
         */
        public Builder randomSteering(RandomSteering randomSteering) {
            String randomSteeringShrink = shrink(randomSteering, "RandomSteering", "json");
            this.putQueryParameter("RandomSteering", randomSteeringShrink);
            this.randomSteering = randomSteering;
            return this;
        }

        /**
         * <p>A map of primary regions to their corresponding address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ENAM&quot;: [
         *     12345678****
         *   ],
         *   &quot;WNAM&quot;: [
         *     23456789****,
         *     23456789****
         *   ]
         * }</p>
         */
        public Builder regionPools(Object regionPools) {
            this.putQueryParameter("RegionPools", regionPools);
            this.regionPools = regionPools;
            return this;
        }

        /**
         * <p>A list of rules that define behavior overrides for specific conditions.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The method for session affinity, which ensures that requests from the same client are routed to the same origin server. Valid values:</p>
         * <ul>
         * <li><p><code>off</code>: Disables session affinity.</p>
         * </li>
         * <li><p><code>ip</code>: Enables session affinity based on the client IP address.</p>
         * </li>
         * <li><p><code>cookie</code>: Enables session affinity based on a cookie.</p>
         * </li>
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
         * <p>The ID of the Site. You can obtain this ID by calling the <a href="~~ListSites~~">ListSites</a> API operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1159101787****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The traffic steering policy, which determines how traffic is distributed among the address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder steeringPolicy(String steeringPolicy) {
            this.putQueryParameter("SteeringPolicy", steeringPolicy);
            this.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * <p>A map of secondary regions to their corresponding address pools. To assign the same address pools to multiple secondary regions, combine their codes into a single, comma-separated key.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
         */
        public Builder subRegionPools(Object subRegionPools) {
            this.putQueryParameter("SubRegionPools", subRegionPools);
            this.subRegionPools = subRegionPools;
            return this;
        }

        /**
         * <p>The Time to Live (TTL) for the DNS record, in seconds. The default is 30. The value must be between 10 and 600, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
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

        @com.aliyun.core.annotation.NameInMap("OriginLevelRetry")
        private Boolean originLevelRetry;

        private AdaptiveRouting(Builder builder) {
            this.failoverAcrossPools = builder.failoverAcrossPools;
            this.originLevelRetry = builder.originLevelRetry;
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

        /**
         * @return originLevelRetry
         */
        public Boolean getOriginLevelRetry() {
            return this.originLevelRetry;
        }

        public static final class Builder {
            private Boolean failoverAcrossPools; 
            private Boolean originLevelRetry; 

            private Builder() {
            } 

            private Builder(AdaptiveRouting model) {
                this.failoverAcrossPools = model.failoverAcrossPools;
                this.originLevelRetry = model.originLevelRetry;
            } 

            /**
             * <p>Specifies whether to perform origin-pull across address pools.</p>
             * <ul>
             * <li><p><code>true</code>: Enables origin-pull across address pools.</p>
             * </li>
             * <li><p><code>false</code>: Disables origin-pull across address pools.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder failoverAcrossPools(Boolean failoverAcrossPools) {
                this.failoverAcrossPools = failoverAcrossPools;
                return this;
            }

            /**
             * OriginLevelRetry.
             */
            public Builder originLevelRetry(Boolean originLevelRetry) {
                this.originLevelRetry = originLevelRetry;
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

        @com.aliyun.core.annotation.NameInMap("MonitoringRegion")
        private String monitoringRegion;

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
            this.monitoringRegion = builder.monitoringRegion;
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
         * @return monitoringRegion
         */
        public String getMonitoringRegion() {
            return this.monitoringRegion;
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
            private String monitoringRegion; 
            private String path; 
            private Integer port; 
            private Integer timeout; 
            private String type; 

            private Builder() {
            } 

            private Builder(Monitor model) {
                this.consecutiveDown = model.consecutiveDown;
                this.consecutiveUp = model.consecutiveUp;
                this.expectedCodes = model.expectedCodes;
                this.followRedirects = model.followRedirects;
                this.header = model.header;
                this.interval = model.interval;
                this.method = model.method;
                this.monitoringRegion = model.monitoringRegion;
                this.path = model.path;
                this.port = model.port;
                this.timeout = model.timeout;
                this.type = model.type;
            } 

            /**
             * <p>The number of consecutive failed health checks required to declare an origin server unhealthy. For example, <code>5</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder consecutiveDown(Integer consecutiveDown) {
                this.consecutiveDown = consecutiveDown;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks required to declare an origin server healthy. For example, <code>3</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder consecutiveUp(Integer consecutiveUp) {
                this.consecutiveUp = consecutiveUp;
                return this;
            }

            /**
             * <p>The expected HTTP status codes that indicate a healthy response. For example, <code>200,202</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>200,202</p>
             */
            public Builder expectedCodes(String expectedCodes) {
                this.expectedCodes = expectedCodes;
                return this;
            }

            /**
             * <p>Specifies whether the health check monitor follows HTTP redirections.</p>
             * <ul>
             * <li><p><code>true</code>: The monitor follows HTTP redirections.</p>
             * </li>
             * <li><p><code>false</code>: The monitor does not follow HTTP redirections.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder followRedirects(Boolean followRedirects) {
                this.followRedirects = followRedirects;
                return this;
            }

            /**
             * <p>The HTTP request headers to send with each health check.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;host&quot;: [
             *             &quot;example1.com&quot;,
             *             &quot;example2.com&quot;
             *         ]
             *     }</p>
             */
            public Builder header(Object header) {
                this.header = header;
                return this;
            }

            /**
             * <p>The interval in seconds between each health check. For example, <code>60</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The HTTP method to use for the health check. For example, <code>GET</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The regions from which the health checks are performed. The default value is <code>Global</code>.</p>
             * <ul>
             * <li><p><code>Global</code>: From probe locations worldwide.</p>
             * </li>
             * <li><p><code>ChineseMainland</code>: From probe locations within the Chinese mainland.</p>
             * </li>
             * <li><p><code>OutsideChineseMainland</code>: From probe locations outside the Chinese mainland.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Global</p>
             */
            public Builder monitoringRegion(String monitoringRegion) {
                this.monitoringRegion = monitoringRegion;
                return this;
            }

            /**
             * <p>The path on the origin server to request for the health check. For example, <code>/healthcheck</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>/health</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port on the origin server to use for the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The timeout for the health check, in seconds. The value must be between 1 and 10, inclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The protocol to use for the health check, such as <code>HTTP</code>. If you set this to <code>off</code>, no health check is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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

            private Builder() {
            } 

            private Builder(RandomSteering model) {
                this.defaultWeight = model.defaultWeight;
                this.poolWeights = model.poolWeights;
            } 

            /**
             * <p>The default weight applied to all address pools that do not have a specific weight defined. The value must be an integer from 0 to 100, inclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder defaultWeight(Integer defaultWeight) {
                this.defaultWeight = defaultWeight;
                return this;
            }

            /**
             * <p>A map of pool IDs to their corresponding weights. These weights determine the proportion of traffic routed to each backend server pool.</p>
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

            private Builder() {
            } 

            private Builder(FixedResponse model) {
                this.contentType = model.contentType;
                this.location = model.location;
                this.messageBody = model.messageBody;
                this.statusCode = model.statusCode;
            } 

            /**
             * <p>The value of the <code>Content-Type</code> field in the HTTP response header.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The value of the <code>Location</code> field in the HTTP response header. This is typically used for redirections.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/index.html">http://www.example.com/index.html</a></p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The content of the response body.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello World!</p>
             */
            public Builder messageBody(String messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            /**
             * <p>The HTTP status code of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.fixedResponse = model.fixedResponse;
                this.overrides = model.overrides;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.terminates = model.terminates;
            } 

            /**
             * <p>The fixed response to return when the rule\&quot;s condition is met.</p>
             */
            public Builder fixedResponse(FixedResponse fixedResponse) {
                this.fixedResponse = fixedResponse;
                return this;
            }

            /**
             * <p>The settings to override for requests that match this rule\&quot;s condition. These settings take precedence over the load balancer\&quot;s main configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *             &quot;adaptive_routing&quot;: {
             *                 &quot;failover_across_pools&quot;: true
             *             },
             *             &quot;sub_region_pools&quot;: {
             *                 &quot;AL,AT&quot;: [
             *                     92298024898****,
             *                     92304347804****
             *                 ],
             *                 &quot;BG,BY&quot;: [
             *                     92298024898****
             *                 ]
             *             },
             *             &quot;default_pools&quot;: [
             *                 92298024898****,
             *                 92304347804****
             *             ],
             *             &quot;fallback_pool&quot;: 92298024898****,
             *             &quot;location_strategy&quot;: {
             *                 &quot;mode&quot;: &quot;resolver_ip&quot;,
             *                 &quot;prefer_ecs&quot;: &quot;always&quot;
             *             },
             *             &quot;random_steering&quot;: {
             *                 &quot;default_weight&quot;: 0.3,
             *                 &quot;pool_weights&quot;: {
             *                     &quot;92298024898****&quot;: 0.7,
             *                     &quot;92304347804****&quot;: 0.8
             *                 }
             *             },
             *             &quot;region_pools&quot;: {
             *                 &quot;CN,SEAS&quot;: [
             *                     92298024898****,
             *                     92304347804****
             *                 ],
             *                 &quot;SAF,SAS&quot;: [
             *                     92304347804****
             *                 ]
             *             },
             *             &quot;session_affinity&quot;: &quot;ip&quot;,
             *             &quot;steering_policy&quot;: &quot;geo&quot;,
             *             &quot;ttl&quot;: 30
             *         }</p>
             */
            public Builder overrides(Object overrides) {
                this.overrides = overrides;
                return this;
            }

            /**
             * <p>The content of the rule, specified as a conditional expression to match user requests. This parameter is not required when you configure global settings. Use cases:</p>
             * <ul>
             * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
             * </li>
             * <li><p>To match specific requests, set the value to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http.request.method eq &quot;GET&quot;</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether the rule is enabled. This parameter is not required when you configure global settings. Valid values:</p>
             * <ul>
             * <li><p><code>on</code>: Enabled.</p>
             * </li>
             * <li><p><code>off</code>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ruleEnable(String ruleEnable) {
                this.ruleEnable = ruleEnable;
                return this;
            }

            /**
             * <p>The name of the rule. This parameter is not required when you configure global settings.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The execution priority of the rule. This parameter is optional. If you do not specify this parameter, rules are executed in the order they are listed. If specified, the value must be an integer greater than 0. A larger value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Specifies whether to stop processing subsequent rules after this rule is matched.</p>
             * <ul>
             * <li><p><code>true</code>: Stop processing subsequent rules.</p>
             * </li>
             * <li><p><code>false</code>: Continue processing subsequent rules. This is the default value.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
}
