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
 * {@link ListExperimentRunsRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentRunsRequest</p>
 */
public class ListExperimentRunsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("experimentName")
    private String experimentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListExperimentRunsRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.datasetId = builder.datasetId;
        this.experimentName = builder.experimentName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.planName = builder.planName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentRunsRequest create() {
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
     * @return experimentName
     */
    public String getExperimentName() {
        return this.experimentName;
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
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListExperimentRunsRequest, Builder> {
        private String agentSpace; 
        private String datasetId; 
        private String experimentName; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer page; 
        private Integer pageSize; 
        private String planName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentRunsRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.datasetId = request.datasetId;
            this.experimentName = request.experimentName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.planName = request.planName;
            this.status = request.status;
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
         * <p>Filters results by exact dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arms_customer_agent_level1</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>Filters results by fuzzy match on the experiment configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>experimentA</p>
         */
        public Builder experimentName(String experimentName) {
            this.putQueryParameter("experimentName", experimentName);
            this.experimentName = experimentName;
            return this;
        }

        /**
         * <p>Optional. Use <code>page</code> and <code>pageSize</code> for pagination instead.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Optional. Use <code>page</code> and <code>pageSize</code> for pagination instead.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlIjoxfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number, starting from 0. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters results by fuzzy match on the experiment plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>arms_agent_experiment</p>
         */
        public Builder planName(String planName) {
            this.putQueryParameter("planName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>Filters results by status.</p>
         * 
         * <strong>example:</strong>
         * <p>evaluating</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListExperimentRunsRequest build() {
            return new ListExperimentRunsRequest(this);
        } 

    } 

}
