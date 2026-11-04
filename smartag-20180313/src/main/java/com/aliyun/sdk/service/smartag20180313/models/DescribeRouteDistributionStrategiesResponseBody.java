// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeRouteDistributionStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteDistributionStrategiesResponseBody</p>
 */
public class DescribeRouteDistributionStrategiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategies")
    private Strategies strategies;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouteDistributionStrategiesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.strategies = builder.strategies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteDistributionStrategiesResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Strategies strategies; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRouteDistributionStrategiesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.strategies = model.strategies;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>944C2533-1BB7-4578-B6EB-DA05BB61C02A</p>
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
         * <p>The total number of routes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteDistributionStrategiesResponseBody build() {
            return new DescribeRouteDistributionStrategiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouteDistributionStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteDistributionStrategiesResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConflictInfo")
        private String conflictInfo;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DestCidrBlock")
        private String destCidrBlock;

        @com.aliyun.core.annotation.NameInMap("HcInstanceId")
        private String hcInstanceId;

        @com.aliyun.core.annotation.NameInMap("IsConflict")
        private Boolean isConflict;

        @com.aliyun.core.annotation.NameInMap("RouteDistribution")
        private String routeDistribution;

        @com.aliyun.core.annotation.NameInMap("RouteSource")
        private String routeSource;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyPublishStatus")
        private String strategyPublishStatus;

        private Strategy(Builder builder) {
            this.conflictInfo = builder.conflictInfo;
            this.createTime = builder.createTime;
            this.destCidrBlock = builder.destCidrBlock;
            this.hcInstanceId = builder.hcInstanceId;
            this.isConflict = builder.isConflict;
            this.routeDistribution = builder.routeDistribution;
            this.routeSource = builder.routeSource;
            this.smartAGId = builder.smartAGId;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.strategyPublishStatus = builder.strategyPublishStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return conflictInfo
         */
        public String getConflictInfo() {
            return this.conflictInfo;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return destCidrBlock
         */
        public String getDestCidrBlock() {
            return this.destCidrBlock;
        }

        /**
         * @return hcInstanceId
         */
        public String getHcInstanceId() {
            return this.hcInstanceId;
        }

        /**
         * @return isConflict
         */
        public Boolean getIsConflict() {
            return this.isConflict;
        }

        /**
         * @return routeDistribution
         */
        public String getRouteDistribution() {
            return this.routeDistribution;
        }

        /**
         * @return routeSource
         */
        public String getRouteSource() {
            return this.routeSource;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyPublishStatus
         */
        public String getStrategyPublishStatus() {
            return this.strategyPublishStatus;
        }

        public static final class Builder {
            private String conflictInfo; 
            private Long createTime; 
            private String destCidrBlock; 
            private String hcInstanceId; 
            private Boolean isConflict; 
            private String routeDistribution; 
            private String routeSource; 
            private String smartAGId; 
            private String sourceType; 
            private String status; 
            private String strategyPublishStatus; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.conflictInfo = model.conflictInfo;
                this.createTime = model.createTime;
                this.destCidrBlock = model.destCidrBlock;
                this.hcInstanceId = model.hcInstanceId;
                this.isConflict = model.isConflict;
                this.routeDistribution = model.routeDistribution;
                this.routeSource = model.routeSource;
                this.smartAGId = model.smartAGId;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.strategyPublishStatus = model.strategyPublishStatus;
            } 

            /**
             * ConflictInfo.
             */
            public Builder conflictInfo(String conflictInfo) {
                this.conflictInfo = conflictInfo;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DestCidrBlock.
             */
            public Builder destCidrBlock(String destCidrBlock) {
                this.destCidrBlock = destCidrBlock;
                return this;
            }

            /**
             * HcInstanceId.
             */
            public Builder hcInstanceId(String hcInstanceId) {
                this.hcInstanceId = hcInstanceId;
                return this;
            }

            /**
             * IsConflict.
             */
            public Builder isConflict(Boolean isConflict) {
                this.isConflict = isConflict;
                return this;
            }

            /**
             * RouteDistribution.
             */
            public Builder routeDistribution(String routeDistribution) {
                this.routeDistribution = routeDistribution;
                return this;
            }

            /**
             * RouteSource.
             */
            public Builder routeSource(String routeSource) {
                this.routeSource = routeSource;
                return this;
            }

            /**
             * SmartAGId.
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StrategyPublishStatus.
             */
            public Builder strategyPublishStatus(String strategyPublishStatus) {
                this.strategyPublishStatus = strategyPublishStatus;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteDistributionStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteDistributionStrategiesResponseBody</p>
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
