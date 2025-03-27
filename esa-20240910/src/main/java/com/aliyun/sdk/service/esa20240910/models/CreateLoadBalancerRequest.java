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
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdaptiveRouting")
    private AdaptiveRouting adaptiveRouting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultPools")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> defaultPools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackPool")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fallbackPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Monitor")
    @com.aliyun.core.annotation.Validation(required = true)
    private Monitor monitor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String steeringPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubRegionPools")
    private Object subRegionPools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private CreateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.adaptiveRouting = builder.adaptiveRouting;
        this.defaultPools = builder.defaultPools;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.fallbackPool = builder.fallbackPool;
        this.monitor = builder.monitor;
        this.name = builder.name;
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

    public static CreateLoadBalancerRequest create() {
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

    public static final class Builder extends Request.Builder<CreateLoadBalancerRequest, Builder> {
        private AdaptiveRouting adaptiveRouting; 
        private java.util.List<Long> defaultPools; 
        private String description; 
        private Boolean enabled; 
        private Long fallbackPool; 
        private Monitor monitor; 
        private String name; 
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

        private Builder(CreateLoadBalancerRequest request) {
            super(request);
            this.adaptiveRouting = request.adaptiveRouting;
            this.defaultPools = request.defaultPools;
            this.description = request.description;
            this.enabled = request.enabled;
            this.fallbackPool = request.fallbackPool;
            this.monitor = request.monitor;
            this.name = request.name;
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
         * <p>Configuration for failover across pools.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder adaptiveRouting(AdaptiveRouting adaptiveRouting) {
            String adaptiveRoutingShrink = shrink(adaptiveRouting, "AdaptiveRouting", "json");
            this.putQueryParameter("AdaptiveRouting", adaptiveRoutingShrink);
            this.adaptiveRouting = adaptiveRouting;
            return this;
        }

        /**
         * <p>List of default pools.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder defaultPools(java.util.List<Long> defaultPools) {
            String defaultPoolsShrink = shrink(defaultPools, "DefaultPools", "json");
            this.putQueryParameter("DefaultPools", defaultPoolsShrink);
            this.defaultPools = defaultPools;
            return this;
        }

        /**
         * <p>Detailed description of the load balancer, for easier management and identification.</p>
         * 
         * <strong>example:</strong>
         * <p>测试负载均衡器描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Whether the load balancer is enabled.</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
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
         * <p>Fallback pool ID, where traffic will be directed when all other pools are unavailable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder fallbackPool(Long fallbackPool) {
            this.putQueryParameter("FallbackPool", fallbackPool);
            this.fallbackPool = fallbackPool;
            return this;
        }

        /**
         * <p>Monitor configuration, used for health checks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder monitor(Monitor monitor) {
            String monitorShrink = shrink(monitor, "Monitor", "json");
            this.putQueryParameter("Monitor", monitorShrink);
            this.monitor = monitor;
            return this;
        }

        /**
         * <p>The name of the load balancer, which must meet the domain name format validation and be a subdomain under the site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb.example.com</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Weighted round-robin configuration, used to control the traffic distribution weights among different pools.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder randomSteering(RandomSteering randomSteering) {
            String randomSteeringShrink = shrink(randomSteering, "RandomSteering", "json");
            this.putQueryParameter("RandomSteering", randomSteeringShrink);
            this.randomSteering = randomSteering;
            return this;
        }

        /**
         * <p>Address pools corresponding to primary regions.</p>
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
         * <p>Rule information.</p>
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
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>Session persistence, with possible values:</p>
         * <ul>
         * <li>off: Not enabled.</li>
         * <li>ip: Session persistence by IP.</li>
         * <li>cookie: Session persistence by cookie.</li>
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
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Load balancing strategy.</p>
         * <ul>
         * <li>geo: Geographic strategy.</li>
         * <li>random: Weighted round-robin.</li>
         * <li>order: Primary and backup method.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Address pools corresponding to secondary regions. When multiple secondary regions share a set of address pools, the keys can be concatenated with commas.</p>
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
         * <p>TTL value, the time-to-live for DNS records, with a default of 30 seconds. The value range is 10-600.</p>
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
        public CreateLoadBalancerRequest build() {
            return new CreateLoadBalancerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
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

            private Builder() {
            } 

            private Builder(AdaptiveRouting model) {
                this.failoverAcrossPools = model.failoverAcrossPools;
            } 

            /**
             * <p>Whether to failover across pools.</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
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
                this.path = model.path;
                this.port = model.port;
                this.timeout = model.timeout;
                this.type = model.type;
            } 

            /**
             * <p>Number of consecutive failed probes required to consider the target unhealthy, such as <code>5</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder consecutiveDown(Integer consecutiveDown) {
                this.consecutiveDown = consecutiveDown;
                return this;
            }

            /**
             * <p>Number of consecutive successful probes required to consider the target healthy, such as <code>3</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder consecutiveUp(Integer consecutiveUp) {
                this.consecutiveUp = consecutiveUp;
                return this;
            }

            /**
             * <p>Expected status codes, such as <code>200,202</code>, indicating successful HTTP responses.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder expectedCodes(String expectedCodes) {
                this.expectedCodes = expectedCodes;
                return this;
            }

            /**
             * <p>Whether to follow redirects.</p>
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
             * <p>Header information included in the probe, which is the HTTP header.</p>
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
             * <p>Monitoring interval, such as <code>60</code> seconds, representing the frequency of checks.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>Monitor request method, such as <code>GET</code>, which is a method in the HTTP protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>Monitor check path, such as <code>/healthcheck</code>, which is the HTTP request path.</p>
             * 
             * <strong>example:</strong>
             * <p>/health</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Origin server port.</p>
             * 
             * <strong>example:</strong>
             * <p>1921</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Application health check timeout, in seconds, with a value range of 1-10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>Monitor protocol type, such as HTTP, used for health checks. When set to <code>off</code>, no check is performed.</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * <li>SMTP</li>
             * <li>HTTPS</li>
             * <li>HTTP</li>
             * <li>ICMP Ping</li>
             * <li>off</li>
             * </ul>
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
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
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
             * <p>Default weight for round-robin, used for all pools that do not have a specific weight set. The value range is an integer between 0 and 100.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder defaultWeight(Integer defaultWeight) {
                this.defaultWeight = defaultWeight;
                return this;
            }

            /**
             * <p>Weight configuration for each backend server pool, with the key being the pool ID and the value being the weight coefficient. The weight coefficient represents the proportion of relative traffic distribution.</p>
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
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
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
             * <p>Content-Type field in the HTTP Header.</p>
             * 
             * <strong>example:</strong>
             * <p>application/octet-stream</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>Location field in the HTTP response.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/index.html">http://www.example.com/index.html</a></p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>Response body value.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello World!</p>
             */
            public Builder messageBody(String messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            /**
             * <p>Response status code.</p>
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
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
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
             * <p>Execute a specified response after matching the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;content_type&quot;: &quot;application/json&quot;, &quot;location&quot;: &quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;message_body&quot;: &quot;Testing Hello&quot;, &quot;status_code&quot;: 0}</p>
             */
            public Builder fixedResponse(FixedResponse fixedResponse) {
                this.fixedResponse = fixedResponse;
                return this;
            }

            /**
             * <p>Modify the corresponding load balancing configuration after matching the rule. The fields in the configuration will override the corresponding fields in the load balancer configuration.</p>
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
             * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding global configurations. There are two usage scenarios:</p>
             * <ul>
             * <li>Match all incoming requests: Set the value to true</li>
             * <li>Match specific requests: Set the value to a custom expression, e.g., (http.host eq &quot;video.example.com&quot;)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>(http.request.method eq &quot;GET&quot; and http.request.version eq &quot;HTTP/1.0&quot;) or (ip.geoip.country eq &quot;CN&quot;) or (http.host eq &quot;<a href="http://www.example.com">www.example.com</a>&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Rule switch. This parameter does not need to be set when adding global configurations. Value range:</p>
             * <ul>
             * <li>on: Enable.</li>
             * <li>off: Disable.</li>
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
             * <p>Rule name. This parameter does not need to be set when adding global configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The execution order of the rule. It can be left blank, in which case the rules will be executed in the order they appear in the list. If specified, it should be an integer greater than 0, with higher values indicating a higher priority for execution.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Whether to terminate the execution of subsequent rules.</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No, default value.</li>
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
