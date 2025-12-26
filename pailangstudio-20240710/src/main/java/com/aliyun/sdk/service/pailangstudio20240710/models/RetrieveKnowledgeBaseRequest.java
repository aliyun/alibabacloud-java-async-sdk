// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link RetrieveKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>RetrieveKnowledgeBaseRequest</p>
 */
public class RetrieveKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HybridStrategyConfig")
    private String hybridStrategyConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaDataFilterConditions")
    private String metaDataFilterConditions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryMode")
    private String queryMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RerankConfig")
    private String rerankConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RewriteConfig")
    private String rewriteConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
    private Float scoreThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RetrieveKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.hybridStrategyConfig = builder.hybridStrategyConfig;
        this.metaDataFilterConditions = builder.metaDataFilterConditions;
        this.query = builder.query;
        this.queryMode = builder.queryMode;
        this.rerankConfig = builder.rerankConfig;
        this.rewriteConfig = builder.rewriteConfig;
        this.scoreThreshold = builder.scoreThreshold;
        this.topK = builder.topK;
        this.versionName = builder.versionName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveKnowledgeBaseRequest create() {
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
     * @return hybridStrategyConfig
     */
    public String getHybridStrategyConfig() {
        return this.hybridStrategyConfig;
    }

    /**
     * @return metaDataFilterConditions
     */
    public String getMetaDataFilterConditions() {
        return this.metaDataFilterConditions;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return rerankConfig
     */
    public String getRerankConfig() {
        return this.rerankConfig;
    }

    /**
     * @return rewriteConfig
     */
    public String getRewriteConfig() {
        return this.rewriteConfig;
    }

    /**
     * @return scoreThreshold
     */
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RetrieveKnowledgeBaseRequest, Builder> {
        private String knowledgeBaseId; 
        private String hybridStrategyConfig; 
        private String metaDataFilterConditions; 
        private String query; 
        private String queryMode; 
        private String rerankConfig; 
        private String rewriteConfig; 
        private Float scoreThreshold; 
        private Integer topK; 
        private String versionName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveKnowledgeBaseRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.hybridStrategyConfig = request.hybridStrategyConfig;
            this.metaDataFilterConditions = request.metaDataFilterConditions;
            this.query = request.query;
            this.queryMode = request.queryMode;
            this.rerankConfig = request.rerankConfig;
            this.rewriteConfig = request.rewriteConfig;
            this.scoreThreshold = request.scoreThreshold;
            this.topK = request.topK;
            this.versionName = request.versionName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * HybridStrategyConfig.
         */
        public Builder hybridStrategyConfig(String hybridStrategyConfig) {
            this.putBodyParameter("HybridStrategyConfig", hybridStrategyConfig);
            this.hybridStrategyConfig = hybridStrategyConfig;
            return this;
        }

        /**
         * MetaDataFilterConditions.
         */
        public Builder metaDataFilterConditions(String metaDataFilterConditions) {
            this.putBodyParameter("MetaDataFilterConditions", metaDataFilterConditions);
            this.metaDataFilterConditions = metaDataFilterConditions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * QueryMode.
         */
        public Builder queryMode(String queryMode) {
            this.putBodyParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * RerankConfig.
         */
        public Builder rerankConfig(String rerankConfig) {
            this.putBodyParameter("RerankConfig", rerankConfig);
            this.rerankConfig = rerankConfig;
            return this;
        }

        /**
         * RewriteConfig.
         */
        public Builder rewriteConfig(String rewriteConfig) {
            this.putBodyParameter("RewriteConfig", rewriteConfig);
            this.rewriteConfig = rewriteConfig;
            return this;
        }

        /**
         * ScoreThreshold.
         */
        public Builder scoreThreshold(Float scoreThreshold) {
            this.putBodyParameter("ScoreThreshold", scoreThreshold);
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putBodyParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RetrieveKnowledgeBaseRequest build() {
            return new RetrieveKnowledgeBaseRequest(this);
        } 

    } 

}
