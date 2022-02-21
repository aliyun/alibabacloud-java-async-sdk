// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAccessStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAccessStrategiesResponseBody</p>
 */
public class DescribeDnsGtmAccessStrategiesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Strategies")
    private Strategies strategies;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeDnsGtmAccessStrategiesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.strategies = builder.strategies;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAccessStrategiesResponseBody create() {
        return builder().build();
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
     * @return strategies
     */
    public Strategies getStrategies() {
        return this.strategies;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Strategies strategies; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Strategies.
         */
        public Builder strategies(Strategies strategies) {
            this.strategies = strategies;
            return this;
        }

        /**
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDnsGtmAccessStrategiesResponseBody build() {
            return new DescribeDnsGtmAccessStrategiesResponseBody(this);
        } 

    } 

    public static class EffectiveAddrPool extends TeaModel {
        @NameInMap("AddrCount")
        private Integer addrCount;

        @NameInMap("Id")
        private String id;

        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Name")
        private String name;

        private EffectiveAddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.id = builder.id;
            this.lbaWeight = builder.lbaWeight;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveAddrPool create() {
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

            public EffectiveAddrPool build() {
                return new EffectiveAddrPool(this);
            } 

        } 

    }
    public static class EffectiveAddrPools extends TeaModel {
        @NameInMap("EffectiveAddrPool")
        private java.util.List < EffectiveAddrPool> effectiveAddrPool;

        private EffectiveAddrPools(Builder builder) {
            this.effectiveAddrPool = builder.effectiveAddrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveAddrPools create() {
            return builder().build();
        }

        /**
         * @return effectiveAddrPool
         */
        public java.util.List < EffectiveAddrPool> getEffectiveAddrPool() {
            return this.effectiveAddrPool;
        }

        public static final class Builder {
            private java.util.List < EffectiveAddrPool> effectiveAddrPool; 

            /**
             * EffectiveAddrPool.
             */
            public Builder effectiveAddrPool(java.util.List < EffectiveAddrPool> effectiveAddrPool) {
                this.effectiveAddrPool = effectiveAddrPool;
                return this;
            }

            public EffectiveAddrPools build() {
                return new EffectiveAddrPools(this);
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
    public static class Strategy extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("EffectiveAddrPoolGroupType")
        private String effectiveAddrPoolGroupType;

        @NameInMap("EffectiveAddrPoolType")
        private String effectiveAddrPoolType;

        @NameInMap("EffectiveAddrPools")
        private EffectiveAddrPools effectiveAddrPools;

        @NameInMap("EffectiveLbaStrategy")
        private String effectiveLbaStrategy;

        @NameInMap("Lines")
        private Lines lines;

        @NameInMap("StrategyId")
        private String strategyId;

        @NameInMap("StrategyName")
        private String strategyName;

        private Strategy(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.effectiveAddrPoolGroupType = builder.effectiveAddrPoolGroupType;
            this.effectiveAddrPoolType = builder.effectiveAddrPoolType;
            this.effectiveAddrPools = builder.effectiveAddrPools;
            this.effectiveLbaStrategy = builder.effectiveLbaStrategy;
            this.lines = builder.lines;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
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
         * @return effectiveAddrPoolGroupType
         */
        public String getEffectiveAddrPoolGroupType() {
            return this.effectiveAddrPoolGroupType;
        }

        /**
         * @return effectiveAddrPoolType
         */
        public String getEffectiveAddrPoolType() {
            return this.effectiveAddrPoolType;
        }

        /**
         * @return effectiveAddrPools
         */
        public EffectiveAddrPools getEffectiveAddrPools() {
            return this.effectiveAddrPools;
        }

        /**
         * @return effectiveLbaStrategy
         */
        public String getEffectiveLbaStrategy() {
            return this.effectiveLbaStrategy;
        }

        /**
         * @return lines
         */
        public Lines getLines() {
            return this.lines;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private String effectiveAddrPoolGroupType; 
            private String effectiveAddrPoolType; 
            private EffectiveAddrPools effectiveAddrPools; 
            private String effectiveLbaStrategy; 
            private Lines lines; 
            private String strategyId; 
            private String strategyName; 

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
             * EffectiveAddrPoolGroupType.
             */
            public Builder effectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
                this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
                return this;
            }

            /**
             * EffectiveAddrPoolType.
             */
            public Builder effectiveAddrPoolType(String effectiveAddrPoolType) {
                this.effectiveAddrPoolType = effectiveAddrPoolType;
                return this;
            }

            /**
             * EffectiveAddrPools.
             */
            public Builder effectiveAddrPools(EffectiveAddrPools effectiveAddrPools) {
                this.effectiveAddrPools = effectiveAddrPools;
                return this;
            }

            /**
             * EffectiveLbaStrategy.
             */
            public Builder effectiveLbaStrategy(String effectiveLbaStrategy) {
                this.effectiveLbaStrategy = effectiveLbaStrategy;
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
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    public static class Strategies extends TeaModel {
        @NameInMap("Strategy")
        private java.util.List < Strategy> strategy;

        private Strategies(Builder builder) {
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return strategy
         */
        public java.util.List < Strategy> getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List < Strategy> strategy; 

            /**
             * Strategy.
             */
            public Builder strategy(java.util.List < Strategy> strategy) {
                this.strategy = strategy;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
