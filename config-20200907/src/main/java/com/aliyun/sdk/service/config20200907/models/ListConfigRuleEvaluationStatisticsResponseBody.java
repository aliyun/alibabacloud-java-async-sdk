// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListConfigRuleEvaluationStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigRuleEvaluationStatisticsResponseBody</p>
 */
public class ListConfigRuleEvaluationStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EvaluationResults")
    private java.util.List<EvaluationResults> evaluationResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListConfigRuleEvaluationStatisticsResponseBody(Builder builder) {
        this.evaluationResults = builder.evaluationResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRuleEvaluationStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluationResults
     */
    public java.util.List<EvaluationResults> getEvaluationResults() {
        return this.evaluationResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EvaluationResults> evaluationResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConfigRuleEvaluationStatisticsResponseBody model) {
            this.evaluationResults = model.evaluationResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics of compliance evaluation results.</p>
         */
        public Builder evaluationResults(java.util.List<EvaluationResults> evaluationResults) {
            this.evaluationResults = evaluationResults;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4FF2B787-347E-5299-A196-2C0448DEA341</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConfigRuleEvaluationStatisticsResponseBody build() {
            return new ListConfigRuleEvaluationStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConfigRuleEvaluationStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConfigRuleEvaluationStatisticsResponseBody</p>
     */
    public static class EvaluationResults extends TeaModel {
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
            private Integer nonCompliantResourceCnt; 
            private Integer nonCompliantRuleCnt; 
            private String statisticDate; 
            private Integer totalResourceCnt; 
            private Integer totalRuleCnt; 

            private Builder() {
            } 

            private Builder(EvaluationResults model) {
                this.nonCompliantResourceCnt = model.nonCompliantResourceCnt;
                this.nonCompliantRuleCnt = model.nonCompliantRuleCnt;
                this.statisticDate = model.statisticDate;
                this.totalResourceCnt = model.totalResourceCnt;
                this.totalRuleCnt = model.totalRuleCnt;
            } 

            /**
             * <p>The number of resources that are evaluated as non-compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder nonCompliantResourceCnt(Integer nonCompliantResourceCnt) {
                this.nonCompliantResourceCnt = nonCompliantResourceCnt;
                return this;
            }

            /**
             * <p>The number of rules based on which resources are evaluated as non-compliant.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder nonCompliantRuleCnt(Integer nonCompliantRuleCnt) {
                this.nonCompliantRuleCnt = nonCompliantRuleCnt;
                return this;
            }

            /**
             * <p>The date on which the statistics are obtained.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-27</p>
             */
            public Builder statisticDate(String statisticDate) {
                this.statisticDate = statisticDate;
                return this;
            }

            /**
             * <p>The total number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>91</p>
             */
            public Builder totalResourceCnt(Integer totalResourceCnt) {
                this.totalResourceCnt = totalResourceCnt;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
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
