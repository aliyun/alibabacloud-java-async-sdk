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
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The evaluation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The new task configuration. Some fields that are set during creation cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataScope&quot;:&quot;trace&quot;}</p>
         */
        public Builder config(java.util.Map<String, String> config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The filter conditions for evaluation data. JSON objects and JSON strings are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;query&quot;:&quot;serviceName=\&quot;checkout-service\&quot; AND status=\&quot;OK\&quot;&quot;,&quot;maxRecords&quot;:10,&quot;samplingRate&quot;:50}</p>
         */
        public Builder dataFilter(String dataFilter) {
            this.putBodyParameter("dataFilter", dataFilter);
            this.dataFilter = dataFilter;
            return this;
        }

        /**
         * <p>The description of the evaluation task.</p>
         * 
         * <strong>example:</strong>
         * <p>Updated trace link task completion evaluation</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The new list of evaluator configurations. When specified, this list entirely replaces the existing evaluator list of the task, and the system re-validates evaluator uniqueness and variable mappings.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;evaluatorRef&quot;:&quot;Builtin.agent_task_completion&quot;,&quot;resultName&quot;:&quot;agent_task_completion&quot;,&quot;resultType&quot;:&quot;score&quot;,&quot;variableMapping&quot;:{&quot;input&quot;:&quot;trace.input&quot;,&quot;output&quot;:&quot;trace.output&quot;,&quot;agent_trajectory&quot;:&quot;trace.agent_trajectory&quot;}}]</p>
         */
        public Builder evaluators(java.util.List<Evaluator> evaluators) {
            this.putBodyParameter("evaluators", evaluators);
            this.evaluators = evaluators;
            return this;
        }

        /**
         * <p>The new task execution strategies. JSON objects and JSON strings are supported. If the task is in the <code>Completed</code>, <code>Terminated</code>, or <code>Failed</code> state and the new strategy enables backfill or continuous mode, the backend restores the task to the <code>Pending</code> state and triggers orchestration.</p>
         */
        public Builder runStrategies(RunStrategies runStrategies) {
            this.putBodyParameter("runStrategies", runStrategies);
            this.runStrategies = runStrategies;
            return this;
        }

        /**
         * <p>The task status. Currently, the backend only allows users to manually set this to <code>Terminated</code>. Other statuses are managed by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The key-value pairs of task tags. You do not need to specify this parameter by default. Specify this parameter only when you want to associate or filter tasks by business tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;env&quot;:&quot;prod&quot;,&quot;serviceId&quot;:&quot;checkout-service&quot;,&quot;planId&quot;:&quot;plan-20260703&quot;}</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency checks.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
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
