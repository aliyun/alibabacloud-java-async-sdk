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
 * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>ListLoadBalancersResponseBody</p>
 */
public class ListLoadBalancersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadBalancers")
    private java.util.List<LoadBalancers> loadBalancers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListLoadBalancersResponseBody(Builder builder) {
        this.loadBalancers = builder.loadBalancers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadBalancers
     */
    public java.util.List<LoadBalancers> getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<LoadBalancers> loadBalancers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListLoadBalancersResponseBody model) {
            this.loadBalancers = model.loadBalancers;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>An array format that returns the list of load balancers.</p>
         */
        public Builder loadBalancers(java.util.List<LoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * <p>Page number, same as the PageNumber in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListLoadBalancersResponseBody build() {
            return new ListLoadBalancersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
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
             * <p>Whether to fail over across pools.</p>
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
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
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
             * <p>The number of consecutive failed probes required to consider the target unhealthy, such as 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder consecutiveDown(Integer consecutiveDown) {
                this.consecutiveDown = consecutiveDown;
                return this;
            }

            /**
             * <p>The number of consecutive successful probes required to consider the target healthy, such as 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder consecutiveUp(Integer consecutiveUp) {
                this.consecutiveUp = consecutiveUp;
                return this;
            }

            /**
             * <p>The expected status codes, such as 200,202, indicating successful HTTP responses.</p>
             * 
             * <strong>example:</strong>
             * <p>200,202</p>
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
             * <p>The header information included in the probe, such as HTTP headers.</p>
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
             * <p>The interval for the health check, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The method for the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
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
             * <p>Application health check timeout, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The type of monitor protocol, such as HTTP, used for health checks. When the value is <code>off</code>, it indicates that no check will be performed.</p>
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
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
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
             * <p>Weight configuration for each backend server pool, where the key is the pool ID and the value is the weight coefficient. The weight coefficient represents the proportion of relative traffic distribution.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder defaultWeight(Integer defaultWeight) {
                this.defaultWeight = defaultWeight;
                return this;
            }

            /**
             * <p>Weight configuration for each backend server pool, where the key is the pool ID and the value is the weight coefficient.</p>
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
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
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
             * <p>The Content-Type field in the HTTP Header.</p>
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
             * <p>Status code.</p>
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
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
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
             * <p>Executes a specified response after matching the rule.</p>
             */
            public Builder fixedResponse(FixedResponse fixedResponse) {
                this.fixedResponse = fixedResponse;
                return this;
            }

            /**
             * <p>Modifies the corresponding load balancer configuration after matching the rule. The fields in this configuration will override the corresponding fields in the load balancer configuration.</p>
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
             * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding global configurations. There are two usage scenarios: </p>
             * <ul>
             * <li>Match all incoming requests: set the value to true </li>
             * <li>Match specific requests: set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
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
             * <p>The switch for the rule. This parameter is not required when adding a global configuration. Possible values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <p>The name of the rule. This parameter is not required when adding a global configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>r2</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The execution order of the rule. The higher the value, the higher the priority.</p>
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
             * <li>false: No, which is the default value.</li>
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
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class LoadBalancers extends TeaModel {
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

        private LoadBalancers(Builder builder) {
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

        public static LoadBalancers create() {
            return builder().build();
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
            private java.util.List<Rules> rules; 
            private String sessionAffinity; 
            private Long siteId; 
            private String status; 
            private String steeringPolicy; 
            private Object subRegionPools; 
            private Integer ttl; 

            private Builder() {
            } 

            private Builder(LoadBalancers model) {
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
                this.rules = model.rules;
                this.sessionAffinity = model.sessionAffinity;
                this.siteId = model.siteId;
                this.status = model.status;
                this.steeringPolicy = model.steeringPolicy;
                this.subRegionPools = model.subRegionPools;
                this.ttl = model.ttl;
            } 

            /**
             * <p>Cross-pool failover configuration.</p>
             */
            public Builder adaptiveRouting(AdaptiveRouting adaptiveRouting) {
                this.adaptiveRouting = adaptiveRouting;
                return this;
            }

            /**
             * <p>List of default address pool IDs.</p>
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
             * <p>Whether the load balancer is enabled.</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The fallback pool ID, to which traffic will be redirected if all other pools are unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>96228666776****</p>
             */
            public Builder fallbackPool(Long fallbackPool) {
                this.fallbackPool = fallbackPool;
                return this;
            }

            /**
             * <p>The unique identifier ID of the load balancer.</p>
             * 
             * <strong>example:</strong>
             * <p>998676487607104</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Monitor configuration.</p>
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
             * <p>Weighted round-robin configuration, used to control the traffic distribution weights among different pools.</p>
             */
            public Builder randomSteering(RandomSteering randomSteering) {
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
                this.regionPools = regionPools;
                return this;
            }

            /**
             * <p>List of rule configurations, used to define behaviors under specific conditions.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
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
                this.sessionAffinity = sessionAffinity;
                return this;
            }

            /**
             * <p>The site ID to which the load balancer belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1159101787****</p>
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
             * <p>Address pools corresponding to secondary regions. When multiple secondary regions share a set of address pools, the keys can be concatenated with commas.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
             */
            public Builder subRegionPools(Object subRegionPools) {
                this.subRegionPools = subRegionPools;
                return this;
            }

            /**
             * <p>The TTL value, which is the DNS record&quot;s time to live, with a default value of 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
}
