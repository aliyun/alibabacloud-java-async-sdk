// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsGtmAccessStrategyRequest} extends {@link RequestModel}
 *
 * <p>AddDnsGtmAccessStrategyRequest</p>
 */
public class AddDnsGtmAccessStrategyRequest extends Request {
    @Query
    @NameInMap("DefaultAddrPool")
    @Validation(required = true)
    private java.util.List < DefaultAddrPool> defaultAddrPool;

    @Query
    @NameInMap("DefaultAddrPoolType")
    @Validation(required = true)
    private String defaultAddrPoolType;

    @Query
    @NameInMap("DefaultLatencyOptimization")
    private String defaultLatencyOptimization;

    @Query
    @NameInMap("DefaultLbaStrategy")
    private String defaultLbaStrategy;

    @Query
    @NameInMap("DefaultMaxReturnAddrNum")
    @Validation(maximum = 8, minimum = 1)
    private Integer defaultMaxReturnAddrNum;

    @Query
    @NameInMap("DefaultMinAvailableAddrNum")
    @Validation(required = true, maximum = 400, minimum = 1)
    private Integer defaultMinAvailableAddrNum;

    @Query
    @NameInMap("FailoverAddrPool")
    private java.util.List < FailoverAddrPool> failoverAddrPool;

    @Query
    @NameInMap("FailoverAddrPoolType")
    private String failoverAddrPoolType;

    @Query
    @NameInMap("FailoverLatencyOptimization")
    private String failoverLatencyOptimization;

    @Query
    @NameInMap("FailoverLbaStrategy")
    private String failoverLbaStrategy;

    @Query
    @NameInMap("FailoverMaxReturnAddrNum")
    @Validation(maximum = 8, minimum = 1)
    private Integer failoverMaxReturnAddrNum;

    @Query
    @NameInMap("FailoverMinAvailableAddrNum")
    @Validation(maximum = 400, minimum = 1)
    private Integer failoverMinAvailableAddrNum;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Lines")
    private String lines;

    @Query
    @NameInMap("StrategyMode")
    @Validation(required = true)
    private String strategyMode;

    @Query
    @NameInMap("StrategyName")
    @Validation(required = true)
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
         * DefaultAddrPool.
         */
        public Builder defaultAddrPool(java.util.List < DefaultAddrPool> defaultAddrPool) {
            this.putQueryParameter("DefaultAddrPool", defaultAddrPool);
            this.defaultAddrPool = defaultAddrPool;
            return this;
        }

        /**
         * The load balancing policy of the primary address pool group. Valid values:
         * <p>
         * 
         * *   ALL_RR: returns all addresses.
         * *   RATIO: returns addresses by weight.
         */
        public Builder defaultAddrPoolType(String defaultAddrPoolType) {
            this.putQueryParameter("DefaultAddrPoolType", defaultAddrPoolType);
            this.defaultAddrPoolType = defaultAddrPoolType;
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
        public Builder defaultLatencyOptimization(String defaultLatencyOptimization) {
            this.putQueryParameter("DefaultLatencyOptimization", defaultLatencyOptimization);
            this.defaultLatencyOptimization = defaultLatencyOptimization;
            return this;
        }

        /**
         * The minimum number of available addresses in the primary address pool group.
         */
        public Builder defaultLbaStrategy(String defaultLbaStrategy) {
            this.putQueryParameter("DefaultLbaStrategy", defaultLbaStrategy);
            this.defaultLbaStrategy = defaultLbaStrategy;
            return this;
        }

        /**
         * Specifies whether to enable scheduling optimization for latency resolution for the primary address pool group. Valid values:
         * <p>
         * 
         * *   OPEN: enable
         * *   CLOSE: disable
         */
        public Builder defaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
            this.putQueryParameter("DefaultMaxReturnAddrNum", defaultMaxReturnAddrNum);
            this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
            return this;
        }

        /**
         * The maximum number of addresses returned from the primary address pool group.
         */
        public Builder defaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
            this.putQueryParameter("DefaultMinAvailableAddrNum", defaultMinAvailableAddrNum);
            this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
            return this;
        }

        /**
         * FailoverAddrPool.
         */
        public Builder failoverAddrPool(java.util.List < FailoverAddrPool> failoverAddrPool) {
            this.putQueryParameter("FailoverAddrPool", failoverAddrPool);
            this.failoverAddrPool = failoverAddrPool;
            return this;
        }

        /**
         * The load balancing policy of the secondary address pool group. Valid values:
         * <p>
         * 
         * *   ALL_RR: returns all addresses.
         * *   RATIO: returns addresses by weight.
         */
        public Builder failoverAddrPoolType(String failoverAddrPoolType) {
            this.putQueryParameter("FailoverAddrPoolType", failoverAddrPoolType);
            this.failoverAddrPoolType = failoverAddrPoolType;
            return this;
        }

        /**
         * The type of the access policy. Valid values:
         * <p>
         * 
         * *   GEO: geographical location-based
         * *   LATENCY: latency-based
         */
        public Builder failoverLatencyOptimization(String failoverLatencyOptimization) {
            this.putQueryParameter("FailoverLatencyOptimization", failoverLatencyOptimization);
            this.failoverLatencyOptimization = failoverLatencyOptimization;
            return this;
        }

        /**
         * The minimum number of available addresses in the secondary address pool group.
         */
        public Builder failoverLbaStrategy(String failoverLbaStrategy) {
            this.putQueryParameter("FailoverLbaStrategy", failoverLbaStrategy);
            this.failoverLbaStrategy = failoverLbaStrategy;
            return this;
        }

        /**
         * Specifies whether to enable scheduling optimization for latency resolution for the secondary address pool group. Valid values:
         * <p>
         * 
         * *   OPEN: enable
         * *   CLOSE: disable
         */
        public Builder failoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
            this.putQueryParameter("FailoverMaxReturnAddrNum", failoverMaxReturnAddrNum);
            this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
            return this;
        }

        /**
         * The maximum number of addresses returned from the secondary address pool group.
         */
        public Builder failoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
            this.putQueryParameter("FailoverMinAvailableAddrNum", failoverMinAvailableAddrNum);
            this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
            return this;
        }

        /**
         * The name of the access policy.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
        public Builder lines(String lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        /**
         * The weight of the address pool in the primary address pool group.
         */
        public Builder strategyMode(String strategyMode) {
            this.putQueryParameter("StrategyMode", strategyMode);
            this.strategyMode = strategyMode;
            return this;
        }

        /**
         * The line codes of source regions. For example: `["default", "drpeng"]` indicates Global and Dr. Peng Telecom & Media Group.
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
        @NameInMap("Id")
        private String id;

        @NameInMap("LbaWeight")
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
             * The weight of the address pool in the secondary address pool group.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the address pool in the primary address pool group.
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
        @NameInMap("Id")
        private String id;

        @NameInMap("LbaWeight")
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
             * The ID of the access policy.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the address pool in the secondary address pool group.
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
