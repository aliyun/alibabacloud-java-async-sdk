// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link AnswerKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>AnswerKnowledgeBaseRequest</p>
 */
public class AnswerKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxContextChars")
    private Integer maxContextChars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankEnabled")
    private Boolean rerankEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnSources")
    private Boolean returnSources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
    private Double scoreThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInstructions")
    private String userInstructions;

    private AnswerKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.maxContextChars = builder.maxContextChars;
        this.queryText = builder.queryText;
        this.regionId = builder.regionId;
        this.rerankEnabled = builder.rerankEnabled;
        this.returnSources = builder.returnSources;
        this.scoreThreshold = builder.scoreThreshold;
        this.searchMode = builder.searchMode;
        this.systemPrompt = builder.systemPrompt;
        this.topK = builder.topK;
        this.userInstructions = builder.userInstructions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnswerKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return maxContextChars
     */
    public Integer getMaxContextChars() {
        return this.maxContextChars;
    }

    /**
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rerankEnabled
     */
    public Boolean getRerankEnabled() {
        return this.rerankEnabled;
    }

    /**
     * @return returnSources
     */
    public Boolean getReturnSources() {
        return this.returnSources;
    }

    /**
     * @return scoreThreshold
     */
    public Double getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return systemPrompt
     */
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return userInstructions
     */
    public String getUserInstructions() {
        return this.userInstructions;
    }

    public static final class Builder extends Request.Builder<AnswerKnowledgeBaseRequest, Builder> {
        private String knowledgeBaseId; 
        private Integer maxContextChars; 
        private String queryText; 
        private String regionId; 
        private Boolean rerankEnabled; 
        private Boolean returnSources; 
        private Double scoreThreshold; 
        private String searchMode; 
        private String systemPrompt; 
        private Integer topK; 
        private String userInstructions; 

        private Builder() {
            super();
        } 

        private Builder(AnswerKnowledgeBaseRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.maxContextChars = request.maxContextChars;
            this.queryText = request.queryText;
            this.regionId = request.regionId;
            this.rerankEnabled = request.rerankEnabled;
            this.returnSources = request.returnSources;
            this.scoreThreshold = request.scoreThreshold;
            this.searchMode = request.searchMode;
            this.systemPrompt = request.systemPrompt;
            this.topK = request.topK;
            this.userInstructions = request.userInstructions;
        } 

        /**
         * <p>The unique ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The maximum number of context characters. Valid values: 1000 to 32000.</p>
         * 
         * <strong>example:</strong>
         * <p>16000</p>
         */
        public Builder maxContextChars(Integer maxContextChars) {
            this.putQueryParameter("MaxContextChars", maxContextChars);
            this.maxContextChars = maxContextChars;
            return this;
        }

        /**
         * <p>The user query text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Summarize this year\&quot;s financial report</p>
         */
        public Builder queryText(String queryText) {
            this.putQueryParameter("QueryText", queryText);
            this.queryText = queryText;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable reranking. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder rerankEnabled(Boolean rerankEnabled) {
            this.putQueryParameter("RerankEnabled", rerankEnabled);
            this.rerankEnabled = rerankEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to return citation sources. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder returnSources(Boolean returnSources) {
            this.putQueryParameter("ReturnSources", returnSources);
            this.returnSources = returnSources;
            return this;
        }

        /**
         * <p>The similarity score threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        public Builder scoreThreshold(Double scoreThreshold) {
            this.putQueryParameter("ScoreThreshold", scoreThreshold);
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * <p>The search mode. Valid values: knn, rrf, precise, semantic, and balanced.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic</p>
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>The system prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a minimal test prompt for security verification.</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putQueryParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The number of results to recall during retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>The supplementary user instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>Return a short summary and test result.</p>
         */
        public Builder userInstructions(String userInstructions) {
            this.putQueryParameter("UserInstructions", userInstructions);
            this.userInstructions = userInstructions;
            return this;
        }

        @Override
        public AnswerKnowledgeBaseRequest build() {
            return new AnswerKnowledgeBaseRequest(this);
        } 

    } 

}
