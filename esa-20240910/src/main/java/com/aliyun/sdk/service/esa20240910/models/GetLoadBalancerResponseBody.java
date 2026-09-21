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
 * {@link GetLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoadBalancerResponseBody</p>
 */
public class GetLoadBalancerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdaptiveRouting")
    private AdaptiveRouting adaptiveRouting;

    @com.aliyun.core.annotation.NameInMap("DefaultPools")
    private java.util.List<Long> defaultPools;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("FallbackPool")
    private Long fallbackPool;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Monitor")
    private Monitor monitor;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RandomSteering")
    private RandomSteering randomSteering;

    @com.aliyun.core.annotation.NameInMap("RegionPools")
    private Object regionPools;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("SessionAffinity")
    private String sessionAffinity;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SteeringPolicy")
    private String steeringPolicy;

    @com.aliyun.core.annotation.NameInMap("SubRegionPools")
    private Object subRegionPools;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private GetLoadBalancerResponseBody(Builder builder) {
        this.adaptiveRouting = builder.adaptiveRouting;
        this.defaultPools = builder.defaultPools;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.fallbackPool = builder.fallbackPool;
        this.id = builder.id;
        this.monitor = builder.monitor;
        this.name = builder.name;
        this.randomSteering = builder.randomSteering;
        this.regionPools = builder.regionPools;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.sessionAffinity = builder.sessionAffinity;
        this.siteId = builder.siteId;
        this.status = builder.status;
        this.steeringPolicy = builder.steeringPolicy;
        this.subRegionPools = builder.subRegionPools;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoadBalancerResponseBody create() {
        return builder().build();
    }

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
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder {
        private AdaptiveRouting adaptiveRouting; 
        private java.util.List<Long> defaultPools; 
        private String description; 
        private Boolean enabled; 
        private Long fallbackPool; 
        private Long id; 
        private Monitor monitor; 
        private String name; 
        private RandomSteering randomSteering; 
        private Object regionPools; 
        private String requestId; 
        private java.util.List<Rules> rules; 
        private String sessionAffinity; 
        private Long siteId; 
        private String status; 
        private String steeringPolicy; 
        private Object subRegionPools; 
        private Integer ttl; 

        private Builder() {
        } 

        private Builder(GetLoadBalancerResponseBody model) {
            this.adaptiveRouting = model.adaptiveRouting;
            this.defaultPools = model.defaultPools;
            this.description = model.description;
            this.enabled = model.enabled;
            this.fallbackPool = model.fallbackPool;
            this.id = model.id;
            this.monitor = model.monitor;
            this.name = model.name;
            this.randomSteering = model.randomSteering;
            this.regionPools = model.regionPools;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.sessionAffinity = model.sessionAffinity;
            this.siteId = model.siteId;
            this.status = model.status;
            this.steeringPolicy = model.steeringPolicy;
            this.subRegionPools = model.subRegionPools;
            this.ttl = model.ttl;
        } 

        /**
         * <p>The cross-origin pool back-to-origin configuration.</p>
         */
        public Builder adaptiveRouting(AdaptiveRouting adaptiveRouting) {
            this.adaptiveRouting = adaptiveRouting;
            return this;
        }

        /**
         * <p>The list of default pool IDs.</p>
         */
        public Builder defaultPools(java.util.List<Long> defaultPools) {
            this.defaultPools = defaultPools;
            return this;
        }

        /**
         * <p>The description of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the load balancer is enabled.</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The fallback pool ID. When all other pools are unavailable, traffic is redirected to this pool.</p>
         * 
         * <strong>example:</strong>
         * <p>96228666776****</p>
         */
        public Builder fallbackPool(Long fallbackPool) {
            this.fallbackPool = fallbackPool;
            return this;
        }

        /**
         * <p>The unique ID of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>99867648760****</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The monitor configuration.</p>
         */
        public Builder monitor(Monitor monitor) {
            this.monitor = monitor;
            return this;
        }

        /**
         * <p>The name of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>lb.example.com</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The weighted round-robin configuration, which controls the traffic distribution weight across different pools.</p>
         */
        public Builder randomSteering(RandomSteering randomSteering) {
            this.randomSteering = randomSteering;
            return this;
        }

        /**
         * <p>The pools mapped to primary regions.</p>
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
            this.regionPools = regionPools;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of rule configurations that define behaviors under specific conditions.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The session persistence setting. Valid values:</p>
         * <ul>
         * <li>off: disabled.</li>
         * <li>ip: IP-based session persistence.</li>
         * <li>cookie: cookie-based session persistence.</li>
         * <li>http_header: HTTP header-based session persistence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder sessionAffinity(String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * <p>The ID of the site to which the load balancer belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>11591017874****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The status of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The load balancing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder steeringPolicy(String steeringPolicy) {
            this.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * <p>The pools mapped to secondary regions. When multiple secondary regions share the same set of pools, you can concatenate multiple secondary regions with commas as the key.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
         */
        public Builder subRegionPools(Object subRegionPools) {
            this.subRegionPools = subRegionPools;
            return this;
        }

        /**
         * <p>The TTL value, which specifies the time-to-live of the DNS record. Default value: 30 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public GetLoadBalancerResponseBody build() {
            return new GetLoadBalancerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoadBalancerResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerResponseBody</p>
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
             * <p>Indicates whether failover across origin pools is enabled.</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder failoverAcrossPools(Boolean failoverAcrossPools) {
                this.failoverAcrossPools = failoverAcrossPools;
                return this;
            }

            /**
             * <p>Specifies whether to retry the next IP address when back-to-origin fails and the origin server is a domain name that resolves to multiple IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link GetLoadBalancerResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerResponseBody</p>
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
             * <p>The number of consecutive failed probes required to consider the check failed, such as <code>5</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder consecutiveDown(Integer consecutiveDown) {
                this.consecutiveDown = consecutiveDown;
                return this;
            }

            /**
             * <p>The number of consecutive successful probes required to consider the check successful, such as <code>3</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder consecutiveUp(Integer consecutiveUp) {
                this.consecutiveUp = consecutiveUp;
                return this;
            }

            /**
             * <p>The expected status codes for a successful HTTP response, such as 200,202.</p>
             * 
             * <strong>example:</strong>
             * <p>200,202</p>
             */
            public Builder expectedCodes(String expectedCodes) {
                this.expectedCodes = expectedCodes;
                return this;
            }

            /**
             * <p>Indicates whether to follow redirects.</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
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
             * <p>The HTTP header information included in the probe request.</p>
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
             * <p>The health check interval. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The health check method.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The region where the probe nodes are located. Default value: Global.</p>
             * <ul>
             * <li>Global: worldwide.</li>
             * <li>ChineseMainland: the Chinese mainland.</li>
             * <li>OutsideChineseMainland: worldwide (excluding the Chinese mainland).</li>
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
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The target port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The health check timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The monitor protocol type, such as HTTP, used for health checks. A value of off indicates that no health check is performed.</p>
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
     * {@link GetLoadBalancerResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerResponseBody</p>
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
             * <p>The default round-robin weight applied to all pools that do not have an individually specified weight. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder defaultWeight(Integer defaultWeight) {
                this.defaultWeight = defaultWeight;
                return this;
            }

            /**
             * <p>The weight configuration for each backend server pool. The key is the pool ID and the value is the weight coefficient. The weight coefficient represents the relative proportion of traffic distribution.</p>
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
     * {@link GetLoadBalancerResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerResponseBody</p>
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
             * <p>The Content-Type field in the HTTP header.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The location field in the HTTP response.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/index.html">http://www.example.com/index.html</a></p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The response body value.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello World.</p>
             */
            public Builder messageBody(String messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            /**
             * <p>The status code.</p>
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
     * {@link GetLoadBalancerResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerResponseBody</p>
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
             * <p>The fixed response content returned when the rule is matched.</p>
             */
            public Builder fixedResponse(FixedResponse fixedResponse) {
                this.fixedResponse = fixedResponse;
                return this;
            }

            /**
             * <p>The load balancing configuration overrides applied to matching requests. The configured fields override the corresponding fields in the load balancer configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *             &quot;adaptive_routing&quot;: {
             *                 &quot;failover_across_pools&quot;: true
             *             },
             *             &quot;sub_region_pools&quot;: {
             *                 &quot;GB&quot;: [
             *                     96228666776****
             *                 ],
             *                 &quot;US&quot;: [
             *                     96228666776****
             *                 ]
             *             },
             *             &quot;default_pools&quot;: [
             *                 96228666776****,
             *                 96228666776****
             *             ],
             *             &quot;fallback_pool&quot;: 96228666776****,
             *             &quot;location_strategy&quot;: {
             *                 &quot;mode&quot;: &quot;resolver_ip&quot;,
             *                 &quot;prefer_ecs&quot;: &quot;always&quot;
             *             },
             *             &quot;random_steering&quot;: {
             *                 &quot;default_weight&quot;: 30,
             *                 &quot;pool_weights&quot;: {
             *                     &quot;96228666776****&quot;: 70,
             *                     &quot;96228666776****&quot;: 80
             *                 }
             *             },
             *             &quot;region_pools&quot;: {
             *                 &quot;ENAM&quot;: [
             *                     96228666776****,
             *                     92843536908****
             *                 ],
             *                 &quot;WNAM&quot;: [
             *                     92843536908****
             *                 ]
             *             },
             *             &quot;session_affinity&quot;: &quot;cookie&quot;,
             *             &quot;session_affinity_attributes&quot;: {
             *                 &quot;drain_duration&quot;: 100,
             *                 &quot;headers&quot;: [&quot;none&quot;],
             *                 &quot;require_all_headers&quot;: false,
             *                 &quot;samesite&quot;: &quot;Auto&quot;,
             *                 &quot;secure&quot;: &quot;Auto&quot;,
             *                 &quot;zero_downtime_failover&quot;: &quot;sticky&quot;
             *             },
             *             &quot;session_affinity_ttl&quot;: 1800,
             *             &quot;steering_policy&quot;: &quot;dynamic_latency&quot;,
             *             &quot;ttl&quot;: 30
             *         }</p>
             */
            public Builder overrides(Object overrides) {
                this.overrides = overrides;
                return this;
            }

            /**
             * <p>The rule content, which uses conditional expressions to match user requests. This parameter is not required when you add a global configuration. Two scenarios are supported:</p>
             * <ul>
             * <li>Match all incoming requests: Set the value to true.</li>
             * <li>Match specific requests: Set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http.request.uri.path contains &quot;/testing&quot;</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>The rule switch. This parameter is not required when you add a global configuration. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder ruleEnable(String ruleEnable) {
                this.ruleEnable = ruleEnable;
                return this;
            }

            /**
             * <p>The rule name. This parameter is not required when you add a global configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>r2</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule execution order. A larger value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Indicates whether to terminate the execution of subsequent rules.</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No. This is the default value.</li>
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
