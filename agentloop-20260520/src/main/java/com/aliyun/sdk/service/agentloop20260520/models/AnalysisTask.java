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
 * {@link AnalysisTask} extends {@link TeaModel}
 *
 * <p>AnalysisTask</p>
 */
public class AnalysisTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("completedAt")
    private Long completedAt;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("report")
    private java.util.Map<String, ?> report;

    @com.aliyun.core.annotation.NameInMap("selectedCount")
    private Integer selectedCount;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    private AnalysisTask(Builder builder) {
        this.completedAt = builder.completedAt;
        this.createdAt = builder.createdAt;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.report = builder.report;
        this.selectedCount = builder.selectedCount;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalysisTask create() {
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
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
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
     * @return report
     */
    public java.util.Map<String, ?> getReport() {
        return this.report;
    }

    /**
     * @return selectedCount
     */
    public Integer getSelectedCount() {
        return this.selectedCount;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private Long completedAt; 
        private Long createdAt; 
        private String errorCode; 
        private String errorMessage; 
        private java.util.Map<String, ?> report; 
        private Integer selectedCount; 
        private String status; 
        private String taskId; 
        private String taskName; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(AnalysisTask model) {
            this.completedAt = model.completedAt;
            this.createdAt = model.createdAt;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.report = model.report;
            this.selectedCount = model.selectedCount;
            this.status = model.status;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
            this.taskType = model.taskType;
        } 

        /**
         * <p>The task completion time as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1789747260000</p>
         */
        public Builder completedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * <p>The task creation time as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1789747200000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The error code for the task failure.</p>
         * 
         * <strong>example:</strong>
         * <p>NO_VALID_ATTRIBUTION_LABEL</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message for the task failure.</p>
         * 
         * <strong>example:</strong>
         * <p>No valid attribution label was found</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The generated analysis report. This field is typically not returned by list operations.</p>
         */
        public Builder report(java.util.Map<String, ?> report) {
            this.report = report;
            return this;
        }

        /**
         * <p>The number of evaluation details selected by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder selectedCount(Integer selectedCount) {
            this.selectedCount = selectedCount;
            return this;
        }

        /**
         * <p>The task status. Valid values: PENDING, RUNNING, SUCCEEDED, PARTIAL_SUCCEEDED, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The analysis task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>analysis-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The analysis task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Low-score sample attribution analysis</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The analysis task type.</p>
         * 
         * <strong>example:</strong>
         * <p>ATTRIBUTION_SUMMARY</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public AnalysisTask build() {
            return new AnalysisTask(this);
        } 

    } 

}
