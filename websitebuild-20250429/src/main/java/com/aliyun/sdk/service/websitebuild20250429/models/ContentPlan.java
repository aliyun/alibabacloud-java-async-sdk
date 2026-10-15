// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ContentPlan} extends {@link TeaModel}
 *
 * <p>ContentPlan</p>
 */
public class ContentPlan extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalRequirements")
    private String additionalRequirements;

    @com.aliyun.core.annotation.NameInMap("AnalysisTaskId")
    private String analysisTaskId;

    @com.aliyun.core.annotation.NameInMap("ConfigRevision")
    private Long configRevision;

    @com.aliyun.core.annotation.NameInMap("DiagnosisCompletedAt")
    private Long diagnosisCompletedAt;

    @com.aliyun.core.annotation.NameInMap("DiagnosisTaskId")
    private String diagnosisTaskId;

    @com.aliyun.core.annotation.NameInMap("DiagnosisType")
    private String diagnosisType;

    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("GenerationTaskId")
    private String generationTaskId;

    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("PublishFrequency")
    private Integer publishFrequency;

    @com.aliyun.core.annotation.NameInMap("ReportConfigRevision")
    private Long reportConfigRevision;

    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("SupersededBy")
    private String supersededBy;

    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.NameInMap("Weekdays")
    private java.util.List<Integer> weekdays;

    private ContentPlan(Builder builder) {
        this.additionalRequirements = builder.additionalRequirements;
        this.analysisTaskId = builder.analysisTaskId;
        this.configRevision = builder.configRevision;
        this.diagnosisCompletedAt = builder.diagnosisCompletedAt;
        this.diagnosisTaskId = builder.diagnosisTaskId;
        this.diagnosisType = builder.diagnosisType;
        this.endDate = builder.endDate;
        this.generationTaskId = builder.generationTaskId;
        this.planId = builder.planId;
        this.projectId = builder.projectId;
        this.publishFrequency = builder.publishFrequency;
        this.reportConfigRevision = builder.reportConfigRevision;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.summary = builder.summary;
        this.supersededBy = builder.supersededBy;
        this.timezone = builder.timezone;
        this.weekdays = builder.weekdays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContentPlan create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalRequirements
     */
    public String getAdditionalRequirements() {
        return this.additionalRequirements;
    }

    /**
     * @return analysisTaskId
     */
    public String getAnalysisTaskId() {
        return this.analysisTaskId;
    }

    /**
     * @return configRevision
     */
    public Long getConfigRevision() {
        return this.configRevision;
    }

    /**
     * @return diagnosisCompletedAt
     */
    public Long getDiagnosisCompletedAt() {
        return this.diagnosisCompletedAt;
    }

    /**
     * @return diagnosisTaskId
     */
    public String getDiagnosisTaskId() {
        return this.diagnosisTaskId;
    }

    /**
     * @return diagnosisType
     */
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return generationTaskId
     */
    public String getGenerationTaskId() {
        return this.generationTaskId;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return publishFrequency
     */
    public Integer getPublishFrequency() {
        return this.publishFrequency;
    }

    /**
     * @return reportConfigRevision
     */
    public Long getReportConfigRevision() {
        return this.reportConfigRevision;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return supersededBy
     */
    public String getSupersededBy() {
        return this.supersededBy;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return weekdays
     */
    public java.util.List<Integer> getWeekdays() {
        return this.weekdays;
    }

    public static final class Builder {
        private String additionalRequirements; 
        private String analysisTaskId; 
        private Long configRevision; 
        private Long diagnosisCompletedAt; 
        private String diagnosisTaskId; 
        private String diagnosisType; 
        private String endDate; 
        private String generationTaskId; 
        private String planId; 
        private String projectId; 
        private Integer publishFrequency; 
        private Long reportConfigRevision; 
        private String startDate; 
        private String status; 
        private String summary; 
        private String supersededBy; 
        private String timezone; 
        private java.util.List<Integer> weekdays; 

        private Builder() {
        } 

        private Builder(ContentPlan model) {
            this.additionalRequirements = model.additionalRequirements;
            this.analysisTaskId = model.analysisTaskId;
            this.configRevision = model.configRevision;
            this.diagnosisCompletedAt = model.diagnosisCompletedAt;
            this.diagnosisTaskId = model.diagnosisTaskId;
            this.diagnosisType = model.diagnosisType;
            this.endDate = model.endDate;
            this.generationTaskId = model.generationTaskId;
            this.planId = model.planId;
            this.projectId = model.projectId;
            this.publishFrequency = model.publishFrequency;
            this.reportConfigRevision = model.reportConfigRevision;
            this.startDate = model.startDate;
            this.status = model.status;
            this.summary = model.summary;
            this.supersededBy = model.supersededBy;
            this.timezone = model.timezone;
            this.weekdays = model.weekdays;
        } 

        /**
         * <p>The additional user comments.</p>
         * 
         * <strong>example:</strong>
         * <p>Highlight the differentiated capabilities of the product and avoid exaggerated claims</p>
         */
        public Builder additionalRequirements(String additionalRequirements) {
            this.additionalRequirements = additionalRequirements;
            return this;
        }

        /**
         * <p>The ID of the analysis task used for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_1a2b3c4d5e6f708192a3b4c5d6e7f809</p>
         */
        public Builder analysisTaskId(String analysisTaskId) {
            this.analysisTaskId = analysisTaskId;
            return this;
        }

        /**
         * <p>The current configuration version of the workspace when the analysis is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder configRevision(Long configRevision) {
            this.configRevision = configRevision;
            return this;
        }

        /**
         * <p>The completion time of the GEO diagnosis, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        public Builder diagnosisCompletedAt(Long diagnosisCompletedAt) {
            this.diagnosisCompletedAt = diagnosisCompletedAt;
            return this;
        }

        /**
         * <p>The ID of the GEO diagnostic node.</p>
         * 
         * <strong>example:</strong>
         * <p>1f2e3d4c-5b6a-4798-8a9b-c0d1e2f3a4b5</p>
         */
        public Builder diagnosisTaskId(String diagnosisTaskId) {
            this.diagnosisTaskId = diagnosisTaskId;
            return this;
        }

        /**
         * <p>The type of the GEO diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>GEO_BRAND</p>
         */
        public Builder diagnosisType(String diagnosisType) {
            this.diagnosisType = diagnosisType;
            return this;
        }

        /**
         * <p>The end date of the plan in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-18</p>
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The ID of the generation task.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_9b7d4a5f8c0e1d2b3a4c5d6e3f7a1c2e</p>
         */
        public Builder generationTaskId(String generationTaskId) {
            this.generationTaskId = generationTaskId;
            return this;
        }

        /**
         * <p>The ID of the content plan.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the workspace, which is the GEO workspace for brand marketing and corresponds to the appWorkspaceId.</p>
         * 
         * <strong>example:</strong>
         * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The number of scheduled articles, which equals the number of matched generation days.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder publishFrequency(Integer publishFrequency) {
            this.publishFrequency = publishFrequency;
            return this;
        }

        /**
         * <p>The workspace configuration version used for the diagnostic report, which is strictly read during article generation.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder reportConfigRevision(Long reportConfigRevision) {
            this.reportConfigRevision = reportConfigRevision;
            return this;
        }

        /**
         * <p>The start date of the plan in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12</p>
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The status of the plan. Valid values: ACTIVE, SUPERSEDED, COMPLETED, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The summary of the overall strategy for the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>This week focuses on two themes: brand awareness and product capabilities, with a total of three articles</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The ID of the new plan that supersedes the current plan.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e3f</p>
         */
        public Builder supersededBy(String supersededBy) {
            this.supersededBy = supersededBy;
            return this;
        }

        /**
         * <p>The IANA time zone used for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The weekly generation days, where ISO weekday 1 represents Monday and 7 represents Sunday.</p>
         */
        public Builder weekdays(java.util.List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }

        public ContentPlan build() {
            return new ContentPlan(this);
        } 

    } 

}
