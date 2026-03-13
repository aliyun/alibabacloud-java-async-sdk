// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link GenerateEvaluationReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateEvaluationReportResponseBody</p>
 */
public class GenerateEvaluationReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.NameInMap("EvaluationScore")
    private Double evaluationScore;

    @com.aliyun.core.annotation.NameInMap("EvaluationTime")
    private String evaluationTime;

    @com.aliyun.core.annotation.NameInMap("Finished")
    private String finished;

    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    @com.aliyun.core.annotation.NameInMap("ReportUrl")
    private String reportUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateEvaluationReportResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.evaluationScore = builder.evaluationScore;
        this.evaluationTime = builder.evaluationTime;
        this.finished = builder.finished;
        this.reportType = builder.reportType;
        this.reportUrl = builder.reportUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateEvaluationReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return evaluationScore
     */
    public Double getEvaluationScore() {
        return this.evaluationScore;
    }

    /**
     * @return evaluationTime
     */
    public String getEvaluationTime() {
        return this.evaluationTime;
    }

    /**
     * @return finished
     */
    public String getFinished() {
        return this.finished;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * @return reportUrl
     */
    public String getReportUrl() {
        return this.reportUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long accountId; 
        private Double evaluationScore; 
        private String evaluationTime; 
        private String finished; 
        private String reportType; 
        private String reportUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateEvaluationReportResponseBody model) {
            this.accountId = model.accountId;
            this.evaluationScore = model.evaluationScore;
            this.evaluationTime = model.evaluationTime;
            this.finished = model.finished;
            this.reportType = model.reportType;
            this.reportUrl = model.reportUrl;
            this.requestId = model.requestId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * EvaluationScore.
         */
        public Builder evaluationScore(Double evaluationScore) {
            this.evaluationScore = evaluationScore;
            return this;
        }

        /**
         * EvaluationTime.
         */
        public Builder evaluationTime(String evaluationTime) {
            this.evaluationTime = evaluationTime;
            return this;
        }

        /**
         * Finished.
         */
        public Builder finished(String finished) {
            this.finished = finished;
            return this;
        }

        /**
         * ReportType.
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * ReportUrl.
         */
        public Builder reportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7DCF863F-CBBB-57C4-8AF2-5D4EE35D1EB1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateEvaluationReportResponseBody build() {
            return new GenerateEvaluationReportResponseBody(this);
        } 

    } 

}
