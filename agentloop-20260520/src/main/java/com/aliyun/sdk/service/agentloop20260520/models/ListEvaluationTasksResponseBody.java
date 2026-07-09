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
 * {@link ListEvaluationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluationTasksResponseBody</p>
 */
public class ListEvaluationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("evaluationTasks")
    private java.util.List<EvaluationTasks> evaluationTasks;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListEvaluationTasksResponseBody(Builder builder) {
        this.evaluationTasks = builder.evaluationTasks;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluationTasks
     */
    public java.util.List<EvaluationTasks> getEvaluationTasks() {
        return this.evaluationTasks;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<EvaluationTasks> evaluationTasks; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEvaluationTasksResponseBody model) {
            this.evaluationTasks = model.evaluationTasks;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * evaluationTasks.
         */
        public Builder evaluationTasks(java.util.List<EvaluationTasks> evaluationTasks) {
            this.evaluationTasks = evaluationTasks;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEvaluationTasksResponseBody build() {
            return new ListEvaluationTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationTasksResponseBody</p>
     */
    public static class EvaluationTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map<String, String> config;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("dataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("evaluators")
        private String evaluators;

        @com.aliyun.core.annotation.NameInMap("runStrategyConfig")
        private RunStrategies runStrategyConfig;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.Map<String, String> tags;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskMode")
        private String taskMode;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private Long updatedAt;

        private EvaluationTasks(Builder builder) {
            this.config = builder.config;
            this.createdAt = builder.createdAt;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.evaluators = builder.evaluators;
            this.runStrategyConfig = builder.runStrategyConfig;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.taskMode = builder.taskMode;
            this.taskName = builder.taskName;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationTasks create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return evaluators
         */
        public String getEvaluators() {
            return this.evaluators;
        }

        /**
         * @return runStrategyConfig
         */
        public RunStrategies getRunStrategyConfig() {
            return this.runStrategyConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskMode
         */
        public String getTaskMode() {
            return this.taskMode;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private java.util.Map<String, String> config; 
            private Long createdAt; 
            private String dataType; 
            private String description; 
            private String evaluators; 
            private RunStrategies runStrategyConfig; 
            private String status; 
            private java.util.Map<String, String> tags; 
            private String taskId; 
            private String taskMode; 
            private String taskName; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(EvaluationTasks model) {
                this.config = model.config;
                this.createdAt = model.createdAt;
                this.dataType = model.dataType;
                this.description = model.description;
                this.evaluators = model.evaluators;
                this.runStrategyConfig = model.runStrategyConfig;
                this.status = model.status;
                this.tags = model.tags;
                this.taskId = model.taskId;
                this.taskMode = model.taskMode;
                this.taskName = model.taskName;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * config.
             */
            public Builder config(java.util.Map<String, String> config) {
                this.config = config;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * dataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * runStrategyConfig.
             */
            public Builder runStrategyConfig(RunStrategies runStrategyConfig) {
                this.runStrategyConfig = runStrategyConfig;
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
             * tags.
             */
            public Builder tags(java.util.Map<String, String> tags) {
                this.tags = tags;
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
             * taskMode.
             */
            public Builder taskMode(String taskMode) {
                this.taskMode = taskMode;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public EvaluationTasks build() {
                return new EvaluationTasks(this);
            } 

        } 

    }
}
