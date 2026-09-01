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
 * {@link RetrievalKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>RetrievalKnowledgeBaseRequest</p>
 */
public class RetrievalKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

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
    @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
    private Double scoreThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    private RetrievalKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.queryText = builder.queryText;
        this.regionId = builder.regionId;
        this.rerankEnabled = builder.rerankEnabled;
        this.scoreThreshold = builder.scoreThreshold;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrievalKnowledgeBaseRequest create() {
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
     * @return scoreThreshold
     */
    public Double getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<RetrievalKnowledgeBaseRequest, Builder> {
        private String knowledgeBaseId; 
        private String queryText; 
        private String regionId; 
        private Boolean rerankEnabled; 
        private Double scoreThreshold; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(RetrievalKnowledgeBaseRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.queryText = request.queryText;
            this.regionId = request.regionId;
            this.rerankEnabled = request.rerankEnabled;
            this.scoreThreshold = request.scoreThreshold;
            this.topK = request.topK;
        } 

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder queryText(String queryText) {
            this.putQueryParameter("QueryText", queryText);
            this.queryText = queryText;
            return this;
        }

        /**
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
         * RerankEnabled.
         */
        public Builder rerankEnabled(Boolean rerankEnabled) {
            this.putQueryParameter("RerankEnabled", rerankEnabled);
            this.rerankEnabled = rerankEnabled;
            return this;
        }

        /**
         * ScoreThreshold.
         */
        public Builder scoreThreshold(Double scoreThreshold) {
            this.putQueryParameter("ScoreThreshold", scoreThreshold);
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public RetrievalKnowledgeBaseRequest build() {
            return new RetrievalKnowledgeBaseRequest(this);
        } 

    } 

}
