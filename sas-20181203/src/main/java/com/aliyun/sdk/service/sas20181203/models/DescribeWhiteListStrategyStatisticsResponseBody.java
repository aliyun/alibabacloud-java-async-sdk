// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeWhiteListStrategyStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListStrategyStatisticsResponseBody</p>
 */
public class DescribeWhiteListStrategyStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategies")
    private java.util.List<Strategies> strategies;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWhiteListStrategyStatisticsResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.strategies = builder.strategies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListStrategyStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
    public java.util.List<Strategies> getStrategies() {
        return this.strategies;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Strategies> strategies; 
        private Integer totalCount; 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics of the policies.</p>
         */
        public Builder strategies(java.util.List<Strategies> strategies) {
            this.strategies = strategies;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWhiteListStrategyStatisticsResponseBody build() {
            return new DescribeWhiteListStrategyStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWhiteListStrategyStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteListStrategyStatisticsResponseBody</p>
     */
    public static class Strategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Integer assetCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("StudyTime")
        private Integer studyTime;

        @com.aliyun.core.annotation.NameInMap("SuspiciousProcCount")
        private Integer suspiciousProcCount;

        @com.aliyun.core.annotation.NameInMap("TrustProcCount")
        private Integer trustProcCount;

        @com.aliyun.core.annotation.NameInMap("VirusProcCount")
        private Integer virusProcCount;

        private Strategies(Builder builder) {
            this.assetCount = builder.assetCount;
            this.progress = builder.progress;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.studyTime = builder.studyTime;
            this.suspiciousProcCount = builder.suspiciousProcCount;
            this.trustProcCount = builder.trustProcCount;
            this.virusProcCount = builder.virusProcCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return assetCount
         */
        public Integer getAssetCount() {
            return this.assetCount;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return studyTime
         */
        public Integer getStudyTime() {
            return this.studyTime;
        }

        /**
         * @return suspiciousProcCount
         */
        public Integer getSuspiciousProcCount() {
            return this.suspiciousProcCount;
        }

        /**
         * @return trustProcCount
         */
        public Integer getTrustProcCount() {
            return this.trustProcCount;
        }

        /**
         * @return virusProcCount
         */
        public Integer getVirusProcCount() {
            return this.virusProcCount;
        }

        public static final class Builder {
            private Integer assetCount; 
            private Integer progress; 
            private Integer status; 
            private Long strategyId; 
            private String strategyName; 
            private Integer studyTime; 
            private Integer suspiciousProcCount; 
            private Integer trustProcCount; 
            private Integer virusProcCount; 

            /**
             * <p>The number of the servers on which the policy takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder assetCount(Integer assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * <p>The learning progress of the policy. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: learning</li>
             * <li><strong>2</strong>: paused</li>
             * <li><strong>3</strong>: learning completed</li>
             * <li><strong>4</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>11906</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>win</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The intelligent learning duration. Unit: hour.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder studyTime(Integer studyTime) {
                this.studyTime = studyTime;
                return this;
            }

            /**
             * <p>The number of suspicious processes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder suspiciousProcCount(Integer suspiciousProcCount) {
                this.suspiciousProcCount = suspiciousProcCount;
                return this;
            }

            /**
             * <p>The number of trusted processes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder trustProcCount(Integer trustProcCount) {
                this.trustProcCount = trustProcCount;
                return this;
            }

            /**
             * <p>The number of malicious processes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder virusProcCount(Integer virusProcCount) {
                this.virusProcCount = virusProcCount;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
