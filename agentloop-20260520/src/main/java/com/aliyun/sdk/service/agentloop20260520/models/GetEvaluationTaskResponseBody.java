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
 * {@link GetEvaluationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetEvaluationTaskResponseBody</p>
 */
public class GetEvaluationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, String> config;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("dataFilter")
    private String dataFilter;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluator> evaluators;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

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

    private GetEvaluationTaskResponseBody(Builder builder) {
        this.agentSpace = builder.agentSpace;
        this.channel = builder.channel;
        this.config = builder.config;
        this.createdAt = builder.createdAt;
        this.dataFilter = builder.dataFilter;
        this.dataType = builder.dataType;
        this.description = builder.description;
        this.evaluators = builder.evaluators;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
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

    public static GetEvaluationTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
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
     * @return dataFilter
     */
    public String getDataFilter() {
        return this.dataFilter;
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
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String agentSpace; 
        private String channel; 
        private java.util.Map<String, String> config; 
        private Long createdAt; 
        private String dataFilter; 
        private String dataType; 
        private String description; 
        private java.util.List<Evaluator> evaluators; 
        private String regionId; 
        private String requestId; 
        private RunStrategies runStrategyConfig; 
        private String status; 
        private java.util.Map<String, String> tags; 
        private String taskId; 
        private String taskMode; 
        private String taskName; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(GetEvaluationTaskResponseBody model) {
            this.agentSpace = model.agentSpace;
            this.channel = model.channel;
            this.config = model.config;
            this.createdAt = model.createdAt;
            this.dataFilter = model.dataFilter;
            this.dataType = model.dataType;
            this.description = model.description;
            this.evaluators = model.evaluators;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.runStrategyConfig = model.runStrategyConfig;
            this.status = model.status;
            this.tags = model.tags;
            this.taskId = model.taskId;
            this.taskMode = model.taskMode;
            this.taskName = model.taskName;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
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
         * dataFilter.
         */
        public Builder dataFilter(String dataFilter) {
            this.dataFilter = dataFilter;
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
        public Builder evaluators(java.util.List<Evaluator> evaluators) {
            this.evaluators = evaluators;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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

        public GetEvaluationTaskResponseBody build() {
            return new GetEvaluationTaskResponseBody(this);
        } 

    } 

}
