// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsGtmAccessStrategyRequest} extends {@link RequestModel}
 *
 * <p>AddDnsGtmAccessStrategyRequest</p>
 */
public class AddDnsGtmAccessStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultAddrPool")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < DefaultAddrPool> defaultAddrPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultAddrPoolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultLatencyOptimization")
    private String defaultLatencyOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultLbaStrategy")
    private String defaultLbaStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultMaxReturnAddrNum")
    @com.aliyun.core.annotation.Validation(maximum = 8, minimum = 1)
    private Integer defaultMaxReturnAddrNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultMinAvailableAddrNum")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 400, minimum = 1)
    private Integer defaultMinAvailableAddrNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverAddrPool")
    private java.util.List < FailoverAddrPool> failoverAddrPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolType")
    private String failoverAddrPoolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverLatencyOptimization")
    private String failoverLatencyOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverLbaStrategy")
    private String failoverLbaStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverMaxReturnAddrNum")
    @com.aliyun.core.annotation.Validation(maximum = 8, minimum = 1)
    private Integer failoverMaxReturnAddrNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverMinAvailableAddrNum")
    @com.aliyun.core.annotation.Validation(maximum = 400, minimum = 1)
    private Integer failoverMinAvailableAddrNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lines")
    private String lines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyName;

    private AddDnsGtmAccessStrategyRequest(Builder builder) {
        super(builder);
        this.defaultAddrPool = builder.defaultAddrPool;
        this.defaultAddrPoolType = builder.defaultAddrPoolType;
        this.defaultLatencyOptimization = builder.defaultLatencyOptimization;
        this.defaultLbaStrategy = builder.defaultLbaStrategy;
        this.defaultMaxReturnAddrNum = builder.defaultMaxReturnAddrNum;
        this.defaultMinAvailableAddrNum = builder.defaultMinAvailableAddrNum;
        this.failoverAddrPool = builder.failoverAddrPool;
        this.failoverAddrPoolType = builder.failoverAddrPoolType;
        this.failoverLatencyOptimization = builder.failoverLatencyOptimization;
        this.failoverLbaStrategy = builder.failoverLbaStrategy;
        this.failoverMaxReturnAddrNum = builder.failoverMaxReturnAddrNum;
        this.failoverMinAvailableAddrNum = builder.failoverMinAvailableAddrNum;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.lines = builder.lines;
        this.strategyMode = builder.strategyMode;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnsGtmAccessStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultAddrPool
     */
    public java.util.List < DefaultAddrPool> getDefaultAddrPool() {
        return this.defaultAddrPool;
    }

    /**
     * @return defaultAddrPoolType
     */
    public String getDefaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }

    /**
     * @return defaultLatencyOptimization
     */
    public String getDefaultLatencyOptimization() {
        return this.defaultLatencyOptimization;
    }

    /**
     * @return defaultLbaStrategy
     */
    public String getDefaultLbaStrategy() {
        return this.defaultLbaStrategy;
    }

    /**
     * @return defaultMaxReturnAddrNum
     */
    public Integer getDefaultMaxReturnAddrNum() {
        return this.defaultMaxReturnAddrNum;
    }

    /**
     * @return defaultMinAvailableAddrNum
     */
    public Integer getDefaultMinAvailableAddrNum() {
        return this.defaultMinAvailableAddrNum;
    }

    /**
     * @return failoverAddrPool
     */
    public java.util.List < FailoverAddrPool> getFailoverAddrPool() {
        return this.failoverAddrPool;
    }

    /**
     * @return failoverAddrPoolType
     */
    public String getFailoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }

    /**
     * @return failoverLatencyOptimization
     */
    public String getFailoverLatencyOptimization() {
        return this.failoverLatencyOptimization;
    }

    /**
     * @return failoverLbaStrategy
     */
    public String getFailoverLbaStrategy() {
        return this.failoverLbaStrategy;
    }

    /**
     * @return failoverMaxReturnAddrNum
     */
    public Integer getFailoverMaxReturnAddrNum() {
        return this.failoverMaxReturnAddrNum;
    }

    /**
     * @return failoverMinAvailableAddrNum
     */
    public Integer getFailoverMinAvailableAddrNum() {
        return this.failoverMinAvailableAddrNum;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lines
     */
    public String getLines() {
        return this.lines;
    }

    /**
     * @return strategyMode
     */
    public String getStrategyMode() {
        return this.strategyMode;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    public static final class Builder extends Request.Builder<AddDnsGtmAccessStrategyRequest, Builder> {
        private java.util.List < DefaultAddrPool> defaultAddrPool; 
        private String defaultAddrPoolType; 
        private String defaultLatencyOptimization; 
        private String defaultLbaStrategy; 
        private Integer defaultMaxReturnAddrNum; 
        private Integer defaultMinAvailableAddrNum; 
        private java.util.List < FailoverAddrPool> failoverAddrPool; 
        private String failoverAddrPoolType; 
        private String failoverLatencyOptimization; 
        private String failoverLbaStrategy; 
        private Integer failoverMaxReturnAddrNum; 
        private Integer failoverMinAvailableAddrNum; 
        private String instanceId; 
        private String lang; 
        private String lines; 
        private String strategyMode; 
        private String strategyName; 

        private Builder() {
            super();
        } 

        private Builder(AddDnsGtmAccessStrategyRequest request) {
            super(request);
            this.defaultAddrPool = request.defaultAddrPool;
            this.defaultAddrPoolType = request.defaultAddrPoolType;
            this.defaultLatencyOptimization = request.defaultLatencyOptimization;
            this.defaultLbaStrategy = request.defaultLbaStrategy;
            this.defaultMaxReturnAddrNum = request.defaultMaxReturnAddrNum;
            this.defaultMinAvailableAddrNum = request.defaultMinAvailableAddrNum;
            this.failoverAddrPool = request.failoverAddrPool;
            this.failoverAddrPoolType = request.failoverAddrPoolType;
            this.failoverLatencyOptimization = request.failoverLatencyOptimization;
            this.failoverLbaStrategy = request.failoverLbaStrategy;
            this.failoverMaxReturnAddrNum = request.failoverMaxReturnAddrNum;
            this.failoverMinAvailableAddrNum = request.failoverMinAvailableAddrNum;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.lines = request.lines;
            this.strategyMode = request.strategyMode;
            this.strategyName = request.strategyName;
        } 

        /**
         * The address pools in the primary address pool set.
         */
        public Builder defaultAddrPool(java.util.List < DefaultAddrPool> defaultAddrPool) {
            this.putQueryParameter("DefaultAddrPool", defaultAddrPool);
            this.defaultAddrPool = defaultAddrPool;
            return this;
        }

        /**
         * The type of the primary address pool. Valid values:
         * <p>
         * 
         * *   IPV4
         * *   IPV6
         * *   DOMAIN
         */
        public Builder defaultAddrPoolType(String defaultAddrPoolType) {
            this.putQueryParameter("DefaultAddrPoolType", defaultAddrPoolType);
            this.defaultAddrPoolType = defaultAddrPoolType;
            return this;
        }

        /**
         * Specifies whether to enable DNS resolution with optimal latency for the primary address pool set. Valid values:
         * <p>
         * 
         * *   OPEN
         * *   CLOSE
         */
        public Builder defaultLatencyOptimization(String defaultLatencyOptimization) {
            this.putQueryParameter("DefaultLatencyOptimization", defaultLatencyOptimization);
            this.defaultLatencyOptimization = defaultLatencyOptimization;
            return this;
        }

        /**
         * The load balancing policy of the primary address pool set. Valid values:
         * <p>
         * 
         * *   ALL_RR: returns all addresses.
         * *   RATIO: returns addresses by weight.
         */
        public Builder defaultLbaStrategy(String defaultLbaStrategy) {
            this.putQueryParameter("DefaultLbaStrategy", defaultLbaStrategy);
            this.defaultLbaStrategy = defaultLbaStrategy;
            return this;
        }

        /**
         * The maximum number of addresses returned from the primary address pool set.
         */
        public Builder defaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
            this.putQueryParameter("DefaultMaxReturnAddrNum", defaultMaxReturnAddrNum);
            this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
            return this;
        }

        /**
         * The minimum number of available addresses in the primary address pool set.
         */
        public Builder defaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
            this.putQueryParameter("DefaultMinAvailableAddrNum", defaultMinAvailableAddrNum);
            this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
            return this;
        }

        /**
         * The address pools in the secondary address pool set. If no address pool exists in the secondary address pool set, set this parameter to EMPTY.
         */
        public Builder failoverAddrPool(java.util.List < FailoverAddrPool> failoverAddrPool) {
            this.putQueryParameter("FailoverAddrPool", failoverAddrPool);
            this.failoverAddrPool = failoverAddrPool;
            return this;
        }

        /**
         * The type of the secondary address pool. Valid values:
         * <p>
         * 
         * *   IPV4
         * *   IPV6
         * *   DOMAIN
         */
        public Builder failoverAddrPoolType(String failoverAddrPoolType) {
            this.putQueryParameter("FailoverAddrPoolType", failoverAddrPoolType);
            this.failoverAddrPoolType = failoverAddrPoolType;
            return this;
        }

        /**
         * Specifies whether to enable DNS resolution with optimal latency for the secondary address pool set. Valid values:
         * <p>
         * 
         * *   OPEN
         * *   CLOSE
         */
        public Builder failoverLatencyOptimization(String failoverLatencyOptimization) {
            this.putQueryParameter("FailoverLatencyOptimization", failoverLatencyOptimization);
            this.failoverLatencyOptimization = failoverLatencyOptimization;
            return this;
        }

        /**
         * The load balancing policy of the secondary address pool set. Valid values:
         * <p>
         * 
         * *   ALL_RR: returns all addresses.
         * *   RATIO: returns addresses by weight.
         */
        public Builder failoverLbaStrategy(String failoverLbaStrategy) {
            this.putQueryParameter("FailoverLbaStrategy", failoverLbaStrategy);
            this.failoverLbaStrategy = failoverLbaStrategy;
            return this;
        }

        /**
         * The maximum number of addresses returned from the secondary address pool set.
         */
        public Builder failoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
            this.putQueryParameter("FailoverMaxReturnAddrNum", failoverMaxReturnAddrNum);
            this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
            return this;
        }

        /**
         * The minimum number of available addresses in the secondary address pool set.
         */
        public Builder failoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
            this.putQueryParameter("FailoverMinAvailableAddrNum", failoverMinAvailableAddrNum);
            this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The Domain Name System (DNS) request source. For example: `["default", "drpeng"]` indicates Global and Dr. Peng Group.
         */
        public Builder lines(String lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        /**
         * The type of the access policy. Valid values:
         * <p>
         * 
         * *   GEO: geographical location-based access policy
         * *   LATENCY: latency-based access policy
         */
        public Builder strategyMode(String strategyMode) {
            this.putQueryParameter("StrategyMode", strategyMode);
            this.strategyMode = strategyMode;
            return this;
        }

        /**
         * The name of the access policy.
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public AddDnsGtmAccessStrategyRequest build() {
            return new AddDnsGtmAccessStrategyRequest(this);
        } 

    } 

    public static class DefaultAddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        private DefaultAddrPool(Builder builder) {
            this.id = builder.id;
            this.lbaWeight = builder.lbaWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultAddrPool create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lbaWeight
         */
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public static final class Builder {
            private String id; 
            private Integer lbaWeight; 

            /**
             * The ID of the address pool in the primary address pool set.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The weight of the address pool in the primary address pool set.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            public DefaultAddrPool build() {
                return new DefaultAddrPool(this);
            } 

        } 

    }
    public static class FailoverAddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        private FailoverAddrPool(Builder builder) {
            this.id = builder.id;
            this.lbaWeight = builder.lbaWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailoverAddrPool create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lbaWeight
         */
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public static final class Builder {
            private String id; 
            private Integer lbaWeight; 

            /**
             * The ID of the address pool in the secondary address pool set.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The weight of the address pool in the secondary address pool set.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            public FailoverAddrPool build() {
                return new FailoverAddrPool(this);
            } 

        } 

    }
}
