// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateConfigRuleEvaluationStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateConfigRuleEvaluationStatisticsResponseBody</p>
 */
public class ListAggregateConfigRuleEvaluationStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EvaluationResults")
    private java.util.List < EvaluationResults> evaluationResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateConfigRuleEvaluationStatisticsResponseBody(Builder builder) {
        this.evaluationResults = builder.evaluationResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateConfigRuleEvaluationStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return evaluationResults
     */
    public java.util.List < EvaluationResults> getEvaluationResults() {
        return this.evaluationResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EvaluationResults> evaluationResults; 
        private String requestId; 

        /**
         * The statistics of compliance evaluation results.
         */
        public Builder evaluationResults(java.util.List < EvaluationResults> evaluationResults) {
            this.evaluationResults = evaluationResults;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateConfigRuleEvaluationStatisticsResponseBody build() {
            return new ListAggregateConfigRuleEvaluationStatisticsResponseBody(this);
        } 

    } 

    public static class EvaluationResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("NonCompliantResourceCnt")
        private Integer nonCompliantResourceCnt;

        @com.aliyun.core.annotation.NameInMap("NonCompliantRuleCnt")
        private Integer nonCompliantRuleCnt;

        @com.aliyun.core.annotation.NameInMap("StatisticDate")
        private String statisticDate;

        @com.aliyun.core.annotation.NameInMap("TotalResourceCnt")
        private Integer totalResourceCnt;

        @com.aliyun.core.annotation.NameInMap("TotalRuleCnt")
        private Integer totalRuleCnt;

        private EvaluationResults(Builder builder) {
            this.aggregatorId = builder.aggregatorId;
            this.nonCompliantResourceCnt = builder.nonCompliantResourceCnt;
            this.nonCompliantRuleCnt = builder.nonCompliantRuleCnt;
            this.statisticDate = builder.statisticDate;
            this.totalResourceCnt = builder.totalResourceCnt;
            this.totalRuleCnt = builder.totalRuleCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationResults create() {
            return builder().build();
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return nonCompliantResourceCnt
         */
        public Integer getNonCompliantResourceCnt() {
            return this.nonCompliantResourceCnt;
        }

        /**
         * @return nonCompliantRuleCnt
         */
        public Integer getNonCompliantRuleCnt() {
            return this.nonCompliantRuleCnt;
        }

        /**
         * @return statisticDate
         */
        public String getStatisticDate() {
            return this.statisticDate;
        }

        /**
         * @return totalResourceCnt
         */
        public Integer getTotalResourceCnt() {
            return this.totalResourceCnt;
        }

        /**
         * @return totalRuleCnt
         */
        public Integer getTotalRuleCnt() {
            return this.totalRuleCnt;
        }

        public static final class Builder {
            private String aggregatorId; 
            private Integer nonCompliantResourceCnt; 
            private Integer nonCompliantRuleCnt; 
            private String statisticDate; 
            private Integer totalResourceCnt; 
            private Integer totalRuleCnt; 

            /**
             * The ID of the account group.
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * The number of resources that are evaluated as non-compliant.
             */
            public Builder nonCompliantResourceCnt(Integer nonCompliantResourceCnt) {
                this.nonCompliantResourceCnt = nonCompliantResourceCnt;
                return this;
            }

            /**
             * The number of rules based on which resources are evaluated as non-compliant.
             */
            public Builder nonCompliantRuleCnt(Integer nonCompliantRuleCnt) {
                this.nonCompliantRuleCnt = nonCompliantRuleCnt;
                return this;
            }

            /**
             * The date on which the statistics are obtained.
             */
            public Builder statisticDate(String statisticDate) {
                this.statisticDate = statisticDate;
                return this;
            }

            /**
             * The total number of resources.
             */
            public Builder totalResourceCnt(Integer totalResourceCnt) {
                this.totalResourceCnt = totalResourceCnt;
                return this;
            }

            /**
             * The total number of rules.
             */
            public Builder totalRuleCnt(Integer totalRuleCnt) {
                this.totalRuleCnt = totalRuleCnt;
                return this;
            }

            public EvaluationResults build() {
                return new EvaluationResults(this);
            } 

        } 

    }
}
