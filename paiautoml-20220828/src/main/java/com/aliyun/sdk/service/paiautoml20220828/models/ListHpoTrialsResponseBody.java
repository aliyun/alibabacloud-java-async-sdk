// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoTrialsResponseBody</p>
 */
public class ListHpoTrialsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Trials")
    private java.util.List < Trials> trials;

    private ListHpoTrialsResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trials = builder.trials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoTrialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, String > getDetail() {
        return this.detail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trials
     */
    public java.util.List < Trials> getTrials() {
        return this.trials;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, String > detail; 
        private String message; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < Trials> trials; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Trials.
         */
        public Builder trials(java.util.List < Trials> trials) {
            this.trials = trials;
            return this;
        }

        public ListHpoTrialsResponseBody build() {
            return new ListHpoTrialsResponseBody(this);
        } 

    } 

    public static class Trials extends TeaModel {
        @NameInMap("ExperimentId")
        private String experimentId;

        @NameInMap("FinalMetric")
        private String finalMetric;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("Hyperparam")
        private String hyperparam;

        @NameInMap("JobMeta")
        private String jobMeta;

        @NameInMap("Metric")
        private String metric;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Model")
        private String model;

        @NameInMap("ParameterId")
        private Integer parameterId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TrialId")
        private String trialId;

        @NameInMap("UserComment")
        private String userComment;

        @NameInMap("UserScore")
        private Integer userScore;

        private Trials(Builder builder) {
            this.experimentId = builder.experimentId;
            this.finalMetric = builder.finalMetric;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.hyperparam = builder.hyperparam;
            this.jobMeta = builder.jobMeta;
            this.metric = builder.metric;
            this.metricName = builder.metricName;
            this.model = builder.model;
            this.parameterId = builder.parameterId;
            this.status = builder.status;
            this.trialId = builder.trialId;
            this.userComment = builder.userComment;
            this.userScore = builder.userScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trials create() {
            return builder().build();
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return finalMetric
         */
        public String getFinalMetric() {
            return this.finalMetric;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return hyperparam
         */
        public String getHyperparam() {
            return this.hyperparam;
        }

        /**
         * @return jobMeta
         */
        public String getJobMeta() {
            return this.jobMeta;
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return parameterId
         */
        public Integer getParameterId() {
            return this.parameterId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trialId
         */
        public String getTrialId() {
            return this.trialId;
        }

        /**
         * @return userComment
         */
        public String getUserComment() {
            return this.userComment;
        }

        /**
         * @return userScore
         */
        public Integer getUserScore() {
            return this.userScore;
        }

        public static final class Builder {
            private String experimentId; 
            private String finalMetric; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String hyperparam; 
            private String jobMeta; 
            private String metric; 
            private String metricName; 
            private String model; 
            private Integer parameterId; 
            private String status; 
            private String trialId; 
            private String userComment; 
            private Integer userScore; 

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * FinalMetric.
             */
            public Builder finalMetric(String finalMetric) {
                this.finalMetric = finalMetric;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * Hyperparam.
             */
            public Builder hyperparam(String hyperparam) {
                this.hyperparam = hyperparam;
                return this;
            }

            /**
             * JobMeta.
             */
            public Builder jobMeta(String jobMeta) {
                this.jobMeta = jobMeta;
                return this;
            }

            /**
             * Metric.
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * ParameterId.
             */
            public Builder parameterId(Integer parameterId) {
                this.parameterId = parameterId;
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
             * TrialId.
             */
            public Builder trialId(String trialId) {
                this.trialId = trialId;
                return this;
            }

            /**
             * UserComment.
             */
            public Builder userComment(String userComment) {
                this.userComment = userComment;
                return this;
            }

            /**
             * UserScore.
             */
            public Builder userScore(Integer userScore) {
                this.userScore = userScore;
                return this;
            }

            public Trials build() {
                return new Trials(this);
            } 

        } 

    }
}
