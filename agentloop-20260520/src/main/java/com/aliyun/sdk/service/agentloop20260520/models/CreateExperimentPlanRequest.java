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
 * {@link CreateExperimentPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentPlanRequest</p>
 */
public class CreateExperimentPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluator> evaluators;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("experimentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("experiments")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ExperimentConfig> experiments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    private java.util.Map<String, ?> input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("querySql")
    private String querySql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selectedItemIds")
    private java.util.List<String> selectedItemIds;

    private CreateExperimentPlanRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.evaluators = builder.evaluators;
        this.experimentType = builder.experimentType;
        this.experiments = builder.experiments;
        this.input = builder.input;
        this.pipelineName = builder.pipelineName;
        this.planName = builder.planName;
        this.querySql = builder.querySql;
        this.selectedItemIds = builder.selectedItemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentPlanRequest create() {
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
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
     * @return experimentType
     */
    public String getExperimentType() {
        return this.experimentType;
    }

    /**
     * @return experiments
     */
    public java.util.List<ExperimentConfig> getExperiments() {
        return this.experiments;
    }

    /**
     * @return input
     */
    public java.util.Map<String, ?> getInput() {
        return this.input;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return querySql
     */
    public String getQuerySql() {
        return this.querySql;
    }

    /**
     * @return selectedItemIds
     */
    public java.util.List<String> getSelectedItemIds() {
        return this.selectedItemIds;
    }

    public static final class Builder extends Request.Builder<CreateExperimentPlanRequest, Builder> {
        private String agentSpace; 
        private String datasetId; 
        private String description; 
        private java.util.List<Evaluator> evaluators; 
        private String experimentType; 
        private java.util.List<ExperimentConfig> experiments; 
        private java.util.Map<String, ?> input; 
        private String pipelineName; 
        private String planName; 
        private String querySql; 
        private java.util.List<String> selectedItemIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentPlanRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.datasetId = request.datasetId;
            this.description = request.description;
            this.evaluators = request.evaluators;
            this.experimentType = request.experimentType;
            this.experiments = request.experiments;
            this.input = request.input;
            this.pipelineName = request.pipelineName;
            this.planName = request.planName;
            this.querySql = request.querySql;
            this.selectedItemIds = request.selectedItemIds;
        } 

        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>al-playground-cn-hongkong</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The ID of the associated dataset. If not specified, the execution phase processes in simple mode.</p>
         * 
         * <strong>example:</strong>
         * <p>rca_benckmark_eval</p>
         */
        public Builder datasetId(String datasetId) {
            this.putBodyParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The description of the experiment plan.</p>
         * 
         * <strong>example:</strong>
         * <p>rca_benchmark_eval_experiment offline experiment</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of evaluators. When configured, evaluation can be automatically triggered upon experiment completion.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;evaluatorRef&quot;: &quot;Builtin.agent_correctness&quot;, &quot;name&quot;: &quot;Builtin.agent_correctness&quot;, &quot;type&quot;: &quot;AGENT&quot;, &quot;resultName&quot;: &quot;Builtin.agent_correctness&quot;, &quot;resultType&quot;: &quot;score&quot;, &quot;variableMapping&quot;: {&quot;input&quot;: &quot;experiment_input&quot;, &quot;output&quot;: &quot;experiment_output&quot;, &quot;expected_output&quot;: &quot;dataset.ground_truth_json&quot;}, &quot;filters&quot;: {&quot;query&quot;: &quot;&quot;, &quot;sample&quot;: &quot;100&quot;}, &quot;config&quot;: {&quot;variables&quot;: [], &quot;prompt&quot;: &quot;&quot;}}, {&quot;evaluatorRef&quot;: &quot;rca-toxicity-safety-accuracy&quot;, &quot;name&quot;: &quot;rca-toxicity-safety-accuracy&quot;, &quot;type&quot;: &quot;AGENT&quot;, &quot;resultName&quot;: &quot;rca-toxicity-safety-accuracy&quot;, &quot;resultType&quot;: &quot;score&quot;, &quot;variableMapping&quot;: {&quot;input&quot;: &quot;experiment_input&quot;, &quot;output&quot;: &quot;experiment_output&quot;, &quot;question&quot;: &quot;dataset.question&quot;, &quot;expected_output&quot;: &quot;dataset.ground_truth_json&quot;, &quot;payload_json&quot;: &quot;dataset.payload_json&quot;}, &quot;filters&quot;: {&quot;query&quot;: &quot;&quot;, &quot;sample&quot;: &quot;100&quot;}, &quot;config&quot;: {&quot;variables&quot;: [], &quot;prompt&quot;: &quot;&quot;}}]</p>
         */
        public Builder evaluators(java.util.List<Evaluator> evaluators) {
            this.putBodyParameter("evaluators", evaluators);
            this.evaluators = evaluators;
            return this;
        }

        /**
         * <p>The experiment type. Set this parameter to <code>OFFLINE</code> or <code>ONLINE</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        public Builder experimentType(String experimentType) {
            this.putBodyParameter("experimentType", experimentType);
            this.experimentType = experimentType;
            return this;
        }

        /**
         * <p>The list of experiment configurations. A maximum of 5 entries are supported. For offline experiments, this parameter can be omitted or set to an empty array. For online experiments, at least one entry is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;label&quot;: &quot;A&quot;, &quot;name&quot;: &quot;experimentA&quot;, &quot;modelName&quot;: &quot;qwen3.7-plus&quot;, &quot;modelProvider&quot;: &quot;dashscope&quot;, &quot;modelParameters&quot;: {&quot;temperature&quot;: 0.7, &quot;topP&quot;: 0.8, &quot;presencePenalty&quot;: 0.0, &quot;frequencyPenalty&quot;: 0.0}, &quot;promptTemplate&quot;: [{&quot;role&quot;: &quot;system&quot;, &quot;content&quot;: &quot;You are an Alibaba Cloud ARMS product Q&amp;A bot&quot;}, {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;{{input}}&quot;}]}, {&quot;label&quot;: &quot;B&quot;, &quot;name&quot;: &quot;experimentB&quot;, &quot;modelName&quot;: &quot;qwen3.7-max&quot;, &quot;modelProvider&quot;: &quot;dashscope&quot;, &quot;modelParameters&quot;: {&quot;temperature&quot;: 0.7, &quot;topP&quot;: 0.8, &quot;presencePenalty&quot;: 0.0, &quot;frequencyPenalty&quot;: 0.0}, &quot;promptTemplate&quot;: [{&quot;role&quot;: &quot;system&quot;, &quot;content&quot;: &quot;You are an Alibaba Cloud ARMS product Q&amp;A bot&quot;}, {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;{{input}}&quot;}]}]</p>
         */
        public Builder experiments(java.util.List<ExperimentConfig> experiments) {
            this.putBodyParameter("experiments", experiments);
            this.experiments = experiments;
            return this;
        }

        /**
         * <p>Optional.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;question&quot;: &quot;How do I request a refund?&quot;}</p>
         */
        public Builder input(java.util.Map<String, ?> input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The name of the associated data processing pipeline (optional). After association, when experiment runs under this plan finish writing results to the experiment result Logstore, the system filters by the traceId of the experiment trace, calls PreviewPipeline, and writes the pipeline-processed results together.</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putBodyParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The name of the experiment plan. The name must be unique within the same AgentSpace and account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rca_benchmark_eval_experiment</p>
         */
        public Builder planName(String planName) {
            this.putBodyParameter("planName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>The custom query SQL clause for partial dataset mode. This parameter can be used when <code>selectedItemIds</code> is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>status=\&quot;OK\&quot;</p>
         */
        public Builder querySql(String querySql) {
            this.putBodyParameter("querySql", querySql);
            this.querySql = querySql;
            return this;
        }

        /**
         * <p>The list of selected data item IDs for partial dataset mode. This parameter must be used together with <code>datasetId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;019ef4d5-a0f0-7114-832d-5542d771cd8c&quot;, &quot;019f1729-be9b-7769-a006-8e98023ad7ad&quot;]</p>
         */
        public Builder selectedItemIds(java.util.List<String> selectedItemIds) {
            this.putBodyParameter("selectedItemIds", selectedItemIds);
            this.selectedItemIds = selectedItemIds;
            return this;
        }

        @Override
        public CreateExperimentPlanRequest build() {
            return new CreateExperimentPlanRequest(this);
        } 

    } 

}
