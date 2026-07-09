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
 * {@link GetEvaluationRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetEvaluationRunResponseBody</p>
 */
public class GetEvaluationRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("dataEndTime")
    private Long dataEndTime;

    @com.aliyun.core.annotation.NameInMap("dataStartTime")
    private Long dataStartTime;

    @com.aliyun.core.annotation.NameInMap("evaluatorProgress")
    private java.util.List<EvaluatorProgress> evaluatorProgress;

    @com.aliyun.core.annotation.NameInMap("evaluators")
    private String evaluators;

    @com.aliyun.core.annotation.NameInMap("failedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("runName")
    private String runName;

    @com.aliyun.core.annotation.NameInMap("runType")
    private String runType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("successCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    private GetEvaluationRunResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.dataEndTime = builder.dataEndTime;
        this.dataStartTime = builder.dataStartTime;
        this.evaluatorProgress = builder.evaluatorProgress;
        this.evaluators = builder.evaluators;
        this.failedCount = builder.failedCount;
        this.requestId = builder.requestId;
        this.runId = builder.runId;
        this.runName = builder.runName;
        this.runType = builder.runType;
        this.status = builder.status;
        this.successCount = builder.successCount;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEvaluationRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return dataEndTime
     */
    public Long getDataEndTime() {
        return this.dataEndTime;
    }

    /**
     * @return dataStartTime
     */
    public Long getDataStartTime() {
        return this.dataStartTime;
    }

    /**
     * @return evaluatorProgress
     */
    public java.util.List<EvaluatorProgress> getEvaluatorProgress() {
        return this.evaluatorProgress;
    }

    /**
     * @return evaluators
     */
    public String getEvaluators() {
        return this.evaluators;
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return runName
     */
    public String getRunName() {
        return this.runName;
    }

    /**
     * @return runType
     */
    public String getRunType() {
        return this.runType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Long createdAt; 
        private Long dataEndTime; 
        private Long dataStartTime; 
        private java.util.List<EvaluatorProgress> evaluatorProgress; 
        private String evaluators; 
        private Integer failedCount; 
        private String requestId; 
        private String runId; 
        private String runName; 
        private String runType; 
        private String status; 
        private Integer successCount; 
        private String taskId; 
        private Integer totalCount; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(GetEvaluationRunResponseBody model) {
            this.createdAt = model.createdAt;
            this.dataEndTime = model.dataEndTime;
            this.dataStartTime = model.dataStartTime;
            this.evaluatorProgress = model.evaluatorProgress;
            this.evaluators = model.evaluators;
            this.failedCount = model.failedCount;
            this.requestId = model.requestId;
            this.runId = model.runId;
            this.runName = model.runName;
            this.runType = model.runType;
            this.status = model.status;
            this.successCount = model.successCount;
            this.taskId = model.taskId;
            this.totalCount = model.totalCount;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * dataEndTime.
         */
        public Builder dataEndTime(Long dataEndTime) {
            this.dataEndTime = dataEndTime;
            return this;
        }

        /**
         * dataStartTime.
         */
        public Builder dataStartTime(Long dataStartTime) {
            this.dataStartTime = dataStartTime;
            return this;
        }

        /**
         * evaluatorProgress.
         */
        public Builder evaluatorProgress(java.util.List<EvaluatorProgress> evaluatorProgress) {
            this.evaluatorProgress = evaluatorProgress;
            return this;
        }

        /**
         * evaluators.
         */
        public Builder evaluators(String evaluators) {
            this.evaluators = evaluators;
            return this;
        }

        /**
         * failedCount.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * runName.
         */
        public Builder runName(String runName) {
            this.runName = runName;
            return this;
        }

        /**
         * runType.
         */
        public Builder runType(String runType) {
            this.runType = runType;
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
         * successCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetEvaluationRunResponseBody build() {
            return new GetEvaluationRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEvaluationRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetEvaluationRunResponseBody</p>
     */
    public static class EvaluatorProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("evaluatorName")
        private String evaluatorName;

        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private EvaluatorProgress(Builder builder) {
            this.evaluatorName = builder.evaluatorName;
            this.failedCount = builder.failedCount;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluatorProgress create() {
            return builder().build();
        }

        /**
         * @return evaluatorName
         */
        public String getEvaluatorName() {
            return this.evaluatorName;
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String evaluatorName; 
            private Integer failedCount; 
            private Integer successCount; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(EvaluatorProgress model) {
                this.evaluatorName = model.evaluatorName;
                this.failedCount = model.failedCount;
                this.successCount = model.successCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * evaluatorName.
             */
            public Builder evaluatorName(String evaluatorName) {
                this.evaluatorName = evaluatorName;
                return this;
            }

            /**
             * failedCount.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * successCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public EvaluatorProgress build() {
                return new EvaluatorProgress(this);
            } 

        } 

    }
}
