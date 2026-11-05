// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeInstanceReportAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceReportAttributeResponseBody</p>
 */
public class DescribeInstanceReportAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Latest")
    private Boolean latest;

    @com.aliyun.core.annotation.NameInMap("ReportDescription")
    private String reportDescription;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("ReportScore")
    private Long reportScore;

    @com.aliyun.core.annotation.NameInMap("ReportStatus")
    private String reportStatus;

    @com.aliyun.core.annotation.NameInMap("ReportSubItems")
    private java.util.List<ReportSubItems> reportSubItems;

    @com.aliyun.core.annotation.NameInMap("ReportSummary")
    private String reportSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribeInstanceReportAttributeResponseBody(Builder builder) {
        this.latest = builder.latest;
        this.reportDescription = builder.reportDescription;
        this.reportId = builder.reportId;
        this.reportScore = builder.reportScore;
        this.reportStatus = builder.reportStatus;
        this.reportSubItems = builder.reportSubItems;
        this.reportSummary = builder.reportSummary;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceReportAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latest
     */
    public Boolean getLatest() {
        return this.latest;
    }

    /**
     * @return reportDescription
     */
    public String getReportDescription() {
        return this.reportDescription;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return reportScore
     */
    public Long getReportScore() {
        return this.reportScore;
    }

    /**
     * @return reportStatus
     */
    public String getReportStatus() {
        return this.reportStatus;
    }

    /**
     * @return reportSubItems
     */
    public java.util.List<ReportSubItems> getReportSubItems() {
        return this.reportSubItems;
    }

    /**
     * @return reportSummary
     */
    public String getReportSummary() {
        return this.reportSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Boolean latest; 
        private String reportDescription; 
        private String reportId; 
        private Long reportScore; 
        private String reportStatus; 
        private java.util.List<ReportSubItems> reportSubItems; 
        private String reportSummary; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceReportAttributeResponseBody model) {
            this.latest = model.latest;
            this.reportDescription = model.reportDescription;
            this.reportId = model.reportId;
            this.reportScore = model.reportScore;
            this.reportStatus = model.reportStatus;
            this.reportSubItems = model.reportSubItems;
            this.reportSummary = model.reportSummary;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>Indicates whether the report is the latest one.</p>
         */
        public Builder latest(Boolean latest) {
            this.latest = latest;
            return this;
        }

        /**
         * <p>The detailed description of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>No critical risks were found in this inspection</p>
         */
        public Builder reportDescription(String reportDescription) {
            this.reportDescription = reportDescription;
            return this;
        }

        /**
         * <p>The ID of the instance inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>report-001</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The overall score of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder reportScore(Long reportScore) {
            this.reportScore = reportScore;
            return this;
        }

        /**
         * <p>The generation status of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        public Builder reportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }

        /**
         * <p>The check results in the report.</p>
         */
        public Builder reportSubItems(java.util.List<ReportSubItems> reportSubItems) {
            this.reportSubItems = reportSubItems;
            return this;
        }

        /**
         * <p>The overall summary of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance is running normally</p>
         */
        public Builder reportSummary(String reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the inspection task that generated the report.</p>
         * 
         * <strong>example:</strong>
         * <p>task-001</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DescribeInstanceReportAttributeResponseBody build() {
            return new DescribeInstanceReportAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceReportAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceReportAttributeResponseBody</p>
     */
    public static class ReportSubItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Long score;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private ReportSubItems(Builder builder) {
            this.riskLevel = builder.riskLevel;
            this.score = builder.score;
            this.skillName = builder.skillName;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportSubItems create() {
            return builder().build();
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return score
         */
        public Long getScore() {
            return this.score;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String riskLevel; 
            private Long score; 
            private String skillName; 
            private String summary; 

            private Builder() {
            } 

            private Builder(ReportSubItems model) {
                this.riskLevel = model.riskLevel;
                this.score = model.score;
                this.skillName = model.skillName;
                this.summary = model.summary;
            } 

            /**
             * <p>The risk level of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The score of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder score(Long score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The name of the inspection skill that generated the check result.</p>
             * 
             * <strong>example:</strong>
             * <p>performance</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The result summary of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>No anomalies found</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public ReportSubItems build() {
                return new ReportSubItems(this);
            } 

        } 

    }
}
