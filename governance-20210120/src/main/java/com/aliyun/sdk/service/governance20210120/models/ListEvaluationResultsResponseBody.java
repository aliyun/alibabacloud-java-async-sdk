// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEvaluationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluationResultsResponseBody</p>
 */
public class ListEvaluationResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    private ListEvaluationResultsResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    public static final class Builder {
        private Long accountId; 
        private String requestId; 
        private Results results; 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.accountId = accountId;
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
         * Results.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        public ListEvaluationResultsResponseBody build() {
            return new ListEvaluationResultsResponseBody(this);
        } 

    } 

    public static class ResourcesSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NonCompliant")
        private Integer nonCompliant;

        private ResourcesSummary(Builder builder) {
            this.nonCompliant = builder.nonCompliant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesSummary create() {
            return builder().build();
        }

        /**
         * @return nonCompliant
         */
        public Integer getNonCompliant() {
            return this.nonCompliant;
        }

        public static final class Builder {
            private Integer nonCompliant; 

            /**
             * NonCompliant.
             */
            public Builder nonCompliant(Integer nonCompliant) {
                this.nonCompliant = nonCompliant;
                return this;
            }

            public ResourcesSummary build() {
                return new ResourcesSummary(this);
            } 

        } 

    }
    public static class MetricResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EvaluationTime")
        private String evaluationTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ResourcesSummary")
        private ResourcesSummary resourcesSummary;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Double result;

        @com.aliyun.core.annotation.NameInMap("Risk")
        private String risk;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private MetricResults(Builder builder) {
            this.evaluationTime = builder.evaluationTime;
            this.id = builder.id;
            this.resourcesSummary = builder.resourcesSummary;
            this.result = builder.result;
            this.risk = builder.risk;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricResults create() {
            return builder().build();
        }

        /**
         * @return evaluationTime
         */
        public String getEvaluationTime() {
            return this.evaluationTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return resourcesSummary
         */
        public ResourcesSummary getResourcesSummary() {
            return this.resourcesSummary;
        }

        /**
         * @return result
         */
        public Double getResult() {
            return this.result;
        }

        /**
         * @return risk
         */
        public String getRisk() {
            return this.risk;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String evaluationTime; 
            private String id; 
            private ResourcesSummary resourcesSummary; 
            private Double result; 
            private String risk; 
            private String status; 

            /**
             * EvaluationTime.
             */
            public Builder evaluationTime(String evaluationTime) {
                this.evaluationTime = evaluationTime;
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
             * ResourcesSummary.
             */
            public Builder resourcesSummary(ResourcesSummary resourcesSummary) {
                this.resourcesSummary = resourcesSummary;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Double result) {
                this.result = result;
                return this;
            }

            /**
             * Risk.
             */
            public Builder risk(String risk) {
                this.risk = risk;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MetricResults build() {
                return new MetricResults(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EvaluationTime")
        private String evaluationTime;

        @com.aliyun.core.annotation.NameInMap("MetricResults")
        private java.util.List < MetricResults> metricResults;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalScore")
        private Double totalScore;

        private Results(Builder builder) {
            this.evaluationTime = builder.evaluationTime;
            this.metricResults = builder.metricResults;
            this.status = builder.status;
            this.totalScore = builder.totalScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return evaluationTime
         */
        public String getEvaluationTime() {
            return this.evaluationTime;
        }

        /**
         * @return metricResults
         */
        public java.util.List < MetricResults> getMetricResults() {
            return this.metricResults;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalScore
         */
        public Double getTotalScore() {
            return this.totalScore;
        }

        public static final class Builder {
            private String evaluationTime; 
            private java.util.List < MetricResults> metricResults; 
            private String status; 
            private Double totalScore; 

            /**
             * EvaluationTime.
             */
            public Builder evaluationTime(String evaluationTime) {
                this.evaluationTime = evaluationTime;
                return this;
            }

            /**
             * MetricResults.
             */
            public Builder metricResults(java.util.List < MetricResults> metricResults) {
                this.metricResults = metricResults;
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
             * TotalScore.
             */
            public Builder totalScore(Double totalScore) {
                this.totalScore = totalScore;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
