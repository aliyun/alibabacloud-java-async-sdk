// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
 */
public class DescribeDnsGtmAccessStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessMode")
    private String accessMode;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolGroupStatus")
    private String defaultAddrPoolGroupStatus;

    @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolType")
    private String defaultAddrPoolType;

    @com.aliyun.core.annotation.NameInMap("DefaultAddrPools")
    private DefaultAddrPools defaultAddrPools;

    @com.aliyun.core.annotation.NameInMap("DefaultAvailableAddrNum")
    private Integer defaultAvailableAddrNum;

    @com.aliyun.core.annotation.NameInMap("DefaultLatencyOptimization")
    private String defaultLatencyOptimization;

    @com.aliyun.core.annotation.NameInMap("DefaultLbaStrategy")
    private String defaultLbaStrategy;

    @com.aliyun.core.annotation.NameInMap("DefaultMaxReturnAddrNum")
    private Integer defaultMaxReturnAddrNum;

    @com.aliyun.core.annotation.NameInMap("DefaultMinAvailableAddrNum")
    private Integer defaultMinAvailableAddrNum;

    @com.aliyun.core.annotation.NameInMap("EffectiveAddrPoolGroupType")
    private String effectiveAddrPoolGroupType;

    @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolGroupStatus")
    private String failoverAddrPoolGroupStatus;

    @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolType")
    private String failoverAddrPoolType;

    @com.aliyun.core.annotation.NameInMap("FailoverAddrPools")
    private FailoverAddrPools failoverAddrPools;

    @com.aliyun.core.annotation.NameInMap("FailoverAvailableAddrNum")
    private Integer failoverAvailableAddrNum;

    @com.aliyun.core.annotation.NameInMap("FailoverLatencyOptimization")
    private String failoverLatencyOptimization;

    @com.aliyun.core.annotation.NameInMap("FailoverLbaStrategy")
    private String failoverLbaStrategy;

    @com.aliyun.core.annotation.NameInMap("FailoverMaxReturnAddrNum")
    private Integer failoverMaxReturnAddrNum;

    @com.aliyun.core.annotation.NameInMap("FailoverMinAvailableAddrNum")
    private Integer failoverMinAvailableAddrNum;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Lines")
    private Lines lines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    @com.aliyun.core.annotation.NameInMap("StrategyMode")
    private String strategyMode;

    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    private DescribeDnsGtmAccessStrategyResponseBody(Builder builder) {
        this.accessMode = builder.accessMode;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.defaultAddrPoolGroupStatus = builder.defaultAddrPoolGroupStatus;
        this.defaultAddrPoolType = builder.defaultAddrPoolType;
        this.defaultAddrPools = builder.defaultAddrPools;
        this.defaultAvailableAddrNum = builder.defaultAvailableAddrNum;
        this.defaultLatencyOptimization = builder.defaultLatencyOptimization;
        this.defaultLbaStrategy = builder.defaultLbaStrategy;
        this.defaultMaxReturnAddrNum = builder.defaultMaxReturnAddrNum;
        this.defaultMinAvailableAddrNum = builder.defaultMinAvailableAddrNum;
        this.effectiveAddrPoolGroupType = builder.effectiveAddrPoolGroupType;
        this.failoverAddrPoolGroupStatus = builder.failoverAddrPoolGroupStatus;
        this.failoverAddrPoolType = builder.failoverAddrPoolType;
        this.failoverAddrPools = builder.failoverAddrPools;
        this.failoverAvailableAddrNum = builder.failoverAvailableAddrNum;
        this.failoverLatencyOptimization = builder.failoverLatencyOptimization;
        this.failoverLbaStrategy = builder.failoverLbaStrategy;
        this.failoverMaxReturnAddrNum = builder.failoverMaxReturnAddrNum;
        this.failoverMinAvailableAddrNum = builder.failoverMinAvailableAddrNum;
        this.instanceId = builder.instanceId;
        this.lines = builder.lines;
        this.requestId = builder.requestId;
        this.strategyId = builder.strategyId;
        this.strategyMode = builder.strategyMode;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAccessStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessMode
     */
    public String getAccessMode() {
        return this.accessMode;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return defaultAddrPoolGroupStatus
     */
    public String getDefaultAddrPoolGroupStatus() {
        return this.defaultAddrPoolGroupStatus;
    }

    /**
     * @return defaultAddrPoolType
     */
    public String getDefaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }

    /**
     * @return defaultAddrPools
     */
    public DefaultAddrPools getDefaultAddrPools() {
        return this.defaultAddrPools;
    }

    /**
     * @return defaultAvailableAddrNum
     */
    public Integer getDefaultAvailableAddrNum() {
        return this.defaultAvailableAddrNum;
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
     * @return effectiveAddrPoolGroupType
     */
    public String getEffectiveAddrPoolGroupType() {
        return this.effectiveAddrPoolGroupType;
    }

    /**
     * @return failoverAddrPoolGroupStatus
     */
    public String getFailoverAddrPoolGroupStatus() {
        return this.failoverAddrPoolGroupStatus;
    }

    /**
     * @return failoverAddrPoolType
     */
    public String getFailoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }

    /**
     * @return failoverAddrPools
     */
    public FailoverAddrPools getFailoverAddrPools() {
        return this.failoverAddrPools;
    }

    /**
     * @return failoverAvailableAddrNum
     */
    public Integer getFailoverAvailableAddrNum() {
        return this.failoverAvailableAddrNum;
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
     * @return lines
     */
    public Lines getLines() {
        return this.lines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
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

    public static final class Builder {
        private String accessMode; 
        private String createTime; 
        private Long createTimestamp; 
        private String defaultAddrPoolGroupStatus; 
        private String defaultAddrPoolType; 
        private DefaultAddrPools defaultAddrPools; 
        private Integer defaultAvailableAddrNum; 
        private String defaultLatencyOptimization; 
        private String defaultLbaStrategy; 
        private Integer defaultMaxReturnAddrNum; 
        private Integer defaultMinAvailableAddrNum; 
        private String effectiveAddrPoolGroupType; 
        private String failoverAddrPoolGroupStatus; 
        private String failoverAddrPoolType; 
        private FailoverAddrPools failoverAddrPools; 
        private Integer failoverAvailableAddrNum; 
        private String failoverLatencyOptimization; 
        private String failoverLbaStrategy; 
        private Integer failoverMaxReturnAddrNum; 
        private Integer failoverMinAvailableAddrNum; 
        private String instanceId; 
        private Lines lines; 
        private String requestId; 
        private String strategyId; 
        private String strategyMode; 
        private String strategyName; 

        /**
         * <p>The primary/secondary switchover policy for address pool groups. Valid values:</p>
         * <ul>
         * <li>AUTO: performs automatic switchover between the primary and secondary address pool groups upon failures.</li>
         * <li>DEFAULT: uses the primary address pool group.</li>
         * <li>FAILOVER: uses the secondary address pool group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder accessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }

        /**
         * <p>The time when the access policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-09T00:10Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the access policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1533773400000</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The status of the primary address pool group. Valid values:</p>
         * <ul>
         * <li>AVAILABLE: available</li>
         * <li>NOT_AVAILABLE: unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder defaultAddrPoolGroupStatus(String defaultAddrPoolGroupStatus) {
            this.defaultAddrPoolGroupStatus = defaultAddrPoolGroupStatus;
            return this;
        }

        /**
         * <p>The type of the primary address pool. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * <li>DOMAIN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder defaultAddrPoolType(String defaultAddrPoolType) {
            this.defaultAddrPoolType = defaultAddrPoolType;
            return this;
        }

        /**
         * <p>The address pools in the primary address pool group.</p>
         */
        public Builder defaultAddrPools(DefaultAddrPools defaultAddrPools) {
            this.defaultAddrPools = defaultAddrPools;
            return this;
        }

        /**
         * <p>The number of available addresses in the primary address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defaultAvailableAddrNum(Integer defaultAvailableAddrNum) {
            this.defaultAvailableAddrNum = defaultAvailableAddrNum;
            return this;
        }

        /**
         * <p>Indicates whether scheduling optimization for latency resolution was enabled for the primary address pool group. Valid values:</p>
         * <ul>
         * <li>OPEN: enabled</li>
         * <li>CLOSE: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder defaultLatencyOptimization(String defaultLatencyOptimization) {
            this.defaultLatencyOptimization = defaultLatencyOptimization;
            return this;
        }

        /**
         * <p>The load balancing policy of the primary address pool group. Valid values:</p>
         * <ul>
         * <li>ALL_RR: returns all addresses.</li>
         * <li>RATIO: returns addresses by weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all_rr</p>
         */
        public Builder defaultLbaStrategy(String defaultLbaStrategy) {
            this.defaultLbaStrategy = defaultLbaStrategy;
            return this;
        }

        /**
         * <p>The maximum number of addresses returned from the primary address pool group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
            this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
            return this;
        }

        /**
         * <p>The minimum number of available addresses in the primary address pool group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
            this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
            return this;
        }

        /**
         * <p>The type of the active address pool group. Valid values:</p>
         * <ul>
         * <li>DEFAULT: the primary address pool group</li>
         * <li>FAILOVER: the secondary address pool group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder effectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
            this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
            return this;
        }

        /**
         * <p>The status of the secondary address pool group. Valid values:</p>
         * <ul>
         * <li>AVAILABLE: available</li>
         * <li>NOT_AVAILABLE: unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder failoverAddrPoolGroupStatus(String failoverAddrPoolGroupStatus) {
            this.failoverAddrPoolGroupStatus = failoverAddrPoolGroupStatus;
            return this;
        }

        /**
         * <p>The type of the secondary address pool. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * <li>DOMAIN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder failoverAddrPoolType(String failoverAddrPoolType) {
            this.failoverAddrPoolType = failoverAddrPoolType;
            return this;
        }

        /**
         * <p>The address pools in the secondary address pool group.</p>
         */
        public Builder failoverAddrPools(FailoverAddrPools failoverAddrPools) {
            this.failoverAddrPools = failoverAddrPools;
            return this;
        }

        /**
         * <p>The number of available addresses in the secondary address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failoverAvailableAddrNum(Integer failoverAvailableAddrNum) {
            this.failoverAvailableAddrNum = failoverAvailableAddrNum;
            return this;
        }

        /**
         * <p>Indicates whether scheduling optimization for latency resolution was enabled for the secondary address pool group. Valid values:</p>
         * <ul>
         * <li>OPEN: enabled</li>
         * <li>CLOSE: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder failoverLatencyOptimization(String failoverLatencyOptimization) {
            this.failoverLatencyOptimization = failoverLatencyOptimization;
            return this;
        }

        /**
         * <p>The load balancing policy of the secondary address pool group. Valid values:</p>
         * <ul>
         * <li>ALL_RR: returns all addresses.</li>
         * <li>RATIO: returns addresses by weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all_rr</p>
         */
        public Builder failoverLbaStrategy(String failoverLbaStrategy) {
            this.failoverLbaStrategy = failoverLbaStrategy;
            return this;
        }

        /**
         * <p>The maximum number of addresses returned from the secondary address pool group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
            this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
            return this;
        }

        /**
         * <p>The minimum number of available addresses in the secondary address pool group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
            this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
            return this;
        }

        /**
         * <p>The ID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The source regions.</p>
         */
        public Builder lines(Lines lines) {
            this.lines = lines;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BA1608CA-834C-4E63-8682-8AF0B11ED72D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>strategyId1</p>
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The type of the access policy. Valid values:</p>
         * <ul>
         * <li>GEO: geographical location-based</li>
         * <li>LATENCY: latency-based</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>geo</p>
         */
        public Builder strategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }

        /**
         * <p>The name of the access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>strategyName1</p>
         */
        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }

        public DescribeDnsGtmAccessStrategyResponseBody build() {
            return new DescribeDnsGtmAccessStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
     */
    public static class DefaultAddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrCount")
        private Integer addrCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DefaultAddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.id = builder.id;
            this.lbaWeight = builder.lbaWeight;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultAddrPool create() {
            return builder().build();
        }

        /**
         * @return addrCount
         */
        public Integer getAddrCount() {
            return this.addrCount;
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

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer addrCount; 
            private String id; 
            private Integer lbaWeight; 
            private String name; 

            /**
             * <p>The number of addresses in the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * <p>The ID of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pool1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The weight of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * <p>The name of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DefaultAddrPool build() {
                return new DefaultAddrPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
     */
    public static class DefaultAddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultAddrPool")
        private java.util.List < DefaultAddrPool> defaultAddrPool;

        private DefaultAddrPools(Builder builder) {
            this.defaultAddrPool = builder.defaultAddrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultAddrPools create() {
            return builder().build();
        }

        /**
         * @return defaultAddrPool
         */
        public java.util.List < DefaultAddrPool> getDefaultAddrPool() {
            return this.defaultAddrPool;
        }

        public static final class Builder {
            private java.util.List < DefaultAddrPool> defaultAddrPool; 

            /**
             * DefaultAddrPool.
             */
            public Builder defaultAddrPool(java.util.List < DefaultAddrPool> defaultAddrPool) {
                this.defaultAddrPool = defaultAddrPool;
                return this;
            }

            public DefaultAddrPools build() {
                return new DefaultAddrPools(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
     */
    public static class FailoverAddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrCount")
        private Integer addrCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private FailoverAddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.id = builder.id;
            this.lbaWeight = builder.lbaWeight;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailoverAddrPool create() {
            return builder().build();
        }

        /**
         * @return addrCount
         */
        public Integer getAddrCount() {
            return this.addrCount;
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

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer addrCount; 
            private String id; 
            private Integer lbaWeight; 
            private String name; 

            /**
             * <p>The number of addresses in the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * <p>The ID of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pool1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The weight of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * <p>The name of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FailoverAddrPool build() {
                return new FailoverAddrPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
     */
    public static class FailoverAddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailoverAddrPool")
        private java.util.List < FailoverAddrPool> failoverAddrPool;

        private FailoverAddrPools(Builder builder) {
            this.failoverAddrPool = builder.failoverAddrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailoverAddrPools create() {
            return builder().build();
        }

        /**
         * @return failoverAddrPool
         */
        public java.util.List < FailoverAddrPool> getFailoverAddrPool() {
            return this.failoverAddrPool;
        }

        public static final class Builder {
            private java.util.List < FailoverAddrPool> failoverAddrPool; 

            /**
             * FailoverAddrPool.
             */
            public Builder failoverAddrPool(java.util.List < FailoverAddrPool> failoverAddrPool) {
                this.failoverAddrPool = failoverAddrPool;
                return this;
            }

            public FailoverAddrPools build() {
                return new FailoverAddrPools(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
     */
    public static class Line extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupCode")
        private String groupCode;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LineCode")
        private String lineCode;

        @com.aliyun.core.annotation.NameInMap("LineName")
        private String lineName;

        private Line(Builder builder) {
            this.groupCode = builder.groupCode;
            this.groupName = builder.groupName;
            this.lineCode = builder.lineCode;
            this.lineName = builder.lineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Line create() {
            return builder().build();
        }

        /**
         * @return groupCode
         */
        public String getGroupCode() {
            return this.groupCode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lineCode
         */
        public String getLineCode() {
            return this.lineCode;
        }

        /**
         * @return lineName
         */
        public String getLineName() {
            return this.lineName;
        }

        public static final class Builder {
            private String groupCode; 
            private String groupName; 
            private String lineCode; 
            private String lineName; 

            /**
             * <p>The code of the source region group.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * <p>The name of the source region group.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The line code of the source region.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * <p>The line name of the source region.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder lineName(String lineName) {
                this.lineName = lineName;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
     */
    public static class Lines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private java.util.List < Line> line;

        private Lines(Builder builder) {
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lines create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public java.util.List < Line> getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List < Line> line; 

            /**
             * Line.
             */
            public Builder line(java.util.List < Line> line) {
                this.line = line;
                return this;
            }

            public Lines build() {
                return new Lines(this);
            } 

        } 

    }
}
