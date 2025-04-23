// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmAccessStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmAccessStrategiesResponseBody</p>
 */
public class DescribeGtmAccessStrategiesResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeGtmAccessStrategiesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.strategies = model.strategies;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0CCC9971-CEC9-4132-824B-4AE611C07623</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned list of access policies of the GTM instance.</p>
         */
        public Builder strategies(Strategies strategies) {
            this.strategies = strategies;
            return this;
        }

        /**
         * <p>The total number of entries returned on all pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeGtmAccessStrategiesResponseBody build() {
            return new DescribeGtmAccessStrategiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmAccessStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategiesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Line model) {
                this.groupCode = model.groupCode;
                this.groupName = model.groupName;
                this.lineCode = model.lineCode;
                this.lineName = model.lineName;
            } 

            /**
             * <p>The code of the access region group.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * <p>The name of the access region group.</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The code for the line of the access region.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * <p>The name for the line of the access region.</p>
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
     * {@link DescribeGtmAccessStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategiesResponseBody</p>
     */
    public static class Lines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private java.util.List<Line> line;

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
        public java.util.List<Line> getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List<Line> line; 

            private Builder() {
            } 

            private Builder(Lines model) {
                this.line = model.line;
            } 

            /**
             * Line.
             */
            public Builder line(java.util.List<Line> line) {
                this.line = line;
                return this;
            }

            public Lines build() {
                return new Lines(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGtmAccessStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategiesResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private String accessMode;

        @com.aliyun.core.annotation.NameInMap("AccessStatus")
        private String accessStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolId")
        private String defaultAddrPoolId;

        @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolMonitorStatus")
        private String defaultAddrPoolMonitorStatus;

        @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolName")
        private String defaultAddrPoolName;

        @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolStatus")
        private String defaultAddrPoolStatus;

        @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolId")
        private String failoverAddrPoolId;

        @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolMonitorStatus")
        private String failoverAddrPoolMonitorStatus;

        @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolName")
        private String failoverAddrPoolName;

        @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolStatus")
        private String failoverAddrPoolStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Lines")
        private Lines lines;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyMode")
        private String strategyMode;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
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

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.accessMode = model.accessMode;
                this.accessStatus = model.accessStatus;
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.defaultAddrPoolId = model.defaultAddrPoolId;
                this.defaultAddrPoolMonitorStatus = model.defaultAddrPoolMonitorStatus;
                this.defaultAddrPoolName = model.defaultAddrPoolName;
                this.defaultAddrPoolStatus = model.defaultAddrPoolStatus;
                this.failoverAddrPoolId = model.failoverAddrPoolId;
                this.failoverAddrPoolMonitorStatus = model.failoverAddrPoolMonitorStatus;
                this.failoverAddrPoolName = model.failoverAddrPoolName;
                this.failoverAddrPoolStatus = model.failoverAddrPoolStatus;
                this.instanceId = model.instanceId;
                this.lines = model.lines;
                this.strategyId = model.strategyId;
                this.strategyMode = model.strategyMode;
                this.strategyName = model.strategyName;
            } 

            /**
             * <p>The access policy. Valid values:</p>
             * <ul>
             * <li><strong>AUTO</strong>: Automatic switch</li>
             * <li><strong>DEFAULT</strong>: Default address pool</li>
             * <li><strong>FAILOVER</strong>: Failover address pool</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * <p>The access status. Valid values:</p>
             * <ul>
             * <li><strong>DEFAULT</strong>: The default address pool is currently accessed.</li>
             * <li><strong>FAILOVER</strong>: The failover address pool is currently accessed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder accessStatus(String accessStatus) {
                this.accessStatus = accessStatus;
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
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The ID of the default address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0i1</p>
             */
            public Builder defaultAddrPoolId(String defaultAddrPoolId) {
                this.defaultAddrPoolId = defaultAddrPoolId;
                return this;
            }

            /**
             * <p>Indicates whether health check was enabled for the default address pool. Valid values:</p>
             * <ul>
             * <li><strong>OPEN</strong>: Enabled</li>
             * <li><strong>CLOSE</strong>: Disabled</li>
             * <li><strong>UNCONFIGURED</strong>: Not configured</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPEN</p>
             */
            public Builder defaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
                this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
                return this;
            }

            /**
             * <p>The name of the default address pool.</p>
             */
            public Builder defaultAddrPoolName(String defaultAddrPoolName) {
                this.defaultAddrPoolName = defaultAddrPoolName;
                return this;
            }

            /**
             * <p>The availability status of the default address pool. Valid values:</p>
             * <ul>
             * <li><strong>AVAILABLE</strong>: Available</li>
             * <li><strong>NOT_AVAILABLE</strong>: Unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder defaultAddrPoolStatus(String defaultAddrPoolStatus) {
                this.defaultAddrPoolStatus = defaultAddrPoolStatus;
                return this;
            }

            /**
             * <p>The ID of the failover address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0i2</p>
             */
            public Builder failoverAddrPoolId(String failoverAddrPoolId) {
                this.failoverAddrPoolId = failoverAddrPoolId;
                return this;
            }

            /**
             * <p>Indicates whether health check was enabled for the failover address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN</p>
             */
            public Builder failoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
                this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
                return this;
            }

            /**
             * <p>The name of the failover address pool.</p>
             */
            public Builder failoverAddrPoolName(String failoverAddrPoolName) {
                this.failoverAddrPoolName = failoverAddrPoolName;
                return this;
            }

            /**
             * <p>The availability status of the failover address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder failoverAddrPoolStatus(String failoverAddrPoolStatus) {
                this.failoverAddrPoolStatus = failoverAddrPoolStatus;
                return this;
            }

            /**
             * <p>The ID of the GTM instance whose access policies you want to query.</p>
             * 
             * <strong>example:</strong>
             * <p>instance1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The returned lines of access regions.</p>
             */
            public Builder lines(Lines lines) {
                this.lines = lines;
                return this;
            }

            /**
             * <p>The ID of the access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>hra0hs</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The mode of the access policy. <strong>SELF_DEFINED</strong> indicates that the access policy is user-defined.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF_DEFINED</p>
             */
            public Builder strategyMode(String strategyMode) {
                this.strategyMode = strategyMode;
                return this;
            }

            /**
             * <p>The name of the access policy.</p>
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
    /**
     * 
     * {@link DescribeGtmAccessStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmAccessStrategiesResponseBody</p>
     */
    public static class Strategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Strategy")
        private java.util.List<Strategy> strategy;

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
        public java.util.List<Strategy> getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List<Strategy> strategy; 

            private Builder() {
            } 

            private Builder(Strategies model) {
                this.strategy = model.strategy;
            } 

            /**
             * Strategy.
             */
            public Builder strategy(java.util.List<Strategy> strategy) {
                this.strategy = strategy;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
