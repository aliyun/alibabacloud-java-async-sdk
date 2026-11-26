// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link SearchKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>SearchKnowledgeBaseRequest</p>
 */
public class SearchKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private SearchKnowledgeBaseRequestBody body;

    private SearchKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return body
     */
    public SearchKnowledgeBaseRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SearchKnowledgeBaseRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private SearchKnowledgeBaseRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(SearchKnowledgeBaseRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.body = request.body;
        } 

        /**
         * <p>The workspace ID. Magic resolves the tenant ID from the trusted gateway call identity and verifies workspace ownership. Knowledge bases are created or accessed within this tenant and workspace. Cross-tenant queries cannot be performed by specifying only the knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The unique identifier of the knowledge base to be searched.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-2f5f9c5a8d0e4c3b</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The search text and the search configuration overrides for the current request. If the mode, count, fusion, and reranking parameters are omitted, the knowledge base configuration is used. If the knowledge base is not configured, the system default values specified in each field description are used. If metadataFilter is omitted, no metadata filtering is applied.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(SearchKnowledgeBaseRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public SearchKnowledgeBaseRequest build() {
            return new SearchKnowledgeBaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>SearchKnowledgeBaseRequest</p>
     */
    public static class SearchKnowledgeBaseRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadataFilter")
        @com.aliyun.core.annotation.Validation(maxLength = 8192)
        private String metadataFilter;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("query")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 4096)
        private String query;

        @com.aliyun.core.annotation.NameInMap("rankAlgorithm")
        private String rankAlgorithm;

        @com.aliyun.core.annotation.NameInMap("rerank")
        private Boolean rerank;

        @com.aliyun.core.annotation.NameInMap("rerankModel")
        private String rerankModel;

        @com.aliyun.core.annotation.NameInMap("rrfK")
        private Integer rrfK;

        @com.aliyun.core.annotation.NameInMap("topK")
        @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
        private Integer topK;

        @com.aliyun.core.annotation.NameInMap("vectorWeight")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double vectorWeight;

        private SearchKnowledgeBaseRequestBody(Builder builder) {
            this.metadataFilter = builder.metadataFilter;
            this.mode = builder.mode;
            this.query = builder.query;
            this.rankAlgorithm = builder.rankAlgorithm;
            this.rerank = builder.rerank;
            this.rerankModel = builder.rerankModel;
            this.rrfK = builder.rrfK;
            this.topK = builder.topK;
            this.vectorWeight = builder.vectorWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchKnowledgeBaseRequestBody create() {
            return builder().build();
        }

        /**
         * @return metadataFilter
         */
        public String getMetadataFilter() {
            return this.metadataFilter;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return rankAlgorithm
         */
        public String getRankAlgorithm() {
            return this.rankAlgorithm;
        }

        /**
         * @return rerank
         */
        public Boolean getRerank() {
            return this.rerank;
        }

        /**
         * @return rerankModel
         */
        public String getRerankModel() {
            return this.rerankModel;
        }

        /**
         * @return rrfK
         */
        public Integer getRrfK() {
            return this.rrfK;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        /**
         * @return vectorWeight
         */
        public Double getVectorWeight() {
            return this.vectorWeight;
        }

        public static final class Builder {
            private String metadataFilter; 
            private String mode; 
            private String query; 
            private String rankAlgorithm; 
            private Boolean rerank; 
            private String rerankModel; 
            private Integer rrfK; 
            private Integer topK; 
            private Double vectorWeight; 

            private Builder() {
            } 

            private Builder(SearchKnowledgeBaseRequestBody model) {
                this.metadataFilter = model.metadataFilter;
                this.mode = model.mode;
                this.query = model.query;
                this.rankAlgorithm = model.rankAlgorithm;
                this.rerank = model.rerank;
                this.rerankModel = model.rerankModel;
                this.rrfK = model.rrfK;
                this.topK = model.topK;
                this.vectorWeight = model.vectorWeight;
            } 

            /**
             * <p>The JSON expression tree used to filter search results by document metadata. The maximum length is 8,192 characters. Logical nodes include {&quot;AndAll&quot;:[child nodes...]} (all conditions met), {&quot;OrAll&quot;:[child nodes...]} (any condition met), and {&quot;NotAll&quot;:[child nodes...]} (no conditions met). Nesting is supported. Leaf nodes are in the format of {&quot;Key&quot;:field name,&quot;Operator&quot;:operator,&quot;Value&quot;:value}. For In and NotIn operators, use &quot;Values&quot;:[values...]. Valid operators include Equals, NotEquals, In, NotIn, GreaterThan, GreaterThanOrEqual, LessThan, LessThanOrEqual, StartsWith, and StringContains. Range operators apply only to LONG, DOUBLE, and DATETIME types. String operators apply only to the STRING type. Fields must be declared in the metadataSchema of the knowledge base. The nesting depth cannot exceed 5, and the total number of leaf conditions cannot exceed 20. DATETIME values accept ISO-8601 format with time zone, yyyy-MM-dd HH:mm:ss, or yyyy-MM-dd. OTS DSL, system fields, and tenant control fields are not accepted.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AndAll&quot;:[{&quot;Key&quot;:&quot;env&quot;,&quot;Operator&quot;:&quot;In&quot;,&quot;Values&quot;:[&quot;prod&quot;,&quot;staging&quot;]},{&quot;Key&quot;:&quot;score&quot;,&quot;Operator&quot;:&quot;GreaterThan&quot;,&quot;Value&quot;:&quot;0.8&quot;}]}</p>
             */
            public Builder metadataFilter(String metadataFilter) {
                this.metadataFilter = metadataFilter;
                return this;
            }

            /**
             * <p>The search mode. KEYWORD indicates keyword retrieve, VECTOR indicates vector retrieve, and HYBRID indicates hybrid retrieve. If this parameter is omitted, the knowledge base configuration is used. If the knowledge base is not configured, the default value is HYBRID.</p>
             * 
             * <strong>example:</strong>
             * <p>HYBRID</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The text used for both keyword retrieve and vector retrieve. The maximum length is 4,096 characters.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Product documentation</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The fusion algorithm. RRF indicates reciprocal rank fusion, and WEIGHTED indicates weighted normalization fusion. This parameter takes effect only in HYBRID mode. If WEIGHTED is explicitly passed in a non-HYBRID mode, an InvalidParameter error is returned. If this parameter is omitted, the knowledge base configuration is used. If the knowledge base is not configured, the default value is RRF.</p>
             * 
             * <strong>example:</strong>
             * <p>RRF</p>
             */
            public Builder rankAlgorithm(String rankAlgorithm) {
                this.rankAlgorithm = rankAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to enable reranking. This parameter applies to the KEYWORD, VECTOR, and HYBRID modes. An explicit value overrides the knowledge base configuration. If this parameter is omitted, the knowledge base configuration is used. If the knowledge base is not configured, the default value is false.</p>
             */
            public Builder rerank(Boolean rerank) {
                this.rerank = rerank;
                return this;
            }

            /**
             * <p>The reranking model. This parameter takes effect in all search modes when reranking is enabled. Valid values: qwen3-rerank, qwen3.7-text-rerank, gte-rerank-v2, and qwen3-vl-rerank. If this parameter is omitted, the knowledge base configuration is used. If the knowledge base is not configured, the default value is qwen3-rerank. Do not compare score distributions across different models. Use the same model for a given knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankModel(String rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The RRF fusion parameter k that overrides the knowledge base configuration for the current request. This parameter takes effect only in HYBRID mode and must be greater than 0. If this parameter is omitted, the knowledge base configuration is used. If the knowledge base is not configured, the default value is 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rrfK(Integer rrfK) {
                this.rrfK = rrfK;
                return this;
            }

            /**
             * <p>The expected number of results. Valid values: 1 to 100. If this parameter is omitted, the knowledge base configuration is used. If the knowledge base is not configured, the default value is 10. The actual number of results may be smaller after permission and filtering verification.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>The vector leg weight for WEIGHTED fusion. Valid values: 0 to 1. The keyword leg weight is 1 minus this value. If this parameter is omitted, the knowledge base configuration is used. If the knowledge base is not configured, the default value is 0.7.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7</p>
             */
            public Builder vectorWeight(Double vectorWeight) {
                this.vectorWeight = vectorWeight;
                return this;
            }

            public SearchKnowledgeBaseRequestBody build() {
                return new SearchKnowledgeBaseRequestBody(this);
            } 

        } 

    }
}
