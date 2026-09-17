// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SearchKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>SearchKnowledgeBaseRequest</p>
 */
public class SearchKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetadataFilter")
    @com.aliyun.core.annotation.Validation(maxLength = 8192)
    private String metadataFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 4096)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RankAlgorithm")
    private String rankAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rerank")
    private Boolean rerank;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankModel")
    private String rerankModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RrfK")
    private Integer rrfK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectorWeight")
    private Double vectorWeight;

    private SearchKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.metadataFilter = builder.metadataFilter;
        this.mode = builder.mode;
        this.namespace = builder.namespace;
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

    public static SearchKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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

    public static final class Builder extends Request.Builder<SearchKnowledgeBaseRequest, Builder> {
        private String catalog; 
        private String knowledgeBaseName; 
        private String metadataFilter; 
        private String mode; 
        private String namespace; 
        private String query; 
        private String rankAlgorithm; 
        private Boolean rerank; 
        private String rerankModel; 
        private Integer rrfK; 
        private Integer topK; 
        private Double vectorWeight; 

        private Builder() {
            super();
        } 

        private Builder(SearchKnowledgeBaseRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.metadataFilter = request.metadataFilter;
            this.mode = request.mode;
            this.namespace = request.namespace;
            this.query = request.query;
            this.rankAlgorithm = request.rankAlgorithm;
            this.rerank = request.rerank;
            this.rerankModel = request.rerankModel;
            this.rrfK = request.rrfK;
            this.topK = request.topK;
            this.vectorWeight = request.vectorWeight;
        } 

        /**
         * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListCatalogs to obtain the value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The name of the knowledge base. The name is unique within a namespace and is specified at creation time. It cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledge-base</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putQueryParameter("KnowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>Filters search results by document metadata. The value is a JSON expression tree. Nodes are classified into two types: logical nodes {&quot;AndAll&quot;: [child nodes...]} (all conditions must be met), {&quot;OrAll&quot;: [child nodes...]} (any condition must be met), or {&quot;NotAll&quot;: [child nodes...]} (none of the conditions must be met), which support arbitrary nesting; and leaf conditions {&quot;Key&quot;: field name, &quot;Operator&quot;: operator, &quot;Value&quot;: value}, where the In and NotIn operators use &quot;Values&quot;: [values...]. Valid values of Operator: Equals, NotEquals, In, NotIn, GreaterThan, GreaterThanOrEqual, LessThan, LessThanOrEqual (the last four range operators apply only to LONG, DOUBLE, or DATETIME fields), StartsWith, and StringContains (applies only to STRING fields). Fields must be declared in the knowledge base schema. The nesting depth cannot exceed 5, and the total number of leaf conditions cannot exceed 20. DATETIME field value format: ISO-8601 with time zone, yyyy-MM-dd HH:mm:ss, or yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AndAll&quot;: [{&quot;Key&quot;: &quot;env&quot;, &quot;Operator&quot;: &quot;In&quot;, &quot;Values&quot;: [&quot;prod&quot;, &quot;staging&quot;]}, {&quot;OrAll&quot;: [{&quot;Key&quot;: &quot;score&quot;, &quot;Operator&quot;: &quot;GreaterThan&quot;, &quot;Value&quot;: &quot;0.8&quot;}, {&quot;Key&quot;: &quot;owner&quot;, &quot;Operator&quot;: &quot;Equals&quot;, &quot;Value&quot;: &quot;alice&quot;}]}]}</p>
         */
        public Builder metadataFilter(String metadataFilter) {
            this.putQueryParameter("MetadataFilter", metadataFilter);
            this.metadataFilter = metadataFilter;
            return this;
        }

        /**
         * <p>The retrieval mode. KEYWORD indicates keyword retrieval. VECTOR indicates vector retrieval. HYBRID indicates hybrid retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListNamespaces to obtain the value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The query text. Both keyword retrieval and vector retrieval are based on this text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>How to configure event rules</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Optional. Overrides the fusion algorithm configured for the knowledge base for this request. This parameter takes effect only in hybrid search (HYBRID) mode. RRF indicates reciprocal rank fusion. WEIGHTED indicates weighted normalization fusion (used together with VectorWeight). If you set this parameter to WEIGHTED in keyword-only or vector-only mode, an InvalidParameter error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        public Builder rankAlgorithm(String rankAlgorithm) {
            this.putQueryParameter("RankAlgorithm", rankAlgorithm);
            this.rankAlgorithm = rankAlgorithm;
            return this;
        }

        /**
         * <p>Specifies whether to enable reranking for search results. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder rerank(Boolean rerank) {
            this.putQueryParameter("Rerank", rerank);
            this.rerank = rerank;
            return this;
        }

        /**
         * <p>Optional. Overrides the reranking model configured for the knowledge base for this request. This parameter takes effect when reranking is enabled (in all search modes). Valid values: qwen3-rerank, gte-rerank-v2, and qwen3-vl-rerank. If this parameter is not specified, the value configured for the knowledge base is used. If no value is configured, the default value qwen3-rerank is used. Score distributions differ across models and cannot be compared. Use the same model consistently for a given knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        public Builder rerankModel(String rerankModel) {
            this.putQueryParameter("RerankModel", rerankModel);
            this.rerankModel = rerankModel;
            return this;
        }

        /**
         * <p>Optional. Overrides the reciprocal rank fusion (RRF) parameter k configured for the knowledge base for this request. This parameter takes effect only in hybrid search (HYBRID) mode. The value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder rrfK(Integer rrfK) {
            this.putQueryParameter("RrfK", rrfK);
            this.rrfK = rrfK;
            return this;
        }

        /**
         * <p>The number of most relevant results to return. Default value: 10. Maximum value: 100.</p>
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
         * <p>Optional. The vector weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword weight equals 1 minus this value. If this parameter is not specified, the value configured for the knowledge base is used. If no value is configured, the default value 0.7 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        public Builder vectorWeight(Double vectorWeight) {
            this.putQueryParameter("VectorWeight", vectorWeight);
            this.vectorWeight = vectorWeight;
            return this;
        }

        @Override
        public SearchKnowledgeBaseRequest build() {
            return new SearchKnowledgeBaseRequest(this);
        } 

    } 

}
