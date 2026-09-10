// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link SearchMemoriesRequest} extends {@link RequestModel}
 *
 * <p>SearchMemoriesRequest</p>
 */
public class SearchMemoriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filters")
    private java.util.Map<String, ?> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rerank")
    private Boolean rerank;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("retrievalOption")
    private String retrievalOption;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("searchType")
    private String searchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topK")
    private Integer topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private SearchMemoriesRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.memoryStoreName = builder.memoryStoreName;
        this.agentId = builder.agentId;
        this.appId = builder.appId;
        this.filters = builder.filters;
        this.query = builder.query;
        this.rerank = builder.rerank;
        this.retrievalOption = builder.retrievalOption;
        this.runId = builder.runId;
        this.searchType = builder.searchType;
        this.threshold = builder.threshold;
        this.topK = builder.topK;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMemoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return filters
     */
    public java.util.Map<String, ?> getFilters() {
        return this.filters;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return rerank
     */
    public Boolean getRerank() {
        return this.rerank;
    }

    /**
     * @return retrievalOption
     */
    public String getRetrievalOption() {
        return this.retrievalOption;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SearchMemoriesRequest, Builder> {
        private String workspace; 
        private String memoryStoreName; 
        private String agentId; 
        private String appId; 
        private java.util.Map<String, ?> filters; 
        private String query; 
        private Boolean rerank; 
        private String retrievalOption; 
        private String runId; 
        private String searchType; 
        private Double threshold; 
        private Integer topK; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SearchMemoriesRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.memoryStoreName = request.memoryStoreName;
            this.agentId = request.agentId;
            this.appId = request.appId;
            this.filters = request.filters;
            this.query = request.query;
            this.rerank = request.rerank;
            this.retrievalOption = request.retrievalOption;
            this.runId = request.runId;
            this.searchType = request.searchType;
            this.threshold = request.threshold;
            this.topK = request.topK;
            this.userId = request.userId;
        } 

        /**
         * <p>The workspace name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>The memory store name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qianyi_test_1</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>972772996913709056</p>
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The app key of the project assigned by the merchant.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_480d961a1b5e4efe84603f4cbc0f</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.Map<String, ?> filters) {
            this.putBodyParameter("filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The query content.</p>
         * 
         * <strong>example:</strong>
         * <p>What I like</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Specifies whether to enable reranking.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rerank(Boolean rerank) {
            this.putBodyParameter("rerank", rerank);
            this.rerank = rerank;
            return this;
        }

        /**
         * <p>The retrieval option.</p>
         * 
         * <strong>example:</strong>
         * <p>reranker,llm_rank</p>
         */
        public Builder retrievalOption(String retrievalOption) {
            this.putBodyParameter("retrievalOption", retrievalOption);
            this.retrievalOption = retrievalOption;
            return this;
        }

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test_session_001</p>
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The search type.</p>
         * 
         * <strong>example:</strong>
         * <p>experience</p>
         */
        public Builder searchType(String searchType) {
            this.putBodyParameter("searchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * <p>The similarity threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        public Builder threshold(Double threshold) {
            this.putBodyParameter("threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The top-K entries to return in the results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("topK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test_session_001</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SearchMemoriesRequest build() {
            return new SearchMemoriesRequest(this);
        } 

    } 

}
