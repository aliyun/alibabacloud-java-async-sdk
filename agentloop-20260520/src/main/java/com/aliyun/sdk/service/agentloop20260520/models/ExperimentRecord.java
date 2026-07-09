// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ExperimentRecord} extends {@link TeaModel}
 *
 * <p>ExperimentRecord</p>
 */
public class ExperimentRecord extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("completedAt")
    private Long completedAt;

    @com.aliyun.core.annotation.NameInMap("completedTasks")
    private Integer completedTasks;

    @com.aliyun.core.annotation.NameInMap("dataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("datasetProject")
    private String datasetProject;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("evaluationTaskId")
    private String evaluationTaskId;

    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluator> evaluators;

    @com.aliyun.core.annotation.NameInMap("executedAt")
    private Long executedAt;

    @com.aliyun.core.annotation.NameInMap("experimentConfig")
    private java.util.List<ExperimentConfig> experimentConfig;

    @com.aliyun.core.annotation.NameInMap("experimentPlanId")
    private String experimentPlanId;

    @com.aliyun.core.annotation.NameInMap("failedTasks")
    private Integer failedTasks;

    @com.aliyun.core.annotation.NameInMap("input")
    private java.util.Map<String, ?> input;

    @com.aliyun.core.annotation.NameInMap("modelNames")
    private java.util.List<String> modelNames;

    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Float progress;

    @com.aliyun.core.annotation.NameInMap("querySql")
    private String querySql;

    @com.aliyun.core.annotation.NameInMap("recordId")
    private String recordId;

    @com.aliyun.core.annotation.NameInMap("recordName")
    private String recordName;

    @com.aliyun.core.annotation.NameInMap("selectedItemIds")
    private java.util.List<String> selectedItemIds;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("totalTasks")
    private Integer totalTasks;

    private ExperimentRecord(Builder builder) {
        this.completedAt = builder.completedAt;
        this.completedTasks = builder.completedTasks;
        this.dataSourceType = builder.dataSourceType;
        this.datasetId = builder.datasetId;
        this.datasetProject = builder.datasetProject;
        this.errorMessage = builder.errorMessage;
        this.evaluationTaskId = builder.evaluationTaskId;
        this.evaluators = builder.evaluators;
        this.executedAt = builder.executedAt;
        this.experimentConfig = builder.experimentConfig;
        this.experimentPlanId = builder.experimentPlanId;
        this.failedTasks = builder.failedTasks;
        this.input = builder.input;
        this.modelNames = builder.modelNames;
        this.planName = builder.planName;
        this.progress = builder.progress;
        this.querySql = builder.querySql;
        this.recordId = builder.recordId;
        this.recordName = builder.recordName;
        this.selectedItemIds = builder.selectedItemIds;
        this.status = builder.status;
        this.totalTasks = builder.totalTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExperimentRecord create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completedAt
     */
    public Long getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return completedTasks
     */
    public Integer getCompletedTasks() {
        return this.completedTasks;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetProject
     */
    public String getDatasetProject() {
        return this.datasetProject;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return evaluationTaskId
     */
    public String getEvaluationTaskId() {
        return this.evaluationTaskId;
    }

    /**
     * @return evaluators
     */
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    /**
     * @return executedAt
     */
    public Long getExecutedAt() {
        return this.executedAt;
    }

    /**
     * @return experimentConfig
     */
    public java.util.List<ExperimentConfig> getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * @return experimentPlanId
     */
    public String getExperimentPlanId() {
        return this.experimentPlanId;
    }

    /**
     * @return failedTasks
     */
    public Integer getFailedTasks() {
        return this.failedTasks;
    }

    /**
     * @return input
     */
    public java.util.Map<String, ?> getInput() {
        return this.input;
    }

    /**
     * @return modelNames
     */
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return progress
     */
    public Float getProgress() {
        return this.progress;
    }

    /**
     * @return querySql
     */
    public String getQuerySql() {
        return this.querySql;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return selectedItemIds
     */
    public java.util.List<String> getSelectedItemIds() {
        return this.selectedItemIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalTasks
     */
    public Integer getTotalTasks() {
        return this.totalTasks;
    }

    public static final class Builder {
        private Long completedAt; 
        private Integer completedTasks; 
        private String dataSourceType; 
        private String datasetId; 
        private String datasetProject; 
        private String errorMessage; 
        private String evaluationTaskId; 
        private java.util.List<Evaluator> evaluators; 
        private Long executedAt; 
        private java.util.List<ExperimentConfig> experimentConfig; 
        private String experimentPlanId; 
        private Integer failedTasks; 
        private java.util.Map<String, ?> input; 
        private java.util.List<String> modelNames; 
        private String planName; 
        private Float progress; 
        private String querySql; 
        private String recordId; 
        private String recordName; 
        private java.util.List<String> selectedItemIds; 
        private String status; 
        private Integer totalTasks; 

        private Builder() {
        } 

        private Builder(ExperimentRecord model) {
            this.completedAt = model.completedAt;
            this.completedTasks = model.completedTasks;
            this.dataSourceType = model.dataSourceType;
            this.datasetId = model.datasetId;
            this.datasetProject = model.datasetProject;
            this.errorMessage = model.errorMessage;
            this.evaluationTaskId = model.evaluationTaskId;
            this.evaluators = model.evaluators;
            this.executedAt = model.executedAt;
            this.experimentConfig = model.experimentConfig;
            this.experimentPlanId = model.experimentPlanId;
            this.failedTasks = model.failedTasks;
            this.input = model.input;
            this.modelNames = model.modelNames;
            this.planName = model.planName;
            this.progress = model.progress;
            this.querySql = model.querySql;
            this.recordId = model.recordId;
            this.recordName = model.recordName;
            this.selectedItemIds = model.selectedItemIds;
            this.status = model.status;
            this.totalTasks = model.totalTasks;
        } 

        /**
         * completedAt.
         */
        public Builder completedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * completedTasks.
         */
        public Builder completedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }

        /**
         * dataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * datasetProject.
         */
        public Builder datasetProject(String datasetProject) {
            this.datasetProject = datasetProject;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * evaluationTaskId.
         */
        public Builder evaluationTaskId(String evaluationTaskId) {
            this.evaluationTaskId = evaluationTaskId;
            return this;
        }

        /**
         * evaluators.
         */
        public Builder evaluators(java.util.List<Evaluator> evaluators) {
            this.evaluators = evaluators;
            return this;
        }

        /**
         * executedAt.
         */
        public Builder executedAt(Long executedAt) {
            this.executedAt = executedAt;
            return this;
        }

        /**
         * experimentConfig.
         */
        public Builder experimentConfig(java.util.List<ExperimentConfig> experimentConfig) {
            this.experimentConfig = experimentConfig;
            return this;
        }

        /**
         * experimentPlanId.
         */
        public Builder experimentPlanId(String experimentPlanId) {
            this.experimentPlanId = experimentPlanId;
            return this;
        }

        /**
         * failedTasks.
         */
        public Builder failedTasks(Integer failedTasks) {
            this.failedTasks = failedTasks;
            return this;
        }

        /**
         * input.
         */
        public Builder input(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }

        /**
         * modelNames.
         */
        public Builder modelNames(java.util.List<String> modelNames) {
            this.modelNames = modelNames;
            return this;
        }

        /**
         * planName.
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * progress.
         */
        public Builder progress(Float progress) {
            this.progress = progress;
            return this;
        }

        /**
         * querySql.
         */
        public Builder querySql(String querySql) {
            this.querySql = querySql;
            return this;
        }

        /**
         * recordId.
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * recordName.
         */
        public Builder recordName(String recordName) {
            this.recordName = recordName;
            return this;
        }

        /**
         * selectedItemIds.
         */
        public Builder selectedItemIds(java.util.List<String> selectedItemIds) {
            this.selectedItemIds = selectedItemIds;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * totalTasks.
         */
        public Builder totalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }

        public ExperimentRecord build() {
            return new ExperimentRecord(this);
        } 

    } 

}
