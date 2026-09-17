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
         * <p>The list of run summaries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;runId&quot;:&quot;eval-run-4fd47f3d7e684e15b1d3d178c6a5b81a&quot;,&quot;runType&quot;:&quot;backfill&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;totalCount&quot;:100}]</p>
         */
        public Builder evaluationRuns(java.util.List<EvaluationRuns> evaluationRuns) {
            this.evaluationRuns = evaluationRuns;
            return this;
        }

        /**
         * <p>The number of entries per page used in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. An empty value indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJsYXN0SWQiOjEyMH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of runs that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
             * <p>The creation time, in seconds-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The end time of the data window for this run, in seconds-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782902400</p>
             */
            public Builder dataEndTime(Long dataEndTime) {
                this.dataEndTime = dataEndTime;
                return this;
            }

            /**
             * <p>The start time of the data window for this run, in seconds-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder dataStartTime(Long dataStartTime) {
                this.dataStartTime = dataStartTime;
                return this;
            }

            /**
             * <p>The number of failed entries.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eval-run-4fd47f3d7e684e15b1d3d178c6a5b81a</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The run name.</p>
             * 
             * <strong>example:</strong>
             * <p>trace_task_completion_eval-backfill</p>
             */
            public Builder runName(String runName) {
                this.runName = runName;
                return this;
            }

            /**
             * <p>The run type.</p>
             * 
             * <strong>example:</strong>
             * <p>backfill</p>
             */
            public Builder runType(String runType) {
                this.runType = runType;
                return this;
            }

            /**
             * <p>The run status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of successful entries.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The evaluation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total number of evaluation entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The update time, in seconds-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816600</p>
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
