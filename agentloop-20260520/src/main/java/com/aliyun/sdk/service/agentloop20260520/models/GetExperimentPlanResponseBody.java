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
            this.planId = model.planId;
            this.planName = model.planName;
            this.querySql = model.querySql;
            this.requestId = model.requestId;
            this.selectedItemIds = model.selectedItemIds;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
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
         * experimentType.
         */
        public Builder experimentType(String experimentType) {
            this.experimentType = experimentType;
            return this;
        }

        /**
         * experiments.
         */
        public Builder experiments(java.util.List<ExperimentConfig> experiments) {
            this.experiments = experiments;
            return this;
        }

        /**
         * input.
         */
        public Builder input(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * planName.
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * querySql.
         */
        public Builder querySql(String querySql) {
            this.querySql = querySql;
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
         * selectedItemIds.
         */
        public Builder selectedItemIds(java.util.List<String> selectedItemIds) {
            this.selectedItemIds = selectedItemIds;
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
         * updatedAt.
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
