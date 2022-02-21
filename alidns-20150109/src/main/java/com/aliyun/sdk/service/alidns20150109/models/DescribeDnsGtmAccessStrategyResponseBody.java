// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAccessStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAccessStrategyResponseBody</p>
 */
public class DescribeDnsGtmAccessStrategyResponseBody extends TeaModel {
    @NameInMap("AccessMode")
    private String accessMode;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @NameInMap("DefaultAddrPoolGroupStatus")
    private String defaultAddrPoolGroupStatus;

    @NameInMap("DefaultAddrPoolType")
    private String defaultAddrPoolType;

    @NameInMap("DefaultAddrPools")
    private DefaultAddrPools defaultAddrPools;

    @NameInMap("DefaultAvailableAddrNum")
    private Integer defaultAvailableAddrNum;

    @NameInMap("DefaultLatencyOptimization")
    private String defaultLatencyOptimization;

    @NameInMap("DefaultLbaStrategy")
    private String defaultLbaStrategy;

    @NameInMap("DefaultMaxReturnAddrNum")
    private Integer defaultMaxReturnAddrNum;

    @NameInMap("DefaultMinAvailableAddrNum")
    private Integer defaultMinAvailableAddrNum;

    @NameInMap("EffectiveAddrPoolGroupType")
    private String effectiveAddrPoolGroupType;

    @NameInMap("FailoverAddrPoolGroupStatus")
    private String failoverAddrPoolGroupStatus;

    @NameInMap("FailoverAddrPoolType")
    private String failoverAddrPoolType;

    @NameInMap("FailoverAddrPools")
    private FailoverAddrPools failoverAddrPools;

    @NameInMap("FailoverAvailableAddrNum")
    private Integer failoverAvailableAddrNum;

    @NameInMap("FailoverLatencyOptimization")
    private String failoverLatencyOptimization;

    @NameInMap("FailoverLbaStrategy")
    private String failoverLbaStrategy;

    @NameInMap("FailoverMaxReturnAddrNum")
    private Integer failoverMaxReturnAddrNum;

    @NameInMap("FailoverMinAvailableAddrNum")
    private Integer failoverMinAvailableAddrNum;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Lines")
    private Lines lines;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StrategyId")
    private String strategyId;

    @NameInMap("StrategyMode")
    private String strategyMode;

    @NameInMap("StrategyName")
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
         * AccessMode.
         */
        public Builder accessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * DefaultAddrPoolGroupStatus.
         */
        public Builder defaultAddrPoolGroupStatus(String defaultAddrPoolGroupStatus) {
            this.defaultAddrPoolGroupStatus = defaultAddrPoolGroupStatus;
            return this;
        }

        /**
         * DefaultAddrPoolType.
         */
        public Builder defaultAddrPoolType(String defaultAddrPoolType) {
            this.defaultAddrPoolType = defaultAddrPoolType;
            return this;
        }

        /**
         * DefaultAddrPools.
         */
        public Builder defaultAddrPools(DefaultAddrPools defaultAddrPools) {
            this.defaultAddrPools = defaultAddrPools;
            return this;
        }

        /**
         * DefaultAvailableAddrNum.
         */
        public Builder defaultAvailableAddrNum(Integer defaultAvailableAddrNum) {
            this.defaultAvailableAddrNum = defaultAvailableAddrNum;
            return this;
        }

        /**
         * DefaultLatencyOptimization.
         */
        public Builder defaultLatencyOptimization(String defaultLatencyOptimization) {
            this.defaultLatencyOptimization = defaultLatencyOptimization;
            return this;
        }

        /**
         * DefaultLbaStrategy.
         */
        public Builder defaultLbaStrategy(String defaultLbaStrategy) {
            this.defaultLbaStrategy = defaultLbaStrategy;
            return this;
        }

        /**
         * DefaultMaxReturnAddrNum.
         */
        public Builder defaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
            this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
            return this;
        }

        /**
         * DefaultMinAvailableAddrNum.
         */
        public Builder defaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
            this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
            return this;
        }

        /**
         * EffectiveAddrPoolGroupType.
         */
        public Builder effectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
            this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
            return this;
        }

        /**
         * FailoverAddrPoolGroupStatus.
         */
        public Builder failoverAddrPoolGroupStatus(String failoverAddrPoolGroupStatus) {
            this.failoverAddrPoolGroupStatus = failoverAddrPoolGroupStatus;
            return this;
        }

        /**
         * FailoverAddrPoolType.
         */
        public Builder failoverAddrPoolType(String failoverAddrPoolType) {
            this.failoverAddrPoolType = failoverAddrPoolType;
            return this;
        }

        /**
         * FailoverAddrPools.
         */
        public Builder failoverAddrPools(FailoverAddrPools failoverAddrPools) {
            this.failoverAddrPools = failoverAddrPools;
            return this;
        }

        /**
         * FailoverAvailableAddrNum.
         */
        public Builder failoverAvailableAddrNum(Integer failoverAvailableAddrNum) {
            this.failoverAvailableAddrNum = failoverAvailableAddrNum;
            return this;
        }

        /**
         * FailoverLatencyOptimization.
         */
        public Builder failoverLatencyOptimization(String failoverLatencyOptimization) {
            this.failoverLatencyOptimization = failoverLatencyOptimization;
            return this;
        }

        /**
         * FailoverLbaStrategy.
         */
        public Builder failoverLbaStrategy(String failoverLbaStrategy) {
            this.failoverLbaStrategy = failoverLbaStrategy;
            return this;
        }

        /**
         * FailoverMaxReturnAddrNum.
         */
        public Builder failoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
            this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
            return this;
        }

        /**
         * FailoverMinAvailableAddrNum.
         */
        public Builder failoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
            this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lines.
         */
        public Builder lines(Lines lines) {
            this.lines = lines;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StrategyId.
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        /**
         * StrategyMode.
         */
        public Builder strategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }

        /**
         * StrategyName.
         */
        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }

        public DescribeDnsGtmAccessStrategyResponseBody build() {
            return new DescribeDnsGtmAccessStrategyResponseBody(this);
        } 

    } 

    public static class DefaultAddrPool extends TeaModel {
        @NameInMap("AddrCount")
        private Integer addrCount;

        @NameInMap("Id")
        private String id;

        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Name")
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
             * AddrCount.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LbaWeight.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * Name.
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
    public static class DefaultAddrPools extends TeaModel {
        @NameInMap("DefaultAddrPool")
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
    public static class FailoverAddrPool extends TeaModel {
        @NameInMap("AddrCount")
        private Integer addrCount;

        @NameInMap("Id")
        private String id;

        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Name")
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
             * AddrCount.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LbaWeight.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * Name.
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
    public static class FailoverAddrPools extends TeaModel {
        @NameInMap("FailoverAddrPool")
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
    public static class Line extends TeaModel {
        @NameInMap("GroupCode")
        private String groupCode;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("LineCode")
        private String lineCode;

        @NameInMap("LineName")
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
             * GroupCode.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * LineCode.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * LineName.
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
    public static class Lines extends TeaModel {
        @NameInMap("Line")
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
