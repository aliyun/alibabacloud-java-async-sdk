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
 * {@link GetExperimentPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentPlanResponseBody</p>
 */
public class GetExperimentPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("evaluators")
    private java.util.List<Evaluator> evaluators;

    @com.aliyun.core.annotation.NameInMap("experimentType")
    private String experimentType;

    @com.aliyun.core.annotation.NameInMap("experiments")
    private java.util.List<ExperimentConfig> experiments;

    @com.aliyun.core.annotation.NameInMap("input")
    private java.util.Map<String, ?> input;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.NameInMap("querySql")
    private String querySql;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("selectedItemIds")
    private java.util.List<String> selectedItemIds;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    private GetExperimentPlanResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.evaluators = builder.evaluators;
        this.experimentType = builder.experimentType;
        this.experiments = builder.experiments;
        this.input = builder.input;
        this.pipelineName = builder.pipelineName;
        this.planId = builder.planId;
        this.planName = builder.planName;
        this.querySql = builder.querySql;
        this.requestId = builder.requestId;
        this.selectedItemIds = builder.selectedItemIds;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentPlanResponseBody create() {
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selectedItemIds
     */
    public java.util.List<String> getSelectedItemIds() {
        return this.selectedItemIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Long createdAt; 
        private String datasetId; 
        private String description; 
        private java.util.List<Evaluator> evaluators; 
        private String experimentType; 
        private java.util.List<ExperimentConfig> experiments; 
        private java.util.Map<String, ?> input; 
        private String pipelineName; 
        private String planId; 
        private String planName; 
        private String querySql; 
        private String requestId; 
        private java.util.List<String> selectedItemIds; 
        private String status; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(GetExperimentPlanResponseBody model) {
            this.createdAt = model.createdAt;
            this.datasetId = model.datasetId;
            this.description = model.description;
            this.evaluators = model.evaluators;
            this.experimentType = model.experimentType;
            this.experiments = model.experiments;
            this.input = model.input;
            this.pipelineName = model.pipelineName;
            this.planId = model.planId;
            this.planName = model.planName;
            this.querySql = model.querySql;
            this.requestId = model.requestId;
            this.selectedItemIds = model.selectedItemIds;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The creation time. The value is a millisecond-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The associated dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arms_customer_agent_level1</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Compare checkout Agent baseline with optimized version</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The list of evaluators.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;evaluatorRef&quot;: &quot;Builtin.agent_task_completion&quot;}]</p>
         */
        public Builder evaluators(java.util.List<Evaluator> evaluators) {
            this.evaluators = evaluators;
            return this;
        }

        /**
         * <p>The experiment type.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder experimentType(String experimentType) {
            this.experimentType = experimentType;
            return this;
        }

        /**
         * <p>The list of experiment configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;label&quot;: &quot;A&quot;, &quot;name&quot;: &quot;baseline&quot;, &quot;modelName&quot;: &quot;qwen-max&quot;}]</p>
         */
        public Builder experiments(java.util.List<ExperimentConfig> experiments) {
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
            this.input = input;
            return this;
        }

        /**
         * <p>The name of the associated data processing pipeline. This value is empty if no pipeline is associated.</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The experiment plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-plan-0242d983f5d340fd8479cf2c19eb279e</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The experiment plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>arms_agent_experiment</p>
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * <p>The custom query SQL clause in partial dataset mode.</p>
         * 
         * <strong>example:</strong>
         * <p>status=\&quot;OK\&quot;</p>
         */
        public Builder querySql(String querySql) {
            this.querySql = querySql;
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
         * <p>The list of selected data item IDs in partial dataset mode.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;019ef4d5-a0f0-7114-832d-5542d771cd8c&quot;]</p>
         */
        public Builder selectedItemIds(java.util.List<String> selectedItemIds) {
            this.selectedItemIds = selectedItemIds;
            return this;
        }

        /**
         * <p>The plan status.</p>
         * 
         * <strong>example:</strong>
         * <p>stopped</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The update time. The value is a millisecond-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816600000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetExperimentPlanResponseBody build() {
            return new GetExperimentPlanResponseBody(this);
        } 

    } 

}
