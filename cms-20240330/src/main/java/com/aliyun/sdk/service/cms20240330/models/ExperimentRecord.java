// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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

    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluator> evaluators;

    @com.aliyun.core.annotation.NameInMap("executedAt")
    private Long executedAt;

    @com.aliyun.core.annotation.NameInMap("experimentConfig")
    private ExperimentConfig experimentConfig;

    @com.aliyun.core.annotation.NameInMap("experimentName")
    private String experimentName;

    @com.aliyun.core.annotation.NameInMap("failedTasks")
    private Integer failedTasks;

    @com.aliyun.core.annotation.NameInMap("input")
    private java.util.Map<String, ?> input;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Float progress;

    @com.aliyun.core.annotation.NameInMap("recordId")
    private String recordId;

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
        this.evaluators = builder.evaluators;
        this.executedAt = builder.executedAt;
        this.experimentConfig = builder.experimentConfig;
        this.experimentName = builder.experimentName;
        this.failedTasks = builder.failedTasks;
        this.input = builder.input;
        this.modelName = builder.modelName;
        this.planId = builder.planId;
        this.planName = builder.planName;
        this.progress = builder.progress;
        this.recordId = builder.recordId;
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
    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * @return experimentName
     */
    public String getExperimentName() {
        return this.experimentName;
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
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
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
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
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
        private java.util.List<Evaluator> evaluators; 
        private Long executedAt; 
        private ExperimentConfig experimentConfig; 
        private String experimentName; 
        private Integer failedTasks; 
        private java.util.Map<String, ?> input; 
        private String modelName; 
        private String planId; 
        private String planName; 
        private Float progress; 
        private String recordId; 
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
            this.evaluators = model.evaluators;
            this.executedAt = model.executedAt;
            this.experimentConfig = model.experimentConfig;
            this.experimentName = model.experimentName;
            this.failedTasks = model.failedTasks;
            this.input = model.input;
            this.modelName = model.modelName;
            this.planId = model.planId;
            this.planName = model.planName;
            this.progress = model.progress;
            this.recordId = model.recordId;
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
        public Builder experimentConfig(ExperimentConfig experimentConfig) {
            this.experimentConfig = experimentConfig;
            return this;
        }

        /**
         * experimentName.
         */
        public Builder experimentName(String experimentName) {
            this.experimentName = experimentName;
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
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(String planId) {
            this.planId = planId;
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
         * recordId.
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
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
