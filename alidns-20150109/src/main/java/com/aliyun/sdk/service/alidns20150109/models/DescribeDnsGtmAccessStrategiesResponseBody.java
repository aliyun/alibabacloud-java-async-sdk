// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAccessStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAccessStrategiesResponseBody</p>
 */
public class DescribeDnsGtmAccessStrategiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategies")
    private Strategies strategies;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The access policies.
         */
        public Builder strategies(Strategies strategies) {
            this.strategies = strategies;
            return this;
        }

        /**
         * The total number of entries returned on all pages.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages returned.
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
        @com.aliyun.core.annotation.NameInMap("AddrCount")
        private Integer addrCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        @com.aliyun.core.annotation.NameInMap("Name")
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
             * The number of addresses in the address pool.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * The ID of the address pool.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The weight of the address pool.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * The name of the address pool.
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
        @com.aliyun.core.annotation.NameInMap("EffectiveAddrPool")
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
             * The code of the source region group.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * The name of the source region group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The line code of the source region.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * The line name of the source region.
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
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EffectiveAddrPoolGroupType")
        private String effectiveAddrPoolGroupType;

        @com.aliyun.core.annotation.NameInMap("EffectiveAddrPoolType")
        private String effectiveAddrPoolType;

        @com.aliyun.core.annotation.NameInMap("EffectiveAddrPools")
        private EffectiveAddrPools effectiveAddrPools;

        @com.aliyun.core.annotation.NameInMap("EffectiveLbaStrategy")
        private String effectiveLbaStrategy;

        @com.aliyun.core.annotation.NameInMap("Lines")
        private Lines lines;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
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
             * The time when the access policy was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The timestamp that indicates when the access policy was created.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The type of the active address pool group. Valid values:
             * <p>
             * 
             * *   DEFAULT: the primary address pool group
             * *   FAILOVER: the secondary address pool group
             */
            public Builder effectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
                this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
                return this;
            }

            /**
             * The type of the active address pools. Valid values:
             * <p>
             * 
             * *   IPV4
             * *   IPV6
             * *   DOMAIN
             */
            public Builder effectiveAddrPoolType(String effectiveAddrPoolType) {
                this.effectiveAddrPoolType = effectiveAddrPoolType;
                return this;
            }

            /**
             * The active address pool groups.
             */
            public Builder effectiveAddrPools(EffectiveAddrPools effectiveAddrPools) {
                this.effectiveAddrPools = effectiveAddrPools;
                return this;
            }

            /**
             * The load balancing policy of the active address pool group. Data is returned when StrategyMode is set to GEO. Valid values: 
             * <p>
             * 
             * - ALL_RR: returns all addresses.
             * - RATIO: returns addresses by weight.
             */
            public Builder effectiveLbaStrategy(String effectiveLbaStrategy) {
                this.effectiveLbaStrategy = effectiveLbaStrategy;
                return this;
            }

            /**
             * The source regions. Data is returned when StrategyMode is set to GEO. Valid values:
             */
            public Builder lines(Lines lines) {
                this.lines = lines;
                return this;
            }

            /**
             * The ID of the access policy.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * The name of the access policy.
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
        @com.aliyun.core.annotation.NameInMap("Strategy")
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
