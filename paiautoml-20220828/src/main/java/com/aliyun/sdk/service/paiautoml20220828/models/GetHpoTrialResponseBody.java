// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHpoTrialResponseBody} extends {@link TeaModel}
 *
 * <p>GetHpoTrialResponseBody</p>
 */
public class GetHpoTrialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.NameInMap("FinalMetric")
    private String finalMetric;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Hyperparam")
    private String hyperparam;

    @com.aliyun.core.annotation.NameInMap("JobMeta")
    private String jobMeta;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("ParameterId")
    private Integer parameterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TrialId")
    private String trialId;

    @com.aliyun.core.annotation.NameInMap("UserComment")
    private String userComment;

    @com.aliyun.core.annotation.NameInMap("UserScore")
    private Integer userScore;

    private GetHpoTrialResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.experimentId = builder.experimentId;
        this.finalMetric = builder.finalMetric;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.hyperparam = builder.hyperparam;
        this.jobMeta = builder.jobMeta;
        this.message = builder.message;
        this.metric = builder.metric;
        this.metricName = builder.metricName;
        this.model = builder.model;
        this.parameterId = builder.parameterId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.trialId = builder.trialId;
        this.userComment = builder.userComment;
        this.userScore = builder.userScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHpoTrialResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String code; 
        private java.util.Map < String, String > detail; 
        private String experimentId; 
        private String finalMetric; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String hyperparam; 
        private String jobMeta; 
        private String message; 
        private String metric; 
        private String metricName; 
        private String model; 
        private Integer parameterId; 
        private String requestId; 
        private String status; 
        private String trialId; 
        private String userComment; 
        private Integer userScore; 

        /**
         * Error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Extra error information.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Experiment ID.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Final metric of the trial.
         */
        public Builder finalMetric(String finalMetric) {
            this.finalMetric = finalMetric;
            return this;
        }

        /**
         * Trial create time.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * Trial last update time.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Hyperparameters used to run the trial.
         */
        public Builder hyperparam(String hyperparam) {
            this.hyperparam = hyperparam;
            return this;
        }

        /**
         * trial meta infomation.
         */
        public Builder jobMeta(String jobMeta) {
            this.jobMeta = jobMeta;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * metric details uploaded during running.
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * Name of the metric.
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Trial output model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * Parameter id, start from 0.
         */
        public Builder parameterId(Integer parameterId) {
            this.parameterId = parameterId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Trial status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Trail ID.
         */
        public Builder trialId(String trialId) {
            this.trialId = trialId;
            return this;
        }

        /**
         * User added comments.
         */
        public Builder userComment(String userComment) {
            this.userComment = userComment;
            return this;
        }

        /**
         * User updated score.
         */
        public Builder userScore(Integer userScore) {
            this.userScore = userScore;
            return this;
        }

        public GetHpoTrialResponseBody build() {
            return new GetHpoTrialResponseBody(this);
        } 

    } 

}
