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
 * {@link ListExperimentRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentRunsResponseBody</p>
 */
public class ListExperimentRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<ExperimentRecord> records;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListExperimentRunsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return records
     */
    public java.util.List<ExperimentRecord> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<ExperimentRecord> records; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListExperimentRunsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.records = model.records;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Optional.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlIjoxfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of experiment run records.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;recordId&quot;: &quot;exp-run-f6d419b0ed3d43a7b585948a55efc07b&quot;, &quot;experimentPlanId&quot;: &quot;exp-plan-0242d983f5d340fd8479cf2c19eb279e&quot;, &quot;recordName&quot;: &quot;arms_agent_experiment 2026/07/22 20:02:55&quot;, &quot;planName&quot;: &quot;arms_agent_experiment&quot;, &quot;status&quot;: &quot;evaluating&quot;, &quot;progress&quot;: 100.0, &quot;totalTasks&quot;: 40, &quot;completedTasks&quot;: 40, &quot;failedTasks&quot;: 0, &quot;dataSourceType&quot;: &quot;dataset-full&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;modelNames&quot;: [&quot;qwen3.7-plus&quot;, &quot;qwen3.7-max&quot;], &quot;evaluationTaskId&quot;: &quot;eval-task-6bec93bfa03740dd86ce2bf1496e65fb&quot;, &quot;executedAt&quot;: 1784721775379, &quot;completedAt&quot;: 1784721811392}, {&quot;recordId&quot;: &quot;a5397261-6e6d-4e45-bf52-feb8686f7524&quot;, &quot;experimentPlanId&quot;: &quot;exp-plan-e95bff54685a4ae29ff3a834c1008a71&quot;, &quot;recordName&quot;: &quot;rca_benchmark_eval_experiment 2026/07/22 19:23:59&quot;, &quot;planName&quot;: &quot;rca_benchmark_eval_experiment&quot;, &quot;status&quot;: &quot;completed&quot;, &quot;progress&quot;: 100.0, &quot;totalTasks&quot;: 20, &quot;completedTasks&quot;: 20, &quot;failedTasks&quot;: 0, &quot;dataSourceType&quot;: &quot;dataset-full&quot;, &quot;datasetId&quot;: &quot;rca_benckmark_eval&quot;, &quot;modelNames&quot;: [], &quot;evaluationTaskId&quot;: &quot;eval-task-b1395b3bdf3e4dc994d7dcde7a66da45&quot;, &quot;executedAt&quot;: 1784719439255, &quot;completedAt&quot;: 1784719989371}]</p>
         */
        public Builder records(java.util.List<ExperimentRecord> records) {
            this.records = records;
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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListExperimentRunsResponseBody build() {
            return new ListExperimentRunsResponseBody(this);
        } 

    } 

}
