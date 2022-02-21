// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmAccessStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmAccessStrategiesResponseBody</p>
 */
public class DescribeGtmAccessStrategiesResponseBody extends TeaModel {
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

    private DescribeGtmAccessStrategiesResponseBody(Builder builder) {
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

    public static DescribeGtmAccessStrategiesResponseBody create() {
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

        public DescribeGtmAccessStrategiesResponseBody build() {
            return new DescribeGtmAccessStrategiesResponseBody(this);
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
        @NameInMap("AccessMode")
        private String accessMode;

        @NameInMap("AccessStatus")
        private String accessStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("DefaultAddrPoolId")
        private String defaultAddrPoolId;

        @NameInMap("DefaultAddrPoolMonitorStatus")
        private String defaultAddrPoolMonitorStatus;

        @NameInMap("DefaultAddrPoolName")
        private String defaultAddrPoolName;

        @NameInMap("DefaultAddrPoolStatus")
        private String defaultAddrPoolStatus;

        @NameInMap("FailoverAddrPoolId")
        private String failoverAddrPoolId;

        @NameInMap("FailoverAddrPoolMonitorStatus")
        private String failoverAddrPoolMonitorStatus;

        @NameInMap("FailoverAddrPoolName")
        private String failoverAddrPoolName;

        @NameInMap("FailoverAddrPoolStatus")
        private String failoverAddrPoolStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Lines")
        private Lines lines;

        @NameInMap("StrategyId")
        private String strategyId;

        @NameInMap("StrategyMode")
        private String strategyMode;

        @NameInMap("StrategyName")
        private String strategyName;

        private Strategy(Builder builder) {
            this.accessMode = builder.accessMode;
            this.accessStatus = builder.accessStatus;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.defaultAddrPoolId = builder.defaultAddrPoolId;
            this.defaultAddrPoolMonitorStatus = builder.defaultAddrPoolMonitorStatus;
            this.defaultAddrPoolName = builder.defaultAddrPoolName;
            this.defaultAddrPoolStatus = builder.defaultAddrPoolStatus;
            this.failoverAddrPoolId = builder.failoverAddrPoolId;
            this.failoverAddrPoolMonitorStatus = builder.failoverAddrPoolMonitorStatus;
            this.failoverAddrPoolName = builder.failoverAddrPoolName;
            this.failoverAddrPoolStatus = builder.failoverAddrPoolStatus;
            this.instanceId = builder.instanceId;
            this.lines = builder.lines;
            this.strategyId = builder.strategyId;
            this.strategyMode = builder.strategyMode;
            this.strategyName = builder.strategyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        /**
         * @return accessStatus
         */
        public String getAccessStatus() {
            return this.accessStatus;
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
         * @return defaultAddrPoolId
         */
        public String getDefaultAddrPoolId() {
            return this.defaultAddrPoolId;
        }

        /**
         * @return defaultAddrPoolMonitorStatus
         */
        public String getDefaultAddrPoolMonitorStatus() {
            return this.defaultAddrPoolMonitorStatus;
        }

        /**
         * @return defaultAddrPoolName
         */
        public String getDefaultAddrPoolName() {
            return this.defaultAddrPoolName;
        }

        /**
         * @return defaultAddrPoolStatus
         */
        public String getDefaultAddrPoolStatus() {
            return this.defaultAddrPoolStatus;
        }

        /**
         * @return failoverAddrPoolId
         */
        public String getFailoverAddrPoolId() {
            return this.failoverAddrPoolId;
        }

        /**
         * @return failoverAddrPoolMonitorStatus
         */
        public String getFailoverAddrPoolMonitorStatus() {
            return this.failoverAddrPoolMonitorStatus;
        }

        /**
         * @return failoverAddrPoolName
         */
        public String getFailoverAddrPoolName() {
            return this.failoverAddrPoolName;
        }

        /**
         * @return failoverAddrPoolStatus
         */
        public String getFailoverAddrPoolStatus() {
            return this.failoverAddrPoolStatus;
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
            private String accessStatus; 
            private String createTime; 
            private Long createTimestamp; 
            private String defaultAddrPoolId; 
            private String defaultAddrPoolMonitorStatus; 
            private String defaultAddrPoolName; 
            private String defaultAddrPoolStatus; 
            private String failoverAddrPoolId; 
            private String failoverAddrPoolMonitorStatus; 
            private String failoverAddrPoolName; 
            private String failoverAddrPoolStatus; 
            private String instanceId; 
            private Lines lines; 
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
             * AccessStatus.
             */
            public Builder accessStatus(String accessStatus) {
                this.accessStatus = accessStatus;
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
             * DefaultAddrPoolId.
             */
            public Builder defaultAddrPoolId(String defaultAddrPoolId) {
                this.defaultAddrPoolId = defaultAddrPoolId;
                return this;
            }

            /**
             * DefaultAddrPoolMonitorStatus.
             */
            public Builder defaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
                this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
                return this;
            }

            /**
             * DefaultAddrPoolName.
             */
            public Builder defaultAddrPoolName(String defaultAddrPoolName) {
                this.defaultAddrPoolName = defaultAddrPoolName;
                return this;
            }

            /**
             * DefaultAddrPoolStatus.
             */
            public Builder defaultAddrPoolStatus(String defaultAddrPoolStatus) {
                this.defaultAddrPoolStatus = defaultAddrPoolStatus;
                return this;
            }

            /**
             * FailoverAddrPoolId.
             */
            public Builder failoverAddrPoolId(String failoverAddrPoolId) {
                this.failoverAddrPoolId = failoverAddrPoolId;
                return this;
            }

            /**
             * FailoverAddrPoolMonitorStatus.
             */
            public Builder failoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
                this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
                return this;
            }

            /**
             * FailoverAddrPoolName.
             */
            public Builder failoverAddrPoolName(String failoverAddrPoolName) {
                this.failoverAddrPoolName = failoverAddrPoolName;
                return this;
            }

            /**
             * FailoverAddrPoolStatus.
             */
            public Builder failoverAddrPoolStatus(String failoverAddrPoolStatus) {
                this.failoverAddrPoolStatus = failoverAddrPoolStatus;
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
