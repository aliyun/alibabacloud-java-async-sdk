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
 * {@link ListEvaluationRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluationRunsResponseBody</p>
 */
public class ListEvaluationRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("evaluationRuns")
    private java.util.List<EvaluationRuns> evaluationRuns;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListEvaluationRunsResponseBody(Builder builder) {
        this.evaluationRuns = builder.evaluationRuns;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluationRuns
     */
    public java.util.List<EvaluationRuns> getEvaluationRuns() {
        return this.evaluationRuns;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<EvaluationRuns> evaluationRuns; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListEvaluationRunsResponseBody model) {
            this.evaluationRuns = model.evaluationRuns;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * evaluationRuns.
         */
        public Builder evaluationRuns(java.util.List<EvaluationRuns> evaluationRuns) {
            this.evaluationRuns = evaluationRuns;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEvaluationRunsResponseBody build() {
            return new ListEvaluationRunsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluationRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationRunsResponseBody</p>
     */
    public static class EvaluationRuns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("dataEndTime")
        private Long dataEndTime;

        @com.aliyun.core.annotation.NameInMap("dataStartTime")
        private Long dataStartTime;

        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Integer failedCount;

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

        private EvaluationRuns(Builder builder) {
            this.createdAt = builder.createdAt;
            this.dataEndTime = builder.dataEndTime;
            this.dataStartTime = builder.dataStartTime;
            this.failedCount = builder.failedCount;
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

        public static EvaluationRuns create() {
            return builder().build();
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
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
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
            private Integer failedCount; 
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

            private Builder(EvaluationRuns model) {
                this.createdAt = model.createdAt;
                this.dataEndTime = model.dataEndTime;
                this.dataStartTime = model.dataStartTime;
                this.failedCount = model.failedCount;
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
             * failedCount.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
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

            public EvaluationRuns build() {
                return new EvaluationRuns(this);
            } 

        } 

    }
}
