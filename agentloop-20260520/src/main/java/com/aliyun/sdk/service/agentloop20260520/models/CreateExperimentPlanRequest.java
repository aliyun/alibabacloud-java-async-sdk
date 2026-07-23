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
            this.planName = request.planName;
            this.querySql = request.querySql;
            this.selectedItemIds = request.selectedItemIds;
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
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putBodyParameter("datasetId", datasetId);
            this.datasetId = datasetId;
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
         * <p>This parameter is required.</p>
         */
        public Builder experiments(java.util.List<ExperimentConfig> experiments) {
            this.putBodyParameter("experiments", experiments);
            this.experiments = experiments;
            return this;
        }

        /**
         * input.
         */
        public Builder input(java.util.Map<String, ?> input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
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
         * querySql.
         */
        public Builder querySql(String querySql) {
            this.putBodyParameter("querySql", querySql);
            this.querySql = querySql;
            return this;
        }

        /**
         * selectedItemIds.
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
