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
         * <p>The account ID for which the report is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>103144549568****</p>
         */
        public Builder accountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The governance maturity evaluation score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7684</p>
         */
        public Builder evaluationScore(Double evaluationScore) {
            this.evaluationScore = evaluationScore;
            return this;
        }

        /**
         * <p>The evaluation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-12T07:25:33Z</p>
         */
        public Builder evaluationTime(String evaluationTime) {
            this.evaluationTime = evaluationTime;
            return this;
        }

        /**
         * <p>Indicates whether the report generation is complete.</p>
         * <blockquote>
         * <ul>
         * <li>true: The report generation is complete.</li>
         * <li>false: The report generation is not complete.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder finished(String finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>The report type. Valid values:</p>
         * <ul>
         * <li>EvaluationAccountHtmlReport: single-account HTML report.</li>
         * <li>EvaluationAccountExcelReport: single-account Excel report.</li>
         * <li>EvaluationMultiAccountExcelReport: multi-account Excel report.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EvaluationAccountExcelReport</p>
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * <p>The download URL of the report.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://governance-prod-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/reports-html/">https://governance-prod-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/reports-html/</a>*****</p>
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
