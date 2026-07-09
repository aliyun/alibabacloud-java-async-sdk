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
 * {@link CreateEvaluationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateEvaluationTaskRequest</p>
 */
public class CreateEvaluationTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, String> config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataFilter")
    private String dataFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluator> evaluators;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runStrategies")
    private RunStrategies runStrategies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskMode")
    private String taskMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateEvaluationTaskRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.channel = builder.channel;
        this.config = builder.config;
        this.dataFilter = builder.dataFilter;
        this.dataType = builder.dataType;
        this.description = builder.description;
        this.evaluators = builder.evaluators;
        this.runStrategies = builder.runStrategies;
        this.tags = builder.tags;
        this.taskMode = builder.taskMode;
        this.taskName = builder.taskName;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEvaluationTaskRequest create() {
        return builder().build();
    }

@Override
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
     * @return runStrategies
     */
    public RunStrategies getRunStrategies() {
        return this.runStrategies;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateEvaluationTaskRequest, Builder> {
        private String agentSpace; 
        private String channel; 
        private java.util.Map<String, String> config; 
        private String dataFilter; 
        private String dataType; 
        private String description; 
        private java.util.List<Evaluator> evaluators; 
        private RunStrategies runStrategies; 
        private java.util.Map<String, String> tags; 
        private String taskMode; 
        private String taskName; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateEvaluationTaskRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.channel = request.channel;
            this.config = request.config;
            this.dataFilter = request.dataFilter;
            this.dataType = request.dataType;
            this.description = request.description;
            this.evaluators = request.evaluators;
            this.runStrategies = request.runStrategies;
            this.tags = request.tags;
            this.taskMode = request.taskMode;
            this.taskName = request.taskName;
            this.clientToken = request.clientToken;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * config.
         */
        public Builder config(java.util.Map<String, String> config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * dataFilter.
         */
        public Builder dataFilter(String dataFilter) {
            this.putBodyParameter("dataFilter", dataFilter);
            this.dataFilter = dataFilter;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * evaluators.
         */
        public Builder evaluators(java.util.List<Evaluator> evaluators) {
            this.putBodyParameter("evaluators", evaluators);
            this.evaluators = evaluators;
            return this;
        }

        /**
         * runStrategies.
         */
        public Builder runStrategies(RunStrategies runStrategies) {
            this.putBodyParameter("runStrategies", runStrategies);
            this.runStrategies = runStrategies;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * taskMode.
         */
        public Builder taskMode(String taskMode) {
            this.putBodyParameter("taskMode", taskMode);
            this.taskMode = taskMode;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateEvaluationTaskRequest build() {
            return new CreateEvaluationTaskRequest(this);
        } 

    } 

}
