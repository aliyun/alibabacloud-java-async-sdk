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
 * {@link UpdateExperimentPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentPlanRequest</p>
 */
public class UpdateExperimentPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("datasetProject")
    private String datasetProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluator> evaluators;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("experimentType")
    private String experimentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("experiments")
    private java.util.List<ExperimentConfig> experiments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    private java.util.Map<String, ?> input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("querySql")
    private String querySql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selectedItemIds")
    private java.util.List<String> selectedItemIds;

    private UpdateExperimentPlanRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.planId = builder.planId;
        this.datasetId = builder.datasetId;
        this.datasetProject = builder.datasetProject;
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

    public static UpdateExperimentPlanRequest create() {
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetProject
     */
    public String getDatasetProject() {
        return this.datasetProject;
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

    public static final class Builder extends Request.Builder<UpdateExperimentPlanRequest, Builder> {
        private String agentSpace; 
        private String planId; 
        private String datasetId; 
        private String datasetProject; 
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

        private Builder(UpdateExperimentPlanRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.planId = request.planId;
            this.datasetId = request.datasetId;
            this.datasetProject = request.datasetProject;
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
         * <p>The experiment plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-plan-e95bff54685a4ae29ff3a834c1008a71</p>
         */
        public Builder planId(String planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the associated dataset.</p>
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
         * <p>Optional.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspace-project</p>
         */
        public Builder datasetProject(String datasetProject) {
            this.putBodyParameter("datasetProject", datasetProject);
            this.datasetProject = datasetProject;
            return this;
        }

        /**
         * <p>The description.</p>
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
         * <p>The list of evaluators. Omitting this field means no modification. Passing an empty array clears the list.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;evaluatorRef&quot;: &quot;Builtin.agent_task_completion&quot;}]</p>
         */
        public Builder evaluators(java.util.List<Evaluator> evaluators) {
            this.putBodyParameter("evaluators", evaluators);
            this.evaluators = evaluators;
            return this;
        }

        /**
         * <p>The experiment type.</p>
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
         * <p>The list of experiment configurations. When provided, the entire list is replaced. The number of configurations must be 1 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;label&quot;: &quot;A&quot;, &quot;name&quot;: &quot;baseline&quot;, &quot;modelName&quot;: &quot;qwen-max&quot;}]</p>
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
         * <p>The name of the associated data processing pipeline. This parameter is optional. If not specified, the value is not updated. If an empty character string is specified, the association is dissociated. After association, when an experiment under this plan completes execution and writes results to the experiment result Logstore, the system filters by the traceId of the experiment trace and invokes PreviewPipeline. The pipeline-processed results are then written together.</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putBodyParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The name of the experiment plan.</p>
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
         * <p>The custom query SQL clause in partial dataset mode.</p>
         * 
         * <strong>example:</strong>
         * <p>level &gt; 2</p>
         */
        public Builder querySql(String querySql) {
            this.putBodyParameter("querySql", querySql);
            this.querySql = querySql;
            return this;
        }

        /**
         * <p>The list of selected data item IDs in partial dataset mode. Passing an empty array clears the list.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder selectedItemIds(java.util.List<String> selectedItemIds) {
            this.putBodyParameter("selectedItemIds", selectedItemIds);
            this.selectedItemIds = selectedItemIds;
            return this;
        }

        @Override
        public UpdateExperimentPlanRequest build() {
            return new UpdateExperimentPlanRequest(this);
        } 

    } 

}
