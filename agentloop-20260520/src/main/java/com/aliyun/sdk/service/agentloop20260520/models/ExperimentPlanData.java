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
 * {@link ExperimentPlanData} extends {@link TeaModel}
 *
 * <p>ExperimentPlanData</p>
 */
public class ExperimentPlanData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("experimentCount")
    private Integer experimentCount;

    @com.aliyun.core.annotation.NameInMap("experimentType")
    private String experimentType;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.NameInMap("querySql")
    private String querySql;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    private ExperimentPlanData(Builder builder) {
        this.createdAt = builder.createdAt;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.experimentCount = builder.experimentCount;
        this.experimentType = builder.experimentType;
        this.pipelineName = builder.pipelineName;
        this.planId = builder.planId;
        this.planName = builder.planName;
        this.querySql = builder.querySql;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExperimentPlanData create() {
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
     * @return experimentCount
     */
    public Integer getExperimentCount() {
        return this.experimentCount;
    }

    /**
     * @return experimentType
     */
    public String getExperimentType() {
        return this.experimentType;
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
        private Integer experimentCount; 
        private String experimentType; 
        private String pipelineName; 
        private String planId; 
        private String planName; 
        private String querySql; 
        private String status; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(ExperimentPlanData model) {
            this.createdAt = model.createdAt;
            this.datasetId = model.datasetId;
            this.description = model.description;
            this.experimentCount = model.experimentCount;
            this.experimentType = model.experimentType;
            this.pipelineName = model.pipelineName;
            this.planId = model.planId;
            this.planName = model.planName;
            this.querySql = model.querySql;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The creation time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1767225600000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The ID of the associated dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-123456</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Offline evaluation plan for customer service Q&amp;A</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The number of experiment executions under this plan.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder experimentCount(Integer experimentCount) {
            this.experimentCount = experimentCount;
            return this;
        }

        /**
         * <p>The experiment type. Valid values: offline (offline experiment) and online (online experiment).</p>
         * 
         * <strong>example:</strong>
         * <p>offline</p>
         */
        public Builder experimentType(String experimentType) {
            this.experimentType = experimentType;
            return this;
        }

        /**
         * <p>The name of the associated data processing pipeline. This field is empty if no pipeline is associated. After association, when an experiment under this plan completes and writes results to a Logstore, the system filters by the trace ID of the experiment trace and calls PreviewPipeline to write the pipeline-processed results.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-process-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The experiment plan ID.</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The experiment plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-eval</p>
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * <p>The custom query SQL clause in dataset-partial mode.</p>
         * 
         * <strong>example:</strong>
         * <p>level &gt; 2</p>
         */
        public Builder querySql(String querySql) {
            this.querySql = querySql;
            return this;
        }

        /**
         * <p>The status. Valid values: pending, running, and stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The update time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1767229200000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ExperimentPlanData build() {
            return new ExperimentPlanData(this);
        } 

    } 

}
