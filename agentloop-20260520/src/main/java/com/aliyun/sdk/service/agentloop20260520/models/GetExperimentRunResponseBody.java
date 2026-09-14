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
 * {@link GetExperimentRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentRunResponseBody</p>
 */
public class GetExperimentRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("record")
    private ExperimentRecord record;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetExperimentRunResponseBody(Builder builder) {
        this.record = builder.record;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return record
     */
    public ExperimentRecord getRecord() {
        return this.record;
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

    public static final class Builder {
        private ExperimentRecord record; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetExperimentRunResponseBody model) {
            this.record = model.record;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The experiment run record details. Fields with null values are not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;recordId&quot;: &quot;exp-run-f6d419b0ed3d43a7b585948a55efc07b&quot;, &quot;experimentPlanId&quot;: &quot;exp-plan-0242d983f5d340fd8479cf2c19eb279e&quot;, &quot;recordName&quot;: &quot;arms_agent_experiment 2026/07/22 20:02:55&quot;, &quot;planName&quot;: &quot;arms_agent_experiment&quot;, &quot;status&quot;: &quot;evaluating&quot;, &quot;totalTasks&quot;: 40, &quot;completedTasks&quot;: 40, &quot;failedTasks&quot;: 0, &quot;progress&quot;: 100.0, &quot;executedAt&quot;: 1784721775379, &quot;completedAt&quot;: 1784721811392, &quot;dataSourceType&quot;: &quot;dataset-full&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;modelNames&quot;: [&quot;qwen3.7-plus&quot;, &quot;qwen3.7-max&quot;], &quot;evaluationTaskId&quot;: &quot;eval-task-6bec93bfa03740dd86ce2bf1496e65fb&quot;}</p>
         */
        public Builder record(ExperimentRecord record) {
            this.record = record;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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

        public GetExperimentRunResponseBody build() {
            return new GetExperimentRunResponseBody(this);
        } 

    } 

}
