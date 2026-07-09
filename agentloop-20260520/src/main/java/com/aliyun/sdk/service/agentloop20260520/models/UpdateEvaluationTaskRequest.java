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
 * {@link UpdateEvaluationTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateEvaluationTaskRequest</p>
 */
public class UpdateEvaluationTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, String> config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataFilter")
    private String dataFilter;

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
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateEvaluationTaskRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.taskId = builder.taskId;
        this.config = builder.config;
        this.dataFilter = builder.dataFilter;
        this.description = builder.description;
        this.evaluators = builder.evaluators;
        this.runStrategies = builder.runStrategies;
        this.status = builder.status;
        this.tags = builder.tags;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEvaluationTaskRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateEvaluationTaskRequest, Builder> {
        private String agentSpace; 
        private String taskId; 
        private java.util.Map<String, String> config; 
        private String dataFilter; 
        private String description; 
        private java.util.List<Evaluator> evaluators; 
        private RunStrategies runStrategies; 
        private String status; 
        private java.util.Map<String, String> tags; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEvaluationTaskRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.taskId = request.taskId;
            this.config = request.config;
            this.dataFilter = request.dataFilter;
            this.description = request.description;
            this.evaluators = request.evaluators;
            this.runStrategies = request.runStrategies;
            this.status = request.status;
            this.tags = request.tags;
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
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
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
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
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
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateEvaluationTaskRequest build() {
            return new UpdateEvaluationTaskRequest(this);
        } 

    } 

}
