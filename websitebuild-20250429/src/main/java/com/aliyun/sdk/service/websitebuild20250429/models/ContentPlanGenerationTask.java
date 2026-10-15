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
 * {@link ContentPlanGenerationTask} extends {@link TeaModel}
 *
 * <p>ContentPlanGenerationTask</p>
 */
public class ContentPlanGenerationTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Analysis")
    private Analysis analysis;

    @com.aliyun.core.annotation.NameInMap("AnalysisTaskId")
    private String analysisTaskId;

    @com.aliyun.core.annotation.NameInMap("ConfigRevision")
    private Long configRevision;

    @com.aliyun.core.annotation.NameInMap("DiagnosisTaskId")
    private String diagnosisTaskId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ReportConfigRevision")
    private Long reportConfigRevision;

    @com.aliyun.core.annotation.NameInMap("StaleConfig")
    private Boolean staleConfig;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubmittedAt")
    private Long submittedAt;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    private ContentPlanGenerationTask(Builder builder) {
        this.analysis = builder.analysis;
        this.analysisTaskId = builder.analysisTaskId;
        this.configRevision = builder.configRevision;
        this.diagnosisTaskId = builder.diagnosisTaskId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.planId = builder.planId;
        this.progress = builder.progress;
        this.projectId = builder.projectId;
        this.reportConfigRevision = builder.reportConfigRevision;
        this.staleConfig = builder.staleConfig;
        this.status = builder.status;
        this.submittedAt = builder.submittedAt;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContentPlanGenerationTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysis
     */
    public Analysis getAnalysis() {
        return this.analysis;
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
     * @return diagnosisTaskId
     */
    public String getDiagnosisTaskId() {
        return this.diagnosisTaskId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return reportConfigRevision
     */
    public Long getReportConfigRevision() {
        return this.reportConfigRevision;
    }

    /**
     * @return staleConfig
     */
    public Boolean getStaleConfig() {
        return this.staleConfig;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return submittedAt
     */
    public Long getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Analysis analysis; 
        private String analysisTaskId; 
        private Long configRevision; 
        private String diagnosisTaskId; 
        private String errorCode; 
        private String errorMessage; 
        private String planId; 
        private Integer progress; 
        private String projectId; 
        private Long reportConfigRevision; 
        private Boolean staleConfig; 
        private String status; 
        private Long submittedAt; 
        private String taskId; 
        private String taskType; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(ContentPlanGenerationTask model) {
            this.analysis = model.analysis;
            this.analysisTaskId = model.analysisTaskId;
            this.configRevision = model.configRevision;
            this.diagnosisTaskId = model.diagnosisTaskId;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.planId = model.planId;
            this.progress = model.progress;
            this.projectId = model.projectId;
            this.reportConfigRevision = model.reportConfigRevision;
            this.staleConfig = model.staleConfig;
            this.status = model.status;
            this.submittedAt = model.submittedAt;
            this.taskId = model.taskId;
            this.taskType = model.taskType;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The analysis conclusions, returned only after the analysis task succeeds.</p>
         */
        public Builder analysis(Analysis analysis) {
            this.analysis = analysis;
            return this;
        }

        /**
         * <p>The ID of the analysis task on which the scheduling task is based.</p>
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
         * <p>The ID of the GEO diagnostic task used by the analysis node.</p>
         * 
         * <strong>example:</strong>
         * <p>1f2e3d4c-5b6a-4798-8a9b-c0d1e2f3a4b5</p>
         */
        public Builder diagnosisTaskId(String diagnosisTaskId) {
            this.diagnosisTaskId = diagnosisTaskId;
            return this;
        }

        /**
         * <p>The error code for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT_PLAN_AGENT_TIMEOUT</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Content plan generation timed out. Please try again later</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the content plan generated after the scheduling task succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The task progress, ranging from 0 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The ID of the workspace, which refers to the GEO workspace for brand marketing, namely the appWorkspaceId.</p>
         * 
         * <strong>example:</strong>
         * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The workspace configuration version on which the diagnostic report is based. The analysis, scheduling, and article generation processes always read this version.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder reportConfigRevision(Long reportConfigRevision) {
            this.reportConfigRevision = reportConfigRevision;
            return this;
        }

        /**
         * <p>Indicates whether the diagnostic report is generated based on an outdated configuration. If the value is true, the frontend should prompt the user.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder staleConfig(Boolean staleConfig) {
            this.staleConfig = staleConfig;
            return this;
        }

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The submission time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        public Builder submittedAt(Long submittedAt) {
            this.submittedAt = submittedAt;
            return this;
        }

        /**
         * <p>The ID of the generation task.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_9b7d4a5f8c0e1d2b3a4c5d6e3f7a1c2e</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task type. Valid values: ANALYSIS and SCHEDULE.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The last update time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660900000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ContentPlanGenerationTask build() {
            return new ContentPlanGenerationTask(this);
        } 

    } 

    /**
     * 
     * {@link ContentPlanGenerationTask} extends {@link TeaModel}
     *
     * <p>ContentPlanGenerationTask</p>
     */
    public static class Modules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("KeyQuestions")
        private java.util.List<String> keyQuestions;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Modules(Builder builder) {
            this.content = builder.content;
            this.keyQuestions = builder.keyQuestions;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return keyQuestions
         */
        public java.util.List<String> getKeyQuestions() {
            return this.keyQuestions;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<String> keyQuestions; 
            private String title; 

            private Builder() {
            } 

            private Builder(Modules model) {
                this.content = model.content;
                this.keyQuestions = model.keyQuestions;
                this.title = model.title;
            } 

            /**
             * <p>The module content.</p>
             * 
             * <strong>example:</strong>
             * <p>The current brand mention rate in the AI website builder category is lower than the industry average, and user perception is mostly focused on pricing</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The key questions.</p>
             */
            public Builder keyQuestions(java.util.List<String> keyQuestions) {
                this.keyQuestions = keyQuestions;
                return this;
            }

            /**
             * <p>The module title.</p>
             * 
             * <strong>example:</strong>
             * <p>Current status of brand awareness</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ContentPlanGenerationTask} extends {@link TeaModel}
     *
     * <p>ContentPlanGenerationTask</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Modules")
        private java.util.List<Modules> modules;

        @com.aliyun.core.annotation.NameInMap("ReferenceWritingNotes")
        private java.util.List<String> referenceWritingNotes;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private Analysis(Builder builder) {
            this.modules = builder.modules;
            this.referenceWritingNotes = builder.referenceWritingNotes;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return modules
         */
        public java.util.List<Modules> getModules() {
            return this.modules;
        }

        /**
         * @return referenceWritingNotes
         */
        public java.util.List<String> getReferenceWritingNotes() {
            return this.referenceWritingNotes;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List<Modules> modules; 
            private java.util.List<String> referenceWritingNotes; 
            private String summary; 

            private Builder() {
            } 

            private Builder(Analysis model) {
                this.modules = model.modules;
                this.referenceWritingNotes = model.referenceWritingNotes;
                this.summary = model.summary;
            } 

            /**
             * <p>The analysis modules.</p>
             */
            public Builder modules(java.util.List<Modules> modules) {
                this.modules = modules;
                return this;
            }

            /**
             * <p>The reference article writing guidelines, which include only structure and perspective, excluding third-party facts.</p>
             */
            public Builder referenceWritingNotes(java.util.List<String> referenceWritingNotes) {
                this.referenceWritingNotes = referenceWritingNotes;
                return this;
            }

            /**
             * <p>The analysis summary.</p>
             * 
             * <strong>example:</strong>
             * <p>Insufficient brand awareness is the current main shortcoming. It is recommended to prioritize adding content related to product capabilities</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
}
