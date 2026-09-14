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
 * {@link ListExperimentPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentPlansResponseBody</p>
 */
public class ListExperimentPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("plans")
    private java.util.List<ExperimentPlanData> plans;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListExperimentPlansResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.plans = builder.plans;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentPlansResponseBody create() {
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
     * @return plans
     */
    public java.util.List<ExperimentPlanData> getPlans() {
        return this.plans;
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
        private java.util.List<ExperimentPlanData> plans; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListExperimentPlansResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.plans = model.plans;
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
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJsYXN0SWQiOjEwMX0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of experiment plan summaries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;planId&quot;: &quot;exp-plan-e95bff54685a4ae29ff3a834c1008a71&quot;, &quot;planName&quot;: &quot;rca_benchmark_eval_experiment&quot;, &quot;experimentType&quot;: &quot;offline&quot;, &quot;description&quot;: &quot;&quot;, &quot;status&quot;: &quot;pending&quot;, &quot;datasetId&quot;: &quot;rca_benckmark_eval&quot;, &quot;querySql&quot;: &quot;&quot;, &quot;experimentCount&quot;: 5, &quot;createdAt&quot;: 1784612365000, &quot;updatedAt&quot;: 1784619562000}, {&quot;planId&quot;: &quot;exp-plan-0242d983f5d340fd8479cf2c19eb279e&quot;, &quot;planName&quot;: &quot;arms_agent_experiment&quot;, &quot;experimentType&quot;: &quot;online&quot;, &quot;description&quot;: &quot;&quot;, &quot;status&quot;: &quot;stopped&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;querySql&quot;: &quot;&quot;, &quot;experimentCount&quot;: 4, &quot;createdAt&quot;: 1784257858000, &quot;updatedAt&quot;: 1784721811000}, {&quot;planId&quot;: &quot;b7f0ad3d-3765-446a-a744-ab64ab8bf386&quot;, &quot;planName&quot;: &quot;arms_customer_agent_plan&quot;, &quot;experimentType&quot;: &quot;offline&quot;, &quot;description&quot;: &quot;&quot;, &quot;status&quot;: &quot;stopped&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;querySql&quot;: &quot;where \&quot;input\&quot; LIKE \&quot;%探针%\&quot;&quot;, &quot;experimentCount&quot;: 65, &quot;createdAt&quot;: 1782310430000, &quot;updatedAt&quot;: 1784692254000}]</p>
         */
        public Builder plans(java.util.List<ExperimentPlanData> plans) {
            this.plans = plans;
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
         * <p>The total number of records that match the filter criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListExperimentPlansResponseBody build() {
            return new ListExperimentPlansResponseBody(this);
        } 

    } 

}
